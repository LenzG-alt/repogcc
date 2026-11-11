
package com.example.gymdemo;

import com.example.gymdemo.Inscripcion;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/inscripciones")
public class InscripcionController {

    // Lista para almacenar las inscripciones
    List<Inscripcion> inscripciones = new ArrayList<>();

    // Constructor con datos de ejemplo
    public InscripcionController() {

        inscripciones.add(new Inscripcion(
            1L,
            "Carlos Perez",
            "76543210",
            "Premium"
        ));

        inscripciones.add(new Inscripcion(
            2L,
            "Maria Lopez",
            "71234567",
            "Basica"
        ));
    }
    @GetMapping("/prueba")
    public String probarAPI() {
        return "GymManager API funcionando correctamente";
    }
    // METODO GET: Consultar inscripciones
    @GetMapping
    public ResponseEntity<List<Inscripcion>> listarInscripciones() {
        return ResponseEntity.ok(inscripciones);
    }

    // METODO POST: Registrar una inscripcion
    @PostMapping
    public ResponseEntity<Inscripcion> registrarInscripcion(@RequestBody Inscripcion inscripcion) {
        inscripciones.add(inscripcion);
        return ResponseEntity.ok(inscripcion);
    }
}
