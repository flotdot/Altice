package org.acme.rsl.api;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.acme.Exception.AlticeBEException;

import java.math.BigInteger;

@Path("/labseq")
public interface LabseqServiceAPI {

    @GET
    @Path("/{n}")
    BigInteger getLabseqValue(int n) throws AlticeBEException;

}
