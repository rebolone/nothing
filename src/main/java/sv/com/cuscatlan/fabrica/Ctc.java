package sv.com.cuscatlan.fabrica;

/**
 * Hello world!
 *
 */
public class Ctc 
{
	
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";
	
    public static void main( String[] args )
    {
    	Character caracter = '*';
    	String separador = caracter.toString().repeat(80);
    
    	System.out.println(ANSI_YELLOW);
    	System.out.println(separador);
    	System.out.println(caracter + "                   B A N C O   C U S C A T L A N ");
    	System.out.println(caracter + "                         Fabrica Digital ");
    	System.out.println(separador);
    	System.out.println(ANSI_RESET);
    	System.out.println("Iniciando Verificación de Conectividad....");
        
    }
}
