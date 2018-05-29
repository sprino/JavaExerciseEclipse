package it.begear.util;


import java.io.IOException;
import java.util.Scanner;

import org.apache.log4j.Logger;


public final class Utility {
	
//	private static Logger mioLogger = Logger.getLogger("RootLogger");
//	private static Logger mioLogger = Logger.getLogger(Utility.class);

	
	private static Logger mioLogger = Logger.getLogger(Utility.class.getName());
	
	//Insert Scanner Method
	public static Scanner insert() {
		
		Scanner insert = new Scanner(System.in);
		return insert;
	
	}
	
	//System Pause method
	public static void pause() throws IOException {
		
		System.out.println("Premi un tasto per tornare al menu principale");
		System.in.read();
	
	}
	
	//Logger method
	public static Logger mioLogger() {
		return mioLogger;
	}

}
