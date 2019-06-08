package Compilador;

public class ExpID extends Expresion
{

	private Identificador id;
	private Expresion2 E2;
	
	public ExpID(Identificador id, Expresion2 E2)
	{
		this.id = id;
		this.E2 = E2;
	}
	
	public Identificador getID()
	{
		return id;
	}
	
	public Expresion2 getE2()
	{
		return E2;
	}
	
	public String getExpression() 
	{
		return id.getID()+" "+ (E2!=null ? E2.getExp2() : "");
	}

}
