package Compilador;

import java.util.*;

public class Declaracion_de_Metodos 
{
	
	private Tipo type;
	private Identificador id;
	private Vector <Tipo> ListTypes;
	private Vector <Identificador> ListID;
	private Vector <Declaracion_de_Variable> VD;
	private Vector <Declaraciones> S1;
	private Expresion E1;
	
	public Declaracion_de_Metodos(Tipo type, Identificador id)
	{
		this.type = type;
		this.id = id;
		ListTypes = new Vector<Tipo>(1,1);
		ListID = new Vector<Identificador>(1,1);
		VD = new Vector<Declaracion_de_Variable>(1,1);
		S1 = new Vector<Declaraciones>(1,1);
	}
	
	public Tipo getType()
	{
		return type;
	}
	
	public Identificador getID()
	{
		return id;
	}
	
	public Vector<Tipo> getListTypes()
	{
		return ListTypes;
	}
	
	public Vector<Identificador> getListID()
	{
		return ListID;
	}
	
	public Vector<Declaracion_de_Variable> getVD()
	{
		return VD;
	}
	
	public Vector<Declaraciones> getS1()
	{
		return S1;
	}
	
	public void newTypeID(Tipo type, Identificador id)
	{
		ListTypes.add(type);
		ListID.add(id);
	}
	
	public void newVD(Declaracion_de_Variable VD)
	{
		this.VD.add(VD);
	}
	
	public void newS1(Declaraciones S1)
	{
		this.S1.add(S1);
	}
	
	public void setE1(Expresion E1)
	{
		this.E1 = E1;
	}
	
	public String getMethodDeclaration()
	{
		String temp = "public " + type.getType() +" "+id.getID() +"(";;
		if(ListTypes.size()!=0){
			temp+=ListTypes.get(0).getType()+" "+ListID.get(0).getID();
			for(int i=1; i<ListTypes.size(); i++)
				temp+=","+ListTypes.get(i).getType()+" "+ListID.get(i).getID();
		}
		temp+=")\n{";
		if(VD.size()!=0)
			for(int i=0; i<VD.size(); i++)
				temp+= VD.get(i).getVarDeclaration();
		
		if(S1.size()!=0)
			for(int i=0; i<S1.size(); i++)
				temp+= S1.get(i).getStatement();
		
		temp+="return "+E1.getExpression()+";}";
		
		return temp;
	}
	
}
