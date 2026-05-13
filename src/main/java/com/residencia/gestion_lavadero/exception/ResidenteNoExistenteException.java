package com.residencia.gestion_lavadero.exception;

public class ResidenteNoExistenteException extends RuntimeException{
    public ResidenteNoExistenteException(String mensaje){
        super(mensaje);
    }
}
