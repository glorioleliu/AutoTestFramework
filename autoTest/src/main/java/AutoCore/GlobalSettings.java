package AutoCore;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class GlobalSettings {
    public static Properties properties = getProperties();


    public static Properties getProperties(){
        Properties prop = new Properties();
        File file = new File("auto.properties");
        FileInputStream input;

        try{
            input = new FileInputStream(file);
            prop.load(input);
        }catch(Exception e){
            System.out.println(e);
        }

        return prop;
    }
}
