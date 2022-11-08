package main.org.jks.pirates;

import java.util.ArrayList;

public class VaisseauPirate extends Vaisseau implements Abordage{

	ArrayList<Pirate> pirates ;

	public VaisseauPirate()
	{
		
	}
	
	@Override
	public Vaisseau getVaisseauAttaquant() 
	{
		return this;
	} 
	
}
