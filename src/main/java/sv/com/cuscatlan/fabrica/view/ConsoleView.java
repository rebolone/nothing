package sv.com.cuscatlan.fabrica.view;

import java.io.PrintStream;

public class ConsoleView {
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";
	
	 public static void showHeaders(PrintStream out) {
	    	Character caracter = '*';
	    	String separador = caracter.toString().repeat(80);
	    
	    	out.println(ANSI_YELLOW);
	    	out.println(separador);
	    	out.println(caracter + "                   B A N C O   C U S C A T L A N ");
	    	out.println(caracter + "                         Fabrica Digital ");
	    	out.println(separador);
	    	out.println(ANSI_RESET);
	    	
	    }
}
