package pe.edu.uls.demospringdb;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController 
public class ControllerLibro {

    @Autowired 
    ServiceLibro service;

    @PostMapping("/libros/nuevo")
    public Libro registrarLibro(@RequestBody Libro nuevo) {
        return service.Registrar(nuevo);
    }
    
    @GetMapping("/libros")
    public List<Libro> consultarTodos() {
        return service.ConsultarTodos();
    }
    
}
