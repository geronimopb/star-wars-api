package com.evaluation.swapi_backend.contoller;

import com.evaluation.swapi_backend.model.person;
import com.evaluation.swapi_backend.service.peopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

// Este es el controlador REST que maneja las solicitudes relacionadas con las personas.
// Proporciona métodos para obtener la lista de personas desde la API de SWAPI
// y para agregar nuevas personas a la lista local.

@RestController
@RequestMapping("/api/people")
@CrossOrigin(origins = "*")
public class peopleController {

    private final peopleService peopleService;

    @Autowired
    public peopleController(peopleService peopleService) {
        this.peopleService = peopleService;
    }

    @GetMapping
    public List<Map<String, Object>> getPeople() {
        return peopleService.getAllPeople();
    }

    @PostMapping
    public String addPerson(@RequestBody person person) {
        peopleService.addPerson(person);
        return "Persona agregada correctamente.";
    }
}
