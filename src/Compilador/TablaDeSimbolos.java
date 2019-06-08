package Compilador;


import java.util.*;


public class TablaDeSimbolos 
{
	
	private Identificador id;
	private String type;
	private Vector<Declaracion_de_Variable> Parametros;
	
	public TablaDeSimbolos(Identificador id, String type)
	{
		this.id = id;
		this.type = type;
		Parametros = new Vector<Declaracion_de_Variable>(1,1);
	}
	
	public void newParametro(Declaracion_de_Variable Param)
	{
		Parametros.add(Param);
	}
	
	public Vector<Declaracion_de_Variable> getParametros()
	{
		return Parametros;
	}
	
	public int getNumParam()
	{
		return Parametros.size();
	}
	
	public String getType()
	{
		return type;
	}
	
	public Identificador getId()
	{
		return id;
	}
	
	
}
