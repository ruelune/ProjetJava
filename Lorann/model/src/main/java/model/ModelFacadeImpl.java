package model;

import java.sql.SQLException;
import java.util.List;

import model.dao.MovableImplDAO;

/**
 * <h1>The Class ModelFacade provides a facade of the Model component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public final class ModelFacadeImpl implements ModelFacade, Element {

    /**
     * Instantiates a new model facade.
     */
    public ModelFacadeImpl() {
        super();
    }

    /*
     * (non-Javadoc)
     * @see model.IModel#getExampleById(int)
     */
    public MovableImpl getElementByNumberAndPosition(int Level, int Pos_X, int Pos_Y) throws SQLException {
        return MovableImplDAO.getLevelByNumber(Level);
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

	@Override
	public void hit() {
		// TODO Auto-generated method stub
		
	}

}
