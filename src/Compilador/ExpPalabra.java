package Compilador;

public class ExpPalabra extends Expresion
{

	private String pl;
	private Expresion2 E2;
	
	public ExpPalabra(String pl, Expresion2 E2)
	{
		this.pl = pl;
		this.E2 = E2;
	}
	
	public String getPl()
	{
		return pl;
	}
	
	public Expresion2 getE2()
	{
		return E2;
	}
	
	public String getExpression() 
	{
		return pl + (E2!=null ? E2.getExp2() : "");
	}

}
