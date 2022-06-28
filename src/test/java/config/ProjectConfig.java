package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "classpath:config/${configure}.properties"
        //"classpath:config/credentials.properties",
       //"classpath:config/local.properties",
       // "classpath:config/remote.properties"
})

public interface ProjectConfig extends Config {
        @DefaultValue("chrome")
        String browser();

        @DefaultValue("100.0")
        String browserVersion();

        @DefaultValue("1920x1080")
        String browserSize();

        String remoteDriverUrl();

        String videoStorage();

        int timeoutVideoAttach();

        int  timeout();
}

