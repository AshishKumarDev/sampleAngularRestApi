package org.rest.services.restTest.characters;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/characters")
public class CharactersRest {
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/one")
	public Characters getOneCharcters() {
		return new Characters("James", "5.8", "Male", "1995");
	}
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Characters[] fetchDetails(){
		System.out.println("Got hit :)");
		CharactersService service=new CharactersService();
		return service.getCharacters();
	}

	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String saveTroll(Troll troll) {
		System.out.println("Troll.rant:"+troll.getRant());
		System.out.println("Troll.troll"+troll.getTroll());
		return " Got It";
	}
}
