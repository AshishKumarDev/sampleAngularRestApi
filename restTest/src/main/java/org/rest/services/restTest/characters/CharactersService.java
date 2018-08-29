package org.rest.services.restTest.characters;

import java.util.ArrayList;
import java.util.List;

public class CharactersService {

	Characters[] characters2= {new Characters("Matt Damon", "5.8", "Male", "1965"),
			new Characters("Ben Afflek", "6.0", "Male", "1963"),
			new Characters("Christian Bale", "5.10", "Male", "1970"),
			new Characters("Ame", "5.4", "Female", "2004")};
	
	Characters character1=new Characters("Matt Damon", "5.8", "Male", "1965");
	Characters character2=new Characters("Ben Afflek", "6.0", "Male", "1963");
	Characters character3=new Characters("Christian Bale", "5.10", "Male", "1970");
	Characters character4=new Characters("Ame", "5.4", "Female", "2004");
	
	List<Characters> characters=new ArrayList<>();
	
		public Characters[] getCharacters(){
		 characters.add(character1);
		 characters.add(character2);
		 characters.add(character3);
		 characters.add(character4);
		 
		 return characters2;
	 }
}

