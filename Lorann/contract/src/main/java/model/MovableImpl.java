package model;

import java.sql.SQLException;
import java.util.List;

/**
 * <h1>The Class Example.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class MovableImpl implements IModelFacade {

	private final int Level;
    /** The id. */
    private final int Pos_X;
    
    private final int Pos_Y;

    /** The name. */
    private String    Object;

    /**
     * Instantiates a new example.
     *
     * @param id
     *            the id
     * @param name
     *            the name
     */
    public MovableImpl(final int Level, final int Pos_X, final int Pos_Y, final String Object) {
        super();
        this.Level = Level;
        this.Pos_X = Pos_X;
        this.Pos_Y = Pos_Y;
        this.Object = Object;
    }

    /**
     * Gets the id.
     *
     * @return the id
     */
    public int getLevel() {
        return this.Level;
    }
    
    public int getPos_X() {
        return this.Pos_X;
    }
    
    public int getPos_Y() {
        return this.Pos_Y;
    }

    /**
     * Gets the name.
     *
     * @return the name
     */
    public String getObject() {
        return this.Object;
    }

    /**
     * Sets the name.
     *
     * @param name
     *            the new name
     */
    public void setObject(final String Object) {
        this.Object = Object;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return this.getLevel() + this.getPos_X() + this.getPos_Y() + " : " + this.getObject();
    }

	@Override
	public MovableImpl getElementByNumberAndPosition(int Level, int Pos_X, int Pos_Y) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MovableImpl getExampleByName(String name) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MovableImpl> getAllExamples() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
}
