package org.acme;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/labseq")
public class LabseqResource {

    @Inject
    LabseqService labseqService;

    @GET
    @Path("/{n}")
    @Produces(MediaType.APPLICATION_JSON)
    public int getLabseqValue(@PathParam("n") int n) {
        int labseqValue = labseqService.calculateLabseqValue(n);
        return labseqValue;
    }
}
