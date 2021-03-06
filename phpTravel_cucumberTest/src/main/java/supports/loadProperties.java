package supports;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
/**
 * Class is used to load the values/properties from the configuration file
 * 
 * @return returns the value for the key from the config file
 * 
 * @author SuryaRay
 */
public class loadProperties {
	
	public static String googleUrl = "";
	public static String phpTravelUrl = "";
	static Properties prop = new Properties();
	
	static {
		try {
			loadProp();
		}catch (Exception e) {
			e.printStackTrace();
		}
	} 
	
	public static void loadProp() { 
		try {
			File file = new File("src//test//resources//appConfig.properties");
			FileInputStream fileInput = new FileInputStream(file);
			prop.load(fileInput);
			
			googleUrl = prop.getProperty("googleurl");
			phpTravelUrl = prop.getProperty("phptravelurl");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static String get(String value) {
		return prop.getProperty(value.toLowerCase());
	}
}
