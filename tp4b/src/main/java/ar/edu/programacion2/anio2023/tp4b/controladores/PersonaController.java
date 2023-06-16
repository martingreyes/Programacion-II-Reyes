package ar.edu.programacion2.anio2023.tp4b.controladores;

import ar.edu.programacion2.anio2023.tp4b.servicios.PersonaRepositorio;
import ar.edu.programacion2.anio2023.tp4b.entidades.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import java.util.List;

@RestController
@RequestMapping("/persona")
public class PersonaController {

    @Autowired
    PersonaRepositorio personas;

    @GetMapping("/{codigo}")
    public Persona get(@PathVariable int codigo) {
        Persona p = this.personas.get(codigo);
        return p;
    }

    @GetMapping
    public List<Persona> getAll() {
        List<Persona> personas = this.personas.getAll();
        return personas;
    }

    @PostMapping
    public String post(@RequestBody Persona persona) {
        this.personas.add(persona);
        int codigo = persona.getCodigo();
        Persona p = this.personas.get(codigo);
        return ("Se agregó a: " + p.getNombre() + " " +  p.getApellido());
    }

    @DeleteMapping("/{codigo}")
    public String delete(@PathVariable int codigo) {
        Persona p = this.personas.get(codigo);
        this.personas.remove(codigo);
        return ("Se elimino a: " + p.getNombre() + " " +  p.getApellido());
    }

    @DeleteMapping
    public String delete(@RequestBody Persona persona) {
        String nombre = persona.getNombre();
        String apellido = persona.getApellido();
        this.personas.remove(persona);
        return ("Se elimino a: " + nombre + " " + apellido);
    }

    @PutMapping("/{codigo}")
    public String put(@PathVariable int codigo,@RequestBody Persona persona) {
        if (this.personas.get(codigo) != null) {
            Persona p = this.personas.get(codigo);
            this.personas.put(codigo, persona);
            return ("Se modificó a: " + p.getNombre() + " " + p.getApellido() + " id: " + p.getCodigo());
        } else {
            return ("No se modificó ya que no existe un usuario con ese id");
        }
    }

}
