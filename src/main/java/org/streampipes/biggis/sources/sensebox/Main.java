package org.streampipes.biggis.sources.sensebox;

import org.streampipes.container.init.DeclarersSingleton;
import org.streampipes.container.standalone.init.StandaloneModelSubmitter;

public class Main extends StandaloneModelSubmitter {

    public static void main(String[] args) {
        DeclarersSingleton.getInstance()
                .add(new SenseboxSource());

        DeclarersSingleton.getInstance().setPort(8085);
        new Main().init();
    }

}
