package controller;

import java.sql.SQLException;
import java.util.List;

import model.IModelFacade;
import model.MovableImpl;
import view.IViewFacade;



/**
 * <h1>The Class ControllerFacade provides a facade of the Controller component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class ControllerFacadeImpl implements IViewFacade, IModelFacade, IControllerFacade {

    /** The view. */
    private final ViewFacadeImpl  view;

    /** The model. */
    private final ModelFacadeImpl model;

    /**
     * Instantiates a new controller facade.
     *
     * @param view
     *            the view
     * @param model
     *            the model
     */
    public ControllerFacadeImpl(final ViewFacadeImpl view, final ModelFacadeImpl model) {
        super();
        this.view = view;
        this.model = model;
    }

    /**
     * Start.
     *
     * @throws SQLException
     *             the SQL exception
     */
    public void launchLevel(int level) throws SQLException {
        this.getView().displayMessage(this.getModel().getExampleById(1).toString());

        this.getView().displayMessage(this.getModel().getExampleByName("Example 2").toString());

        final List<Example> examples = this.getModel().getAllExamples();
        final StringBuilder message = new StringBuilder();
        for (final Example example : examples) {
            message.append(example);
            message.append('\n');
        }
        this.getView().displayMessage(message.toString());
    }

    /**
     * Gets the view.
     *
     * @return the view
     */
    public ViewFacadeImpl getView() {
        return this.view;
    }

    /**
     * Gets the model.
     *
     * @return the model
     */
    public ModelFacadeImpl getModel() {
        return this.model;
    }
    
    public void orderPerform(UserOrderImpl userOrder) {
    	
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

	@Override
	public void displayMessage(String message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeAll() {
		// TODO Auto-generated method stub
		
	}


	
}
