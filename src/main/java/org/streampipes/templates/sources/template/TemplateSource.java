package org.streampipes.templates.sources.template;

import org.streampipes.container.declarer.EventStreamDeclarer;
import org.streampipes.container.declarer.SemanticEventProducerDeclarer;
import org.streampipes.model.impl.graph.SepDescription;
import org.streampipes.sdk.builder.DataSourceBuilder;

import java.util.Arrays;
import java.util.List;

public class TemplateSource implements SemanticEventProducerDeclarer {

    /*
        TUTORIAL:
        Here you can change the description of the event producer
     */
    @Override
    public SepDescription declareModel() {
        return DataSourceBuilder.create("template-source", "Template Source", "This is a " +
                "template to build your first StreamPipes source")
                .build();

    }

    /*
        TUTORIAL:
        Here you have to register all the streams belonging to this source
        If you do not register the source here you can not see it in the web browser
     */
    @Override
    public List<EventStreamDeclarer> getEventStreams() {
        return Arrays.asList(new TemplateStream());
    }

}
