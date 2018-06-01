package main;

import java.sql.SQLException;

import controller.ControllerFacade;
import controller.ControllerFacadeImpl;
import model.ModelFacade;
import model.ModelFacadeImpl;
import view.ViewFacade;
import view.ViewFacadeImpl;

/**
 * <h1>The Class Main.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public abstract class Main {

    /**
     * The main method.
     *
     * @param args
     *            the arguments
     */
    public static void main(final String[] args) {
        final ControllerFacadeImpl controller = new ControllerFacadeImpl(new ViewFacadeImpl(), new ModelFacadeImpl());

        try {
            controller.launchLevel(1);
        } catch (final SQLException exception) {
            exception.printStackTrace();
        }
    }

}
