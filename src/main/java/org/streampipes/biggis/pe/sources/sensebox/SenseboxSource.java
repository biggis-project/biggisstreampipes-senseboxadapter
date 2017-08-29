package org.streampipes.biggis.pe.sources.sensebox;

import org.streampipes.container.declarer.EventStreamDeclarer;
import org.streampipes.container.declarer.SemanticEventProducerDeclarer;
import org.streampipes.model.impl.graph.SepDescription;
import org.streampipes.sdk.builder.DataSourceBuilder;

import java.util.Arrays;
import java.util.List;


public class SenseboxSource implements SemanticEventProducerDeclarer {

  public SepDescription declareModel() {
    return DataSourceBuilder.create("source-sensebox", "Sensebox Source", "A data source that " +
            "holds event streams produced by Senseboxes.")
            .build();
  }

  public List<EventStreamDeclarer> getEventStreams() {
    return Arrays.asList(new SenseboxMeasurementsStream());
  }
}
