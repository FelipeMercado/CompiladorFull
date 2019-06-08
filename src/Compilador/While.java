package Compilador;

public class While extends Declaraciones
{
	
	private Expresion E1;
	private Declaraciones S1;
	
	public While(Expresion E1, Declaraciones S1)
	{
		this.E1 = E1;
		this.S1 = S1;
	}

	public String getStatement() 
	{
		return "while("+E1.getExpression()+") "+S1.getStatement();
	}
	
}
