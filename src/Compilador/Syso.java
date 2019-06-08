package Compilador;

public class Syso extends Declaraciones
{
	
	private Expresion E1;
	
	public Syso(Expresion E1)
	{
		this.E1 = E1;
	}
	
	public String getStatement()
	{
		return "System.out.prinln("+E1.getExpression()+");";
	}
}
