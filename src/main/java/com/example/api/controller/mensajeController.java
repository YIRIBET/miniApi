package com.example.api.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class mensajeController {
    @GetMapping("/api/mensaje")
        public String mensaje() {
            return "Hola desde mi backend";
        }
}
