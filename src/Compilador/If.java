package Compilador;

public class If extends Declaraciones
{
	
	private Expresion E1;
	private Declaraciones S1;
	private Declaraciones S2;
	
	public If(Expresion E1, Declaraciones S1, Declaraciones S2)
	{
		this.E1 = E1;
		this.S1 = S1;
		this.S2 = S2;
	}

	public String getStatement() 
	{
		return "if("+E1.getExpression()+")"+S1.getStatement()+" else "+S2.getStatement();
	}
	
}
