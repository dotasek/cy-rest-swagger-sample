package org.cytoscape.cyrestswaggersample.internal;

/*
 * This is the class returned by our JAX-RS annotated method. To be marshaled automatically into JSON, it needs to be 
 * a POJO (Plain Old Java Object) that follows some key Java Bean Conventions 
 * (https://en.wikipedia.org/wiki/JavaBeans#JavaBean_conventions).
 * 
 * 	It must have a default constructor 
 * 		public SimpleMessage() 
 * 	It must have properly formatted getters and setters for any properties 
 * 		for message, we have getMessage() and setMessage().
 *  
 *  Additionally, it must not contain loops in data structure. If, for example, SimpleMessage were to contain another 
 *  SimpleMessage as a property, this object couldn't be marshaled.
 * 
 * If these aren't followed, you will likely get the dreaded Internal Server Error when you access a resource URL that 
 * uses your object.
 */
public class SimpleMessage 
{
	String message;
	
	//Super important. Always have a default constructor for anything returned by a JAX-RS annotated method.
	public SimpleMessage()
	{
		
	}
	
	//Not necessary, but convenient.
	public SimpleMessage(String message)
	{
		this.message = message;
	}
	
	//Necessary to expose message
	public String getMessage()
	{
		return message;
	}
	
	//Necessary to expose message	
	public void setMessage(String message)
	{
		this.message = message;
	}
}
