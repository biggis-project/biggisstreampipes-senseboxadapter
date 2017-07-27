package org.streampipes.biggis.sources.sensebox;

import org.streampipes.model.impl.EventStream;
import org.streampipes.model.impl.graph.SepDescription;
import org.streampipes.model.vocabulary.Geo;
import org.streampipes.sdk.builder.DataStreamBuilder;
import org.streampipes.sdk.helpers.EpProperties;
import org.streampipes.sdk.helpers.Formats;
import org.streampipes.sdk.helpers.Protocols;
import org.streampipes.sources.AbstractAlreadyExistingStream;

public class SenseboxMeasurementsStream extends AbstractAlreadyExistingStream {

  @Override
  public EventStream declareModel(SepDescription sep) {
      return DataStreamBuilder.create("sensebox-measurements", "Sensebox Measurements", "An event stream " +
              "that produces current sensebox measurements")
              .property(EpProperties.timestampProperty("createdAt"))
              .property(EpProperties.stringEp("boxId", "http://my.company/plateNumber"))
              .format(Formats.jsonFormat())
              .protocol(Protocols.kafka("eurasier", 9092, "sensebox-measurements-unified"))
              .build();

  }
}
