package util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;


public class StartCreateFilesConnection {

	private final static String SOCKET_NAME1 = "KNAPPMT";

	public static void main(String[] args) {

		Properties socketProperties = new Properties();
		socketProperties.setProperty("IP_KNAPP", "127.0.0.1");
		socketProperties.setProperty("PORT_KNAPP", "2001");
		createDataFile(SOCKET_NAME1, "properties", socketProperties);
	}

	private static void createDataFile(String name, String suffix, Properties properties) {
		try {
			properties.store(new FileOutputStream(new File(name + "." + suffix), false), ".::SETTINGS::.");

		} catch (FileNotFoundException e) {
			throw new RuntimeException("Unable to create the destination file " + name + "." + suffix, e);
		} catch (IOException e) {
			throw new RuntimeException("Unable to create the destination file " + name + "." + suffix, e);
		}
	}
}
