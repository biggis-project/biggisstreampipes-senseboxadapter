package org.streampipes.templates.sources.samples;

import org.streampipes.container.declarer.EventStreamDeclarer;
import org.streampipes.container.declarer.SemanticEventProducerDeclarer;
import org.streampipes.model.impl.graph.SepDescription;
import org.streampipes.sdk.builder.DataSourceBuilder;

import java.util.Arrays;
import java.util.List;


public class VehicleSource implements SemanticEventProducerDeclarer {

  public SepDescription declareModel() {
    return DataSourceBuilder.create("source-vehicle", "Vehicle Source", "A data source that " +
            "holds event streams produced by vehicles.")
            .build();
  }

  public List<EventStreamDeclarer> getEventStreams() {
    return Arrays.asList(new VehiclePositionStream());
  }
}
