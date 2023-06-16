package ar.edu.programacion2.anio2023.tp4b.controladores;

import ar.edu.programacion2.anio2023.tp4b.entidades.Domicilio;
import ar.edu.programacion2.anio2023.tp4b.entidades.Persona;
import ar.edu.programacion2.anio2023.tp4b.servicios.DomicilioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/domicilio")
public class DomicilioController {

    @Autowired
    DomicilioRepositorio domicilios;

    @GetMapping("/{id}")
    public Domicilio get(@PathVariable int id) {
        Domicilio d = this.domicilios.get(id);
        return d;
    }

    @GetMapping
    public List<Domicilio> getAll() {
        List<Domicilio> domicilios = this.domicilios.getAll();
        return domicilios;
    }

    @PostMapping
    public String post(@RequestBody Domicilio domicilio) {
        this.domicilios.add(domicilio);
        int id = domicilio.getId();
        Domicilio d = this.domicilios.get(id);
        return ("Se agregó: " + d.getCalle() + " " +  d.getNumero() + " " +  d.getLocalidad() + " " +  d.getProvincia());
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        Domicilio d = this.domicilios.get(id);
        this.domicilios.remove(id);
        return ("Se eliminó: " + d.getCalle() + " " +  d.getNumero() + " " +  d.getLocalidad() + " " +  d.getProvincia());
    }

    @DeleteMapping
    public String delete(@RequestBody Domicilio domicilio) {
        Domicilio d = this.domicilios.get(domicilio.getId());
        this.domicilios.remove(domicilio);
        return ("Se eliminó: " + d.getCalle() + " " +  d.getNumero() + " " +  d.getLocalidad() + " " +  d.getProvincia());
    }

    @PutMapping("/{id}")
    public String put(@PathVariable int id,@RequestBody Domicilio domicilio) {
        if (this.domicilios.get(id) != null) {
            Domicilio d = this.domicilios.get(id);
            this.domicilios.put(id, domicilio);
            return ("Se modificó al domicilio con id " + d.getId());
        } else {
            return ("No se modificó ya que no existe un usuario con id " + id);
        }

    }
}
