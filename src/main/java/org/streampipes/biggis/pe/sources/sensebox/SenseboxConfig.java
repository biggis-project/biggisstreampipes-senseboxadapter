package org.streampipes.biggis.pe.sources.sensebox;

import org.streampipes.config.SpConfig;

/**
 * Created by Jochen Lutz on 2017-08-29.
 */
public enum SenseboxConfig {
    INSTANCE;

    private SpConfig config;
    private final static String HOST = "host";
    private final static String PORT = "port";
    private final static String KAFKA_HOST = "kafka_host";
    private final static String KAFKA_PORT = "kafka_port";
    private final static String ZOOKEEPER_HOST = "zookeeper_host";
    private final static String ZOOKEEPER_PORT = "zookeeper_port";
    private final static String KAFKA_TOPIC = "kafka_topic";

    public final static String serverUrl;
    public final static String iconBaseUrl;

    SenseboxConfig() {
        config = SpConfig.getSpConfig("pe/org.streampipes.biggis.pe.sources.sensebox");
        config.register(HOST, "sensebox-adapter", "Hostname for the sensebox source integration");
        config.register(PORT, 8090, "Port for the sensebox source integration");
        config.register(KAFKA_HOST, "kafka", "Host for kafka of the pe sinks project");
        config.register(KAFKA_PORT, 9092, "Port for kafka of the pe sinks project");
        config.register(ZOOKEEPER_HOST, "zookeeper", "Host for zookeeper of the pe sinks project");
        config.register(ZOOKEEPER_PORT, 2181, "Port for zookeeper of the pe sinks project");
        config.register(KAFKA_TOPIC, "sensebox-measurements-unified", "The kafka topic where the sensebox measurements are published");
    }

    static {
        serverUrl = SenseboxConfig.INSTANCE.getHost() + ":" + SenseboxConfig.INSTANCE.getPort();
        iconBaseUrl = SenseboxConfig.INSTANCE.getHost() + ":" + SenseboxConfig.INSTANCE.getPort() +"/img";
    }

    public String getHost() {
        return config.getString(HOST);
    }

    public int getPort() {
        return config.getInteger(PORT);
    }

    public String getKafkaHost() {
        return config.getString(KAFKA_HOST);
    }

    public int getKafkaPort() {
        return config.getInteger(KAFKA_PORT);
    }

    public String getKafkaUrl() {
        return getKafkaHost() + ":" + getKafkaPort();
    }

    public String getZookeeperHost() {
        return config.getString(ZOOKEEPER_HOST);
    }

    public int getZookeeperPort() {
        return config.getInteger(ZOOKEEPER_PORT);
    }

    public String getKafkaTopic() {
        return config.getString(KAFKA_TOPIC);
    }

}
