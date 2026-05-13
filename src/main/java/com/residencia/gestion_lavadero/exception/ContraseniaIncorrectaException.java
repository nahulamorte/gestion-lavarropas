package com.residencia.gestion_lavadero.exception;

public class ContraseniaIncorrectaException extends RuntimeException{
    public ContraseniaIncorrectaException(String mensaje){
        super(mensaje);
    }
}
