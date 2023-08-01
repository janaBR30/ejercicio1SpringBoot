package com.Ejercicio1.ejercicio1.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  //mapeando controlador con anotation 
public class Controller {
    
    @GetMapping ("/Jana")  //mapeando metodo con endpoint(path) solicitud GET
    public String sayHello() {
        return "Hola Jana";
                }
}
