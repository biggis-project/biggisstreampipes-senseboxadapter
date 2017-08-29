package org.streampipes.biggis.pe.sources.sensebox;

import org.streampipes.model.impl.EventStream;
import org.streampipes.model.impl.KafkaTransportProtocol;
import org.streampipes.model.impl.graph.SepDescription;
import org.streampipes.model.vocabulary.Geo;
import org.streampipes.sdk.builder.DataStreamBuilder;
import org.streampipes.sdk.helpers.EpProperties;
import org.streampipes.sdk.helpers.Formats;
import org.streampipes.sdk.helpers.Protocols;
import org.streampipes.sources.AbstractAlreadyExistingStream;
import org.streampipes.config.backend.BackendConfig;

public class SenseboxMeasurementsStream extends AbstractAlreadyExistingStream {

  @Override
  public EventStream declareModel(SepDescription sep) {
      return DataStreamBuilder.create("sensebox-measurements", "Sensebox Measurements", "An event stream " +
              "that produces current sensebox measurements")
              .property(EpProperties.timestampProperty("createdAt"))
              .property(EpProperties.stringEp("boxId", "http://schema.org/id"))
              .property(EpProperties.doubleEp("temperature", "http://schema.org/temperature"))
              .property(EpProperties.doubleEp("humidity", "http://schema.org/humidity"))
              .property(EpProperties.doubleEp("pressure", "http://schema.org/pressure")) //TODO: sinnvolle Typen abklären
              .property(EpProperties.doubleEp("temperatureInternal", "http://schema.org/temperature"))
              .property(EpProperties.doubleEp("lux", "http://schema.org/luminosity"))
              .property(EpProperties.doubleEp("uv", "http://schema.org/radiation"))
              .format(Formats.jsonFormat())
              .protocol(Protocols.kafka(SenseboxConfig.INSTANCE.getKafkaHost(), SenseboxConfig.INSTANCE.getKafkaPort(), "sensebox-measurements-unified"))//TODO: topic in Consul
              .build();
  }
}
