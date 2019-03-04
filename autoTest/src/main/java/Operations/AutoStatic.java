package Operations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class AutoStatic {
    private static Properties pro = new Properties();


    /*
    * run corresponding device os, as per setup the os type in the configuration file
    * */
    public static String osType(){
        prop();
        return pro.getProperty("os");
    }

    /*
    * ingesting the properties file
    * */
    private static void prop(){
        String path = "auto.properties";
        File file = new File(path);
        FileInputStream input;

        try{
            input = new FileInputStream(file);
            pro.load(input);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
