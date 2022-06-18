package sv.com.cuscatlan.fabrica.view;

import java.io.PrintStream;

import sv.com.cuscatlan.fabrica.domain.Resultado;

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
	private PrintStream out;
	
	public ConsoleView(PrintStream out) {
		 this.out = out;
	}
	
	 public void showHeaders() {
	    	Character caracter = '*';
	    	String separador = caracter.toString().repeat(80);
	    
	    	out.println(ANSI_YELLOW);
	    	out.println(separador);
	    	out.println(caracter + "                   B A N C O   C U S C A T L A N ");
	    	out.println(caracter + "                         Fabrica Digital ");
	    	out.println(separador);
	    	out.println(ANSI_RESET);
	    	out.println("Iniciando Verificación de Conectividad....");
	    	out.println("");
	    	
	    }
	 
	 public void showError(String mensaje) {
		 out.print(ANSI_RED);
      	 out.print("Error -->");
	     out.print(ANSI_RESET);
	     out.print(mensaje);
	 }
	 
	 public void showSuccess(String mensaje) {
		 out.print(ANSI_GREEN);
      	 out.print("Exito -->");
	     out.print(ANSI_RESET);
	     out.print(mensaje);
	 }
	 public void showText(String mensaje) {
      	 out.println(mensaje);
	 }
	 
	 public void showResult(Resultado resultado) {
		 if(resultado.isSuccess()) showSuccess(resultado.getMensaje());
		 else showError(resultado.getMensaje());
		 out.println();
		 out.println();
	 }
}
