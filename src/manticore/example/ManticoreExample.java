package manticore.example;

import manticore.Application;
import manticore.data.DataController;
import manticore.data.JAXBDataController;
import manticore.example.business.controllers.ExampleController;
import manticore.example.presentation.swing.MainFrame;
import manticore.presentation.PresentationController;
import manticore.presentation.SwingController;

/**
 *
 * @author hector
 */
public class ManticoreExample
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // Create a new Application
        Application app = new Application();
        
        // Set the data controller
        JAXBDataController dataController = new DataController();
        app.setDataController(dataController);
        
        // Add business controllers
        app.addBusiness(ExampleController.class);
        
        // Add presentation controllers
        PresentationController swingController = new SwingController(MainFrame.class);
        app.addPresentation(swingController);
        
        // Run application
        app.init();
    }
}
