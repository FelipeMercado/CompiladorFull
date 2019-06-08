package Compilador;

public class MainClass 
{
	
	Identificador id1;
	Identificador id2;
	Declaraciones S1;
	
	public MainClass(Identificador id1, Identificador id2, Declaraciones S1)
	{
		this.id1 = id1;
		this.id2 = id2;
		this.S1 = S1;
	}
	
	public String getMainClass()
	{
		return "class "+id1.getID()+"{\npublic static void main(String [] "+id2.getID()+") {\n"+S1.getStatement()+"}\n}";
	}
	
}
