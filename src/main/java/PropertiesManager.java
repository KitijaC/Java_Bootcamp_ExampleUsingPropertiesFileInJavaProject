import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

public class PropertiesManager {
    private PropertiesConfiguration propertiesConfiguration = new PropertiesConfiguration();

    public PropertiesManager(){
        this.loadProperties();
    }

    private void loadProperties() {
        try {
            this.propertiesConfiguration.load("application.properties");
        } catch(ConfigurationException exception) {
            exception.printStackTrace();
        }
    }

    public String getPropertyByName(String name) {
        return propertiesConfiguration.getString(name);
    }
}
