package ua.lviv.lgs;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class LoggerFile {
	public static Logger LOG = Logger.getLogger(LoggerFile.class);
	
	public static void main(String[] args) {
		logWithDOMConfigurator();
	}
	
	public static void logWithDOMConfigurator() {
		DOMConfigurator.configure("loggerConfig.xml");
		LOG.trace("TRACE Logger message of project");
		LOG.debug("DEBUG Logger message of project");
		LOG.info("INFO Logger message of project");
		LOG.warn("WARN Logger message of project");
		LOG.error("ERROR Logger message of project");
		LOG.fatal("FATAL Logger message of project");
	}
}
