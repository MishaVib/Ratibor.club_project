package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:config/${client}.properties",
})
public interface ProjectConfig extends Config {

    String client();
    String type();

    @DefaultValue("https://shashlik.club")
    String baseUrl();

    @DefaultValue("chrome")
    String browser();

    @DefaultValue("101.0")
    String browserVersion();

    @DefaultValue("1920x1080")
    String browserSize();


    String remoteDriverUrl();

    String videoStorage();
}
