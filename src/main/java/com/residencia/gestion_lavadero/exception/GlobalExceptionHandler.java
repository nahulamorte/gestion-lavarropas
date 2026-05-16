package com.residencia.gestion_lavadero.exception;

import com.residencia.gestion_lavadero.dto.ErrorResponse;
import org.springframework.cglib.core.Local;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ProblemDetail;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ContraseniaIncorrectaException.class)
    public ResponseEntity<ErrorResponse> handleContraseniaIncorrecta(ContraseniaIncorrectaException ex){
        ErrorResponse error = new ErrorResponse(
                "CONTRASENIA_INCORRECTA",
                ex.getMessage(),
                LocalDateTime.now()
        );
        return new ResponseEntity<>(error, HttpStatus.UNAUTHORIZED); // Codigo 401
    }

    @ExceptionHandler(DiaInvalidoException.class)
    public ResponseEntity<ErrorResponse> handleDiaInvalidoException(DiaInvalidoException ex){
        ErrorResponse error =  new ErrorResponse(
                "DIA_INVALIDO",
                ex.getMessage(),
                LocalDateTime.now()
        );
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST); //Codigo 400
    }

    @ExceptionHandler(DniDuplicadoException.class)
    public ResponseEntity<ErrorResponse> handleDniDuplicadoException(DniDuplicadoException ex){
        ErrorResponse error = new ErrorResponse(
                "DNI_DUPLICADO",
                ex.getMessage(),
                LocalDateTime.now()
        );
        return new ResponseEntity<>(error, HttpStatus.CONFLICT); //Codigo 409
    }

    @ExceptionHandler(FueraDeHorarioException.class)
    public ResponseEntity<ErrorResponse> handleFueraDeHorarioException(FueraDeHorarioException ex){
        ErrorResponse error = new ErrorResponse(
                "FUERA_DE_HORARIO",
                ex.getMessage(),
                LocalDateTime.now()
        );
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST); //Codigo 400
    }


    @ExceptionHandler(LimiteSemanalAlcanzadoException.class)
    public ResponseEntity<ErrorResponse> handleLimiteSemanal(LimiteSemanalAlcanzadoException ex){
        ErrorResponse error = new ErrorResponse(
            "LIMITE_SEMANAL",
            ex.getMessage(),
            LocalDateTime.now()
        );
        return new ResponseEntity<>(error, HttpStatus.CONFLICT); //Codigo: 409
    }

    @ExceptionHandler(ResidenteNoExistenteException.class)
    public ResponseEntity<ErrorResponse> handleResidenteNoExistenteException(ResidenteNoExistenteException ex){
        ErrorResponse error = new ErrorResponse(
                "NO_EXISTE_EL_RESIDENTE",
                ex.getMessage(),
                LocalDateTime.now()
        );
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND); //Codigo 404
    }
    
    
}
