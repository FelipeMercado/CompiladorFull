package Compilador;

public class Excepciones_Semanticas  extends Exception
{
	private static final long serialVersionUID = 1L;
	
	public Excepciones_Semanticas(String mensaje)
	{
		super(mensaje);
	}
	
	public Excepciones_Semanticas(String token, String mensaje)
	{
		super(mensaje+" '"+token+"'");
	}
}