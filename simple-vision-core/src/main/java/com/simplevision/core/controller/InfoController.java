package com.simplevision.core.controller;

import com.simplevision.core.service.InfoService;
import com.simplevision.core.view.LensView;
import com.simplevision.core.view.PatientView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class InfoController {
    @Autowired private InfoService service;

    @GetMapping("/patient/{id}")
    public PatientView findPatientById(@PathVariable("id") int id) {
        return service.findPatientById(id);
    }

    @PostMapping("/patient")
    public void create(@RequestBody PatientView patient) {
        service.create(patient);
    }

    @PostMapping("/lens")
    public void create(@RequestBody LensView lens) {
            service.create(lens);
    }

    @GetMapping("/patient")
    public PatientView findPatientBy(@RequestParam(required = false) String email, @RequestParam(required = false) String phone) {
        if (email != null) {
            return service.findPatientByEmail(email);
        } else if (phone != null) {
            return service.findPatientByPhone(phone);
        }
        return null;
    }

    @GetMapping("/lens")
    public LensView findLensById(int id) {
        return service.findLensById(id);
    }
}
