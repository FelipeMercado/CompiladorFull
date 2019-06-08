package Compilador;

import Compilador.Declaraciones;

public class Llaves extends Declaraciones
{
	
	private Declaraciones S1;
	
	public Llaves(Declaraciones S1)
	{
		this.S1 = S1;
	}

	public String getStatement() 
	{
		return "{"+S1.getStatement()+"}";
	}
	
}
