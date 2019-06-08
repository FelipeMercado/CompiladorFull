package Compilador;

import java.util.*;;

public class Declaracion_de_Clase 
{
	
	private Identificador id1;
	private Identificador id2;
	private Vector <Declaracion_de_Variable> VD;
	private Vector <Declaracion_de_Metodos> MD;
	
	public Declaracion_de_Clase(Identificador id1)
	{
		this(id1, null);
	}
	
	public Declaracion_de_Clase(Identificador id1, Identificador id2)
	{
		this.id1 = id1;
		this.id2 = id2;
		
		VD = new Vector<Declaracion_de_Variable>(1,1);
		MD = new Vector<Declaracion_de_Metodos>(1,1);
	}
	
	public Identificador getID1()
	{
		return id1;
	}
	
	public Identificador getID2()
	{
		return id2;
	}
	
	public Vector <Declaracion_de_Variable> getVD()
	{
		return VD;
	}
	
	public Vector <Declaracion_de_Metodos> getMD()
	{
		return MD;
	}
	
	public void newVD(Declaracion_de_Variable VD)
	{
		this.VD.add(VD);
	}
	
	public void newMD(Declaracion_de_Metodos MD)
	{
		this.MD.add(MD);
	}
	
	public String getClassDeclaration()
	{
		String temp = "class "+id1.getID();
		
		if(id2!=null)
			temp+=" extends "+id2.getID();
		
		temp+="{\n";
		
		for(int i=0; i<VD.size();i++)
			temp+=VD.get(i).getVarDeclaration()+"\n";
		
		for(int i=0; i<MD.size(); i++)
			temp+=MD.get(i).getMethodDeclaration()+"\n";
		
		temp+="}";
		
		return temp; 
	}
}
