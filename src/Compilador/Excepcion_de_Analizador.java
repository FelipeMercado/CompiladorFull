package Compilador;

public class Excepcion_de_Analizador extends Exception
{
	private static final long serialVersionUID = 1L;
	
	public Excepcion_de_Analizador(String mensaje)
	{
		super(mensaje);
	}
	
	public Excepcion_de_Analizador(String token, String mensaje)
	{
		super(mensaje+" '"+token+"'");
	}
	
}
