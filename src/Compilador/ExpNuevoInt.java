package Compilador;

public class ExpNuevoInt extends Expresion
{
	
	private Expresion E1;
	private Expresion2 E2;
	
	public ExpNuevoInt(Expresion E1, Expresion2 E2)
	{
		this.E1 = E1;
		this.E2 = E2;
	}
	
	public Expresion getE1()
	{
		return E1;
	}
	
	public Expresion2 getE2()
	{
		return E2;
	}
	
	public String getExpression()
	{
		return E1.getExpression() + (E2!=null? E2.getExp2() : "");
	}
	
}
