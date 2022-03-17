package app;
import io.jooby.annotations.*;
import io.jooby.exception.BadRequestException;

public class Subtracao{

    @Path("/sub/{op1}/{op2}")
    @GET
    public String rotaSub(@PathParam double op1, @PathParam double op2){
        try{
            return String.format("%.2f", op1-op2);
        }catch(NumberFormatException nfe){
            throw new BadRequestException(String.format("Valores inválidos"));
        }
        
    }
}