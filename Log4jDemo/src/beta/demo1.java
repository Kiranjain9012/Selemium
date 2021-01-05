package beta;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class demo1 {
	
	private static Logger Log = LogManager.getLogger(demo1.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Log.debug("Log debug");
		Log.info("Log info");
		Log.error("Log Error");
		Log.fatal("Log fatal");
		

	}

}
