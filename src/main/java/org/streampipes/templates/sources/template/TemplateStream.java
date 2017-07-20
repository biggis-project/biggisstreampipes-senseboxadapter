package org.streampipes.templates.sources.template;

import org.streampipes.model.impl.EventStream;
import org.streampipes.model.impl.graph.SepDescription;
import org.streampipes.sdk.builder.DataStreamBuilder;
import org.streampipes.sdk.helpers.Formats;
import org.streampipes.sdk.helpers.Protocols;
import org.streampipes.sources.AbstractAlreadyExistingStream;

public class TemplateStream extends AbstractAlreadyExistingStream {

    @Override
    public EventStream declareModel(SepDescription sepDescription) {
        return DataStreamBuilder.create("template-stream", "Template Stream", "This is the " +
                "example stream from the tutorial")

                /*
                    TUTORIAL:
                    Add here the properties of the event schema
                    Example:
                        '.property(EpProperties.timestampProperty("timestamp"))'
                 */

              .format(Formats.jsonFormat())

                /*
                    TUTORIAL:
                    Change the kafka host, port and topic
                 */
              .protocol(Protocols.kafka("kafkaHost", 9092, "example.topic"))
              .build();
    }
}
