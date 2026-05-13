package com.residencia.gestion_lavadero.exception;

public class LimiteSemanalAlcanzadoException extends RuntimeException{
    public LimiteSemanalAlcanzadoException(String mensaje){
        super(mensaje);
    }
}
