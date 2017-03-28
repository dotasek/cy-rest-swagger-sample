package org.cytoscape.cyrestswaggersample.internal;


public class GreetingResourceImpl implements GreetingResource
{
    public SimpleMessage greeting()
    {
    	  return new SimpleMessage("Hello!");
    }
}