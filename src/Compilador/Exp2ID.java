package Compilador;

import java.util.*;

public class Exp2ID extends Expresion2
{

	private Identificador id;
	private Vector <Expresion> ListExp;
	private Expresion2 E2;
	
	public Exp2ID(Identificador id)
	{
		this.id = id;
		ListExp = new Vector<Expresion>(1,1);
	}
	
	public void newExp(Expresion Exp)
	{
		ListExp.add(Exp);
	}
	
	public void setE2(Expresion2 E2)
	{
		this.E2 = E2;
	}
	
	public Identificador getID()
	{
		return id;
	}
	
	public Vector<Expresion> getListExp()
	{
		return ListExp;
	}
	
	public Expresion2 getE2()
	{
		return E2;
	}
	
	public String getExp2() 
	{
		String tmp = "."+id.getID()+" (";
		
		tmp+=ListExp.get(0).getExpression();
		for(int i=1; i<ListExp.size();i++)
			tmp+=", "+ListExp.get(i).getExpression();
		
		tmp+=") "+ (E2!=null? E2.getExp2() : "");
		
		return tmp;
		
	}
	
}
