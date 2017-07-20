package org.streampipes.templates.sources;

import org.streampipes.container.init.DeclarersSingleton;
import org.streampipes.container.standalone.init.StandaloneModelSubmitter;
import org.streampipes.templates.sources.samples.VehicleSource;
import org.streampipes.templates.sources.template.TemplateSource;

/*
    TUTORIAL:
    This is the main class of the examples sources project.
    Here you must register all the event producers. A producer is a collection of different streams.
    The main method starts a web server that provides all the descriptions of the registered
    producers and their streams.
 */
public class ExampleSourcesInit extends StandaloneModelSubmitter {

    public static void main(String[] args) {

        /*
            TOTORIAL:
            Add the newly created event producer to the declarer singleton
         */
        DeclarersSingleton.getInstance()
                .add(new VehicleSource())
                .add(new TemplateSource());
        /*
            TOTORIAL:
            First a port for the service is set and then the server is started
         */
        DeclarersSingleton.getInstance().setPort(8085);
        new ExampleSourcesInit().init();
    }

}
