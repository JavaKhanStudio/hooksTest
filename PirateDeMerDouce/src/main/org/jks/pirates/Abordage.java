package main.org.jks.pirates;

public interface Abordage 
{

	public default void attaqueUnVaisseau(Vaisseau vaisseauAttaque)
	{
		preAttaque() ; 
		Vaisseau myVaisseau = getVaisseauAttaquant() ; 
		
		myVaisseau.booty += vaisseauAttaque.booty ; 
		vaisseauAttaque.booty = 0 ; 
		postAttaque(vaisseauAttaque) ; 
	}
	
	public default void preAttaque() {} ; 
	public default void postAttaque(Vaisseau vaisseauAttaque) {} ; 
	
	public Vaisseau getVaisseauAttaquant() ; 
	
}
