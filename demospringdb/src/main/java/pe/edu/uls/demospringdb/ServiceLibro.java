package pe.edu.uls.demospringdb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceLibro {

    @Autowired
    RepositoryLibro repoLibro;

    public Libro Registrar(Libro nuevo){
        return repoLibro.save(nuevo);
    }

    public List<Libro> ConsultarTodos(){
        return repoLibro.findAll();
    }
    
}
