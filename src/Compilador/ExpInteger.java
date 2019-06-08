package Compilador;

import Compilador.Expresion;


public class ExpInteger extends Expresion
{
	
	private String num;
	private Expresion2 E2;
	
	public ExpInteger(String num, Expresion2 E2)
	{
		this.num = num;
		this.E2 = E2;
	}
	
	public String getInt()
	{
		return num;
	}
	
	public Expresion2 getE2()
	{
		return E2!=null? E2 : null;
	}
	
	public String getExpression() 
	{
		return num +" " + (E2!=null ? E2.getExp2() : "");
	}
	
}
