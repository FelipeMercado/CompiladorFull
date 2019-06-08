package Compilador;

import Compilador.Tipo;

public class Declaracion_de_Variable 
{
	
	private Tipo type;
	private Identificador id;
	
	public Declaracion_de_Variable(Tipo type, Identificador id)
	{
		this.type = type;
		this.id = id;
	}
	
	public Tipo getType()
	{
		return type;
	}
	
	public Identificador getID()
	{
		return id;
	}
	
	public String getVarDeclaration()
	{
		return type.getType()+" "+id.getID();
	}
	
}