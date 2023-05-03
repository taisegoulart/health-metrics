package dev.ifrs;

import org.eclipse.microprofile.metrics.annotation.Counted;
import org.eclipse.microprofile.metrics.annotation.Timed;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class Health {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Counted(name="Contador", description="descrição do contador")
    @Timed (name="Tempo", description = "descrição do tempo")
    public String hello() {
        return "Hello from RESTEasy Reactive";
    }
}
