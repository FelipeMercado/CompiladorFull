package Compilador;

public class Igual extends Declaraciones
{
	
	private Identificador id;
	private Expresion E1;
	
	public Igual(Identificador id, Expresion E1)
	{
		this.id = id;
		this.E1 = E1;
	}
	
	public String getStatement() 
	{
		return id.getID()+" = "+E1.getExpression();
	}
	
	
}
