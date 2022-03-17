package app;
import io.jooby.annotations.*;
import io.jooby.exception.BadRequestException;

public class Soma{

    @Path("/soma/{op1}/{op2}")
    @GET
    public String rotaSoma(@PathParam double op1, @PathParam double op2){
        try{
            return String.format("%.2f", op1+op2);
            // adicionando mudanças comentário revisor!!!
        }catch(NumberFormatException nfe){
            throw new BadRequestException(String.format("Valores inválidos"));
        }
        
    }
}