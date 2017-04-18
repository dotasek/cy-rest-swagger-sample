# CyREST Sample App with Swagger

This is a simple 'Hello World' style app intended to demonstrate registering endpoints with CyREST.

# Necessary Dependencies

Within your POM files, you will need to add two dependencies. It is important that you set the scope for these dependencies to 'provided'. This ensures that CyREST and your App are using the same annotations; using a scope aside from 'provided' could cause your App to import annotations that CyREST cannot recognize.

This is the dependency for JAX-RS annotations:
```
    <dependency>
		<groupId>javax.ws.rs</groupId>
		<artifactId>javax.ws.rs-api</artifactId>
		<version>2.0</version>
		<scope>provided</scope>
	</dependency>
```

This is the dependency for Swagger annotations:

```
    <dependency>
		<groupId>io.swagger</groupId>
		<artifactId>swagger-annotations</artifactId>
		<version>1.5.7</version>
		<scope>provided</scope>
	</dependency>
```

# Adding Endpoints to CyREST

To add an endpoint to CyREST, you must register an instance of a Java Object that has methods annotated using JAX-RS.

In this Sample App, all the necessary classes to illustrate this, with inline documentation explaining the annotations used, can be found in the package ```org.cytoscape.cyrestswaggersample.internal``` 

The ```GreetingResource``` interface contains our JAX-RS annotations, which its implementation, ```GreetingResourceImpl```, inherits.

We register an instance of ```GreetingResourceImpl``` in ```CyActivator```. This exposes the resource to Cytoscape's OSGi infrastructure, where it can be recognized by CyREST. The resulting endpoint will be available at ```localhost:port/swaggergreeting```.

The example in this Sample App is very simple; JAX-RS provides a great deal of functionality beyond this. An execellent resource on building endpoints with JAX-RS can be found [here](https://jersey.java.net/documentation/latest/jaxrs-resources.html).

# Adding Swagger Documentation

GreetingResource includes a single Swagger tag ```@Api```. This is the minimum requirement for including a class and its methods in Swagger. Swagger can introspect your classes and methods to automatically generate documentation, but far richer documentation can be achieved with the whole set of Swagger annotations, which can be found [here](https://github.com/swagger-api/swagger-core/wiki/Annotations-1.5.X).
