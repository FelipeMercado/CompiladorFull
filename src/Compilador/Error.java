package Compilador;

public class Error 
{
	int num;
	String tipo;
	String desc;
	
	public Error(int n, String t, String d)
	{
		num = n;
		tipo = t;
		desc = d;
	}
	
	public String getError()
	{
		return "Error "+num+": "+tipo+" - "+desc;
	}
	
}
