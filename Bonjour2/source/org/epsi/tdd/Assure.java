package org.epsi.tdd;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.apache.commons.lang3.StringUtils;

public class Assure {

	
	String prenom ; 
	String nom ; 
	String email ; 
	
	public Assure(String nom, String prenom , String email) throws Exception 
	{
		if(StringUtils.isEmpty(prenom) || StringUtils.isEmpty(email))
		{
			throw new Exception() ; 
		}
		
		this.prenom = prenom ; 
		this.nom = nom ; 
		this.email = email ; 
	}

}
