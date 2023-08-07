import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        try {
            PropertiesConfiguration propertiesConfiguration = new PropertiesConfiguration();
            propertiesConfiguration.load("application.properties");
            String databasePassword = propertiesConfiguration.getString("database.password");
            String databaseUsername = propertiesConfiguration.getString("database.username");
            String randomField = propertiesConfiguration.getString("somerandomfield");
            String appName = propertiesConfiguration.getString("app.name");
            Long anotherNumber = Long.parseLong(propertiesConfiguration.getString("anothernumber"));

            System.out.println(databasePassword + " : " + databaseUsername);
            System.out.println("random field : " + randomField);
            System.out.println("app name : " + appName);
           // this.doSomethingWithValues(databaseUsername, databasePassword);
        } catch (ConfigurationException exception) {
            exception.printStackTrace();
        }
        setupConnection();
    }

    static void setupConnection() {
        PropertiesManager propertiesManager = new PropertiesManager();

        String username = propertiesManager.getPropertyByName("database.username");
        String password = propertiesManager.getPropertyByName("database.password");

        // do something with values
        System.out.println(username + " - " + password);

    }
}
