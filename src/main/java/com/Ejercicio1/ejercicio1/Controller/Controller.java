package com.Ejercicio1.ejercicio1.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController  //mapeando controlador con anotation 
public class Controller {
    
    @GetMapping ("/convertir/{galones}")  //mapeando metodo con endpoint(path) y parametro(variable) con solicitud GET
    public String galonesALitros(@PathVariable double galones) {
        
        //convertimos los galones a litros
        double litros = galones * 3.78541;
        return "La cantidad de litros equivalente a: " + galones + " galones " + "es de " + litros + " litros";
                }
}
