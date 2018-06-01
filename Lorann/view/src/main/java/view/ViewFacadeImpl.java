package view;

import java.util.Observable;

import javax.swing.JOptionPane;

/**
 * <h1>The Class ViewFacade provides a facade of the View component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class ViewFacadeImpl implements IViewFacade {

    /**
     * Instantiates a new view facade.
     */
    public ViewFacadeImpl(IOrderPerformer orderPerformer, Observable observable, ModelFacade modelFacade) {
        super();
    }

    /*
     * (non-Javadoc)
     * @see view.IView#displayMessage(java.lang.String)
     */
    @Override
    public final void displayMessage(final String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    public void closeAll() {
    	
    }
}
