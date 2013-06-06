package manticore.example.business.controllers;

import manticore.business.BusinessController;
import manticore.data.JAXBDataController;
import manticore.example.business.events.EventFired;

/**
 *
 * @author hector
 */
public class ExampleController extends BusinessController
{
    public ExampleController(JAXBDataController dataController)
    {
        super(dataController);
    }
    
    public void fireEvent()
    {
        // Business events are fired to notify changes to the presentation layer
        notify(new EventFired());
    }
}
