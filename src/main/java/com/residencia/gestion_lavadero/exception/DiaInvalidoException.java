package com.residencia.gestion_lavadero.exception;

public class DiaInvalidoException extends RuntimeException{
    public DiaInvalidoException (String mensaje){
        super(mensaje);
    }
}
