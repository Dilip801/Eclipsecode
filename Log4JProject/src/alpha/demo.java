package alpha;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class demo {

	private static Logger log= LogManager.getLogger(demo.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		log.debug("I'm debugging");
		log.info("All objects are present");
		log.error("Button is not displayed");
		log.fatal("Button is Missing");
	}
	

}
