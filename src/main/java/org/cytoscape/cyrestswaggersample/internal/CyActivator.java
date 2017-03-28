package org.cytoscape.cyrestswaggersample.internal;


import org.osgi.framework.BundleContext;
import java.util.Properties;

import org.cytoscape.service.util.AbstractCyActivator;

public class CyActivator extends AbstractCyActivator {
	
	public CyActivator() 
	{
		super();
	}
	
	public void start(BundleContext bc) 
	{
		System.out.println("CyREST Sample start");
		try {
			registerService(bc, new GreetingResourceImpl(), GreetingResource.class, new Properties());
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("CyREST Sample registerService complete");
	}
}

