package it.csp.formazione.designpattern.creazionali.abstractfactory;

public abstract class AbstractButtonFactory 
{
	public static AbstractButtonFactory getFactory()
	{
		String sys = System.getProperty("os.name");
        System.out.println("Sistema Operativo: " + sys);
		AbstractButtonFactory result = null;
        if (sys.toUpperCase().contains("WIN"))
		{
			result = new WindowsButtonFactory();
		}
		else
		{
			result = new OxButtonFactory();
		}
        return result;
	}
	
	 public abstract Button createButton();
	
	public static void main(String[] args) {
		String sys = System.getProperty("os.name");
        System.out.println(sys);
		
	}
}
