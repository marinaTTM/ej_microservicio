package net.ultrasist.capacitacion.chambeaya.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import net.ultrasist.capacitacion.chambeaya.api.model.Persona;
import net.ultrasist.capacitacion.chambeaya.api.service.PersonaService;

@RestController
@RequestMapping(value = "/api/")
public class HelloController {

    private PersonaService personaService;
    
    public HelloController(PersonaService personaService) {
        this.personaService = personaService;
    }
    
	@ApiOperation(value = "HelloController::helloWorld", notes = "Saluda <h1>Greeting</h1>")
	@GetMapping(value = "hello", produces = "application/json; charset=utf-8")
	public List<Persona> helloWorld() {
		return personaService.getBolsa();
	}
	/*
	public static int (int n) {
	    return (n<)
	}*/
}

