package com.example.demo;

import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController 
public class ControllerDemo {
    
    @GetMapping("/productos/{id}")
    public Map<String,Object> consultarProducto(@PathVariable int id) {
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("id",id);
        map.put("producto","Producto "+id);
        return map;
    }

    @PostMapping("/productos/nuevo")
    public Map<String,Object> registrarProducto(@RequestBody Map<String,Object> nuevo) {
        Date ahora = new Date();
        Long id = ahora.getTime();
        nuevo.put("id", id);
        return nuevo;
    }
    
}
