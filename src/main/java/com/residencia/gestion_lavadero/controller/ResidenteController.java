package com.residencia.gestion_lavadero.controller;

import com.residencia.gestion_lavadero.dto.ResidenteRequestDTO;
import com.residencia.gestion_lavadero.dto.ResidenteResponseDTO;
import com.residencia.gestion_lavadero.service.ResidenteService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/residentes")
@RequiredArgsConstructor
public class ResidenteController {

    private final ResidenteService residenteService;

    //get all
    @GetMapping
    public ResponseEntity<List<ResidenteResponseDTO>> listarTodos(){
        return ResponseEntity.ok(residenteService.listarTodos());
    }

    //Get by id
    @GetMapping("{/id}")
    public ResponseEntity<ResidenteResponseDTO> getById(@PathVariable Long id){
        return ResponseEntity.ok(residenteService.listarPorId(id));    }

    //post
    @PostMapping
    public ResponseEntity<ResidenteResponseDTO> addResidente(@Valid @RequestBody ResidenteRequestDTO residenteRequestDTO){
        ResidenteResponseDTO responseDTO = residenteService.registrarResidente(residenteRequestDTO);
        return new ResponseEntity<>(responseDTO, HttpStatus.CREATED); //Codigo 201
    }

    //delete
    @DeleteMapping("{/id}")
    public ResponseEntity<Void> eliminarResidente(@PathVariable Long id){
        residenteService.eliminarResidente(id);
        return ResponseEntity.noContent().build();
    }

}
