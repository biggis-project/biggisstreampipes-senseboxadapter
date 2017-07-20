# Template project for StreamPipes sources

This project contains some examples how sources in StreamPipes can be defined and a template that can be used to quickly build your own sources.
During development you can go to 'localhost:8085' and see if the description is correct.

## Project structure
The project currently has a source for some example vehicle information and a template stub that can be used to create new sources.

* samples
   * VehicleSource: Describes the producer for all vehicle streams
	 * VehiclePositionStream: Is a data stream that provides the current location of different vehicles.

	```javascript
	// 	Example event:
	    {
	    	"timestamp": 1500540365,
	    	"plateNumber": "MC89",
	    	"latitude": 49.008085,
	    	"longitude": 8.403756
	    }
	```
* template
  * Is a template that can be extended to create your own source

## Deployment
For the deployment you can use docker. 
First build the project with Maven and then use the provided Dockerfile to build an image. 
Push the image on the server with a running StreamPipes instance and start a container.
Add your newly created sources service to the available endpoints in StreamPipes and install the sources.
