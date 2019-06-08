package Compilador;

public class Tokens 
{
	String token;
	int code;
	
	public Tokens(String t, int cod)
	{
		token = t;
		code = cod;
	}
	
	public int getCode()
	{
		return code;
	}
	public String getToken()
	{
		return token;
	}

}