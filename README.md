# Template project for StreamPipes sources

This project contains some examples how sources in StreamPipes can be defined and a template that can be used to quickly build your own sources.
During development you can go to 'localhost:8085' and see if the description is correct.
For the deployment you can use docker. Build the project locally with the provided docker file and push the image on the server with a running StreamPipes instance.
Add your newly created sources service to the available endpoints in StreamPipes and install the sources.

## Project structure
The project currently has a source for some example vehicle information and a template stub that can be used to create new sources.

* samples
   * VehicleSource: Describes the producer for all vehicle streams
	 * VehiclePositionStream: Is a data stream that provides the current location of different vehicles.
	Example event:

	```javascript
	    {
	    	"timestamp": 1500540365,
	    	"plateNumber": "MC89",
	    	"latitude": 49.008085,
	    	"longitude": 8.403756
	    }
	```
* template
  * Is a template that can be extended to create your own source

