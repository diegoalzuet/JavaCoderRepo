package log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Message {
	final static Logger logger = LogManager.getLogger(Message.class);
	
	public void getLogError(String parameter) {
		logger.error("Error: " + parameter);
		
	}
	public void getLogFata(String parameter) {
		logger.fatal("Fatal: " + parameter);
	}

}
