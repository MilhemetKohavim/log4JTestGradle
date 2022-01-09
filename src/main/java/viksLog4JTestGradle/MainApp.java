package viksLog4JTestGradle;
import org.apache.log4j.Logger;
import java.io.*;
import java.sql.SQLException;
import java.util.*;


	 
	
	

public class MainApp {

	 static Logger log = Logger.getLogger(MainApp.class.getName());
	 
	 
	public String sayHello() {
	      return "Hello Gradle";
	   }

	   public static void main(String[] args) {
	      MainApp app = new MainApp();
	      System.out.println(app.sayHello());
	      
	      
	      String password="123";
	      log.info("this is a LOG4J info dynamic message: ");     
		  System.out.println ("---------------this is a regular out.println static message-----------");

	   }

}
