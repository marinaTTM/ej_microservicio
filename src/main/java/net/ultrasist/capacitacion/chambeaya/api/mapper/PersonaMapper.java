package net.ultrasist.capacitacion.chambeaya.api.mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import net.ultrasist.capacitacion.chambeaya.api.model.Persona;

@Repository
public class PersonaMapper {
    private List<Persona> bolsa= new ArrayList<>();
    
    
    
    public PersonaMapper() {
        bolsa.add(new Persona(45, "Marina", "Gil", "Pena", 49));
        bolsa.add(new Persona(46, "Martina", "Ramirez", "Pena", 18));
        bolsa.add(new Persona(47, "Ignacio", "Ramirez", "Pena", 20));
    }
    
    public Persona findById(int id) {
        Optional<Persona> resultado = bolsa.stream().filter(x -> x.getId()==id).findFirst();
        if (resultado.isPresent()) return resultado.get();
        return new Persona();
    }
    
    public void insert(Persona p) {
        bolsa.add(p);
        
    }
    public List<Persona> getAll() {
        return bolsa;
    }
    public void delete(Persona p) {
        bolsa.remove(p);
    }
}
