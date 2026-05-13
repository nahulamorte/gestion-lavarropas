package com.residencia.gestion_lavadero.exception;

public class FueraDeHorarioException extends RuntimeException{
    public FueraDeHorarioException(String mensaje){
        super(mensaje);
    }
}
