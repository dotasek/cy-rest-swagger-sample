# CyREST Sample App with Swagger

This is a simple 'Hello World' style app intended to demonstrate registering endpoints with CyREST.

## Prerequisites

It is recommended to be familiar with concepts in [Cytoscape 3.0 App Development](http://wiki.cytoscape.org/Cytoscape_3/AppDeveloper).

## Notes

This sample app uses Java comments to describe particular details in-code. General project setup and an overview of key points is provided below.

### Verifying CyREST

The CyREST App must be installed in Cytoscape and should be version 3.4 or above. You can check the version of the App via the Cytoscape App Manager.

When Cytoscape is run, you can verify that CyREST is functioning by visiting its root resource in your web browser, which should give you a list of available REST APIs:

```
http://localhost:1234/
```

By default, CyREST and this documentation use TCP/IP port 1234. Running Cytoscape with the \-R option allows a custom port, such as below:

Linux/Mac
```
./cytoscape.sh -R 8888
```
Windows

```
./cytoscape.bat -R 8888
```

If you are using a custom port, please keep this in mind where port 1234 is used in this documentation.

### Maven Dependencies

CyREST uses two related annotation packages to describe endpoints: JAX-RS and Swagger.

Within your POM files, you will need to add these two dependencies. It is important that you set the scope for these dependencies to 'provided'. This ensures that CyREST and your App are using the same annotations; using a scope aside from 'provided' could cause your App to import annotations that CyREST cannot recognize.

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

### Adding Endpoints to CyREST

To add an endpoint to CyREST, you must register an instance of a Java Object that has methods annotated using JAX-RS.

In this Sample App, all the necessary classes to illustrate this, with inline documentation explaining the annotations used, can be found in the package ```org.cytoscape.cyrestswaggersample.internal``` 

The ```GreetingResource``` interface contains our JAX-RS annotations, which its implementation, ```GreetingResourceImpl```, inherits.

We register an instance of ```GreetingResourceImpl``` in ```CyActivator```. This exposes the resource to Cytoscape's OSGi infrastructure, where it can be recognized by CyREST. The resulting endpoint will be available at ```localhost:1234/swaggergreeting```. You can see the output of this endpoint by entering this address into a web browser.

### Adding Swagger Documentation

GreetingResource includes a single Swagger tag ```@Api```. This is the minimum requirement for including a class and its methods in Swagger. Swagger can introspect your classes and methods to automatically generate documentation, but 

## Next Steps

You can see some more uses and of JAX-RS and Swagger for Cytoscape in the [CyREST Best Practices Sample App](https://github.com/dotasek/cyrest-best-practices-sample).

JAX-RS and Swagger annotations provide functionality well beyond their use in this app. Additional documentation on these can be found below:

[JAX-RS Application, Resources and Sub-Resources](https://jersey.java.net/documentation/latest/jaxrs-resources.html)
[Swagger Annotations](https://github.com/swagger-api/swagger-core/wiki/Annotations-1.5.X)



