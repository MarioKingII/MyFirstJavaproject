package MyFirstJavaproject;

public class TaxBrake {
	
	public double Tax;
	public double TaxStateBracket;
	public double TaxFedBracket;

	public TaxBrake(double Tax) {
		
		
		TaxStateBracket = 0;
		TaxFedBracket = 0;
		
		if (Tax <= 20000)
    	{
    		TaxStateBracket = 0.05;
    		TaxFedBracket = 0.15;
    	}
    	else if (Tax >= 20000 && Tax < 40000)
    	{
    		TaxStateBracket = 0.08;
    		TaxFedBracket = 0.20;

    	}
    	else if (Tax >= 40000 && Tax < 100000)
    	{
    		TaxStateBracket = 0.10;
    		TaxFedBracket = 0.25;

    	}
    	else if (Tax >= 100000 && Tax < 140000)
    	{
    		TaxStateBracket = 0.11;
    		TaxFedBracket = 0.27;

    	}
    	else if (Tax >= 140000 && Tax < 180000)
    	{
    		TaxStateBracket = 0.12;
    		TaxFedBracket = 0.29;

    	}
    	else if (Tax >= 180000 && Tax < 250000)
    	{
    		TaxStateBracket = 0.13;
    		TaxFedBracket = 0.32;

    	}
    	else if (Tax >= 250000)
    	    	{
    		TaxStateBracket = 0.14;
    		TaxFedBracket = 0.34;

    	    	}
    	else
    	{
    		TaxStateBracket = 0.15;
    		TaxFedBracket = 0.36;

    	}
		
	}
	
	public double getState() {
		return TaxStateBracket;
}
	public double getFed() {
		return TaxFedBracket;
}
}