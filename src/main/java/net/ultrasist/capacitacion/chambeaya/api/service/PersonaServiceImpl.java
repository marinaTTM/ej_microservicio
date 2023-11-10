package net.ultrasist.capacitacion.chambeaya.api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import net.ultrasist.capacitacion.chambeaya.api.mapper.PersonaMapper;
import net.ultrasist.capacitacion.chambeaya.api.model.Persona;

@Service
public class PersonaServiceImpl implements PersonaService {

    private PersonaMapper personaMapper;
    
    public PersonaServiceImpl(PersonaMapper personaMapper) {
        this.personaMapper = personaMapper;
    }
    
    @Override
    public List<Persona> getBolsa() {
        /*List<Persona> bolsa = new ArrayList<>();
        bolsa.add(new Persona(45, "Marina", "Gil", "Pena", 49));
        bolsa.add(new Persona(45, "Martina", "Ramirez", "Pena", 18));
        bolsa.add(new Persona(45, "Ignacio", "Ramirez", "Pena", 20));
        */
        return personaMapper.getAll();
    }
    
    @Override
    public int fact(int n) {
        return (n<2)?1:n*fact(n-1);
    
    }
}
