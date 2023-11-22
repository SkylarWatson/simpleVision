package com.simplevision.prescription.controller;

import com.simplevision.core.service.InfoService;
import com.simplevision.core.view.PrescriptionView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class PrescriptionController {
    @Autowired private InfoService service;

    @GetMapping("/prescription/{id}")
    public PrescriptionView findPrescriptionById(@PathVariable("id") int id) {
        return service.findPrescriptionById(id);
    }

    @PostMapping("/prescription")
    public void create(@RequestBody PrescriptionView prescription) {
        service.create(prescription);
    }
}
