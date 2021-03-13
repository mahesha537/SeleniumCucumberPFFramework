package Configuration;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import static Configuration.Constants.CONFIG_FILE_PATH;
import static Configuration.Globalparameters.*;

public class ConfigFileReader {
    static Properties properties = new Properties();
    public static void readProperties() throws IOException {
        InputStream inputStream = new FileInputStream(CONFIG_FILE_PATH);
        properties.load(inputStream);
        portNumber = properties.getProperty("portNumber=4546");
    }
}
