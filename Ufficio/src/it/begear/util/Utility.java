package it.begear.util;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Logger;

public final class Utility {
	
	private static Logger mioLogger = Logger.getLogger("RootLogger");
	
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
