package Compilador;

import Compilador.Expresion;


public class ExpNuevaID extends Expresion
{
	
	private Identificador id;
	private Expresion2 E2;
	
	public ExpNuevaID(Identificador id, Expresion2 E2)
	{
		this.id = id;
		this.E2 = E2;
	}
	
	public Identificador getid()
	{
		return id;
	}
	
	public Expresion2 getE2()
	{
		return E2;
	}
	
	public String getExpression()
	{
		return "new " + id.getID() + "()" +(E2!=null? E2.getExp2() : "");
	}
}
