package beta;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class demo1 {
	private static Logger log= LogManager.getLogger(demo1.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		log.debug("I'm in debugging mode");
		log.info("All objects and elements are displayed");
		log.error("Dropdown is not displayed");
		log.fatal("Dropdown is Missing");
	}

}
