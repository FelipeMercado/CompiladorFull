package Compilador;

import Compilador.Expresion;

public class Exp2Tipo extends Expresion2
{
	
	private String type;
	private Expresion E1;
	private Expresion2 E2;
	
	public Exp2Tipo(String type, Expresion E1, Expresion2 E2)
	{
		this.type = type;
		this.E1 = E1;
		this.E2 = E2;
	}
	
	public String getType()
	{
		return type;
	}
	
	public Expresion getE1()
	{
		return E1;
	}
	
	public Expresion2 getE2()
	{
		return E2;
	}
	
	public String getExp2() 
	{
		return !type.equals("[")? ( type + E1.getExpression() ) : ( "[" + E1.getExpression() + "]" + (E2!=null ? E2.getExp2() : "") );
	}

}
