package Class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static String getProperty(String key) throws IOException {
        //1st step - location the file that we want to read.
        String path = "Files/Config.properties";

        //2nd step - navigating to that location
        FileInputStream fileInputStream = new FileInputStream(path);

        //special class which knows how to read the .properties file
        Properties properties = new Properties();
        //loading all the data from the file to properties object
        properties.load(fileInputStream);
        return properties.getProperty(key);




    }
}
