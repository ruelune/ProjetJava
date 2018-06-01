package model.dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Example;
import model.MovableImpl;

/**
 * <h1>The Class ExampleDAO.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public abstract class MovableImplDAO extends AbstractDAO {

    /** The sql example by id. */
    private static String sqlLevelByNumber   = "{call findLevelByNumber(?)}";

    /** The sql example by name. */
    private static String sqlExampleByName = "{call findExampleByName(?)}";

    /** The sql all examples. */
    private static String sqlAllExamples   = "{call findAllExamples()}";

    /** The id column index. */
    private static int    idColumnIndex    = 1;

    /** The name column index. */
    private static int    nameColumnIndex  = 2;

    /**
     * Gets the example by id.
     *
     * @param id
     *            the id
     * @return the example by id
     * @throws SQLException
     *             the SQL exception
     */
    public static MovableImpl getLevelByNumber(final int Level) throws SQLException {
        final CallableStatement callStatement = prepareCall(sqlLevelByNumber);
        MovableImpl example = null;
        callStatement.setInt(1, Level);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();
            if (result.first()) {
                example = new MovableImpl(result.getInt(idColumnIndex), result.getInt(Level), Level, result.getString(nameColumnIndex));
            }
            result.close();
        }
        return example;
    }

    /**
     * Gets the example by name.
     *
     * @param name
     *            the name
     * @return the example by name
     * @throws SQLException
     *             the SQL exception
     */
    public static MovableImpl getExampleByName(final String name) throws SQLException {
        final CallableStatement callStatement = prepareCall(sqlExampleByName);
        MovableImpl example = null;

        callStatement.setString(1, name);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();
            if (result.first()) {
                example = new MovableImpl(result.getInt(idColumnIndex), idColumnIndex, idColumnIndex, result.getString(nameColumnIndex));
            }
            result.close();
        }
        return example;
    }

    /**
     * Gets the all examples.
     *
     * @return the all examples
     * @throws SQLException
     *             the SQL exception
     */
    public static List<MovableImpl> getAllExamples() throws SQLException {
        final ArrayList<MovableImpl> examples = new ArrayList<MovableImpl>();
        final CallableStatement callStatement = prepareCall(sqlAllExamples);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();

            for (boolean isResultLeft = result.first(); isResultLeft; isResultLeft = result.next()) {
                examples.add(new MovableImpl(result.getInt(idColumnIndex), idColumnIndex, idColumnIndex, result.getString(nameColumnIndex)));
            }
            result.close();
        }
        return examples;
    }
}
