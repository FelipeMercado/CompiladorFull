package Compilador;

public class ExpNegParen extends Expresion
{
	
	private String tp;
	private Expresion E1;
	private Expresion2 E2;
	
	public ExpNegParen(String tp, Expresion E1, Expresion2 E2)
	{
		this.tp = tp;
		this.E1 = E1;
		this.E2 = E2;
	}
	
	public String getTp()
	{
		return tp;
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
		return tp+" "+E1.getExpression()+" "+(E2!=null? E2.getExp2() : "");
	}
	
}
