package Compilador;

import Compilador.Expresion2;

public class Exp2Longitud extends Expresion2
{
	
	private Expresion2 E2;
	
	public Exp2Longitud(Expresion2 E2)
	{
		this.E2 = E2;
	}
	
	public Expresion2 getE2()
	{
		return E2;
	}
	
	public String getExp2() 
	{
		return ".lenght " + (E2!=null? E2.getExp2() : "");
	}
	
}
