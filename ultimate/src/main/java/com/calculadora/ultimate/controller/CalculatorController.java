package com.calculadora.ultimate.controller;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:5173")
public class CalculatorController {
    @PostMapping("/sumar")
    public RespuestaCalculo sumar(@RequestBody PeticionCalculo peticion) {
        double resultado = peticion.numero1() + peticion.numero2();
        return new RespuestaCalculo(resultado);
    }
}
record PeticionCalculo(double numero1, double numero2) {}
record RespuestaCalculo(double resultado) {}
