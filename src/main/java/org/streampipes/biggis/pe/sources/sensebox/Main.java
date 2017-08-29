package org.streampipes.biggis.pe.sources.sensebox;

import org.streampipes.container.init.DeclarersSingleton;
import org.streampipes.container.standalone.init.StandaloneModelSubmitter;

public class Main extends StandaloneModelSubmitter {

    public static void main(String[] args) {
        DeclarersSingleton.getInstance()
                .add(new SenseboxSource());

        DeclarersSingleton.getInstance().setHostName(SenseboxConfig.INSTANCE.getHost());
        DeclarersSingleton.getInstance().setPort(SenseboxConfig.INSTANCE.getPort());
        new Main().init();
    }

}
