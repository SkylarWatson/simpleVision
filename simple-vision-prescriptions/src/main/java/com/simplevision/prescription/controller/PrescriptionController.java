package com.simplevision.prescription.controller;

import com.simplevision.prescription.view.PrescriptionView;
import com.simplevision.prescription.service.PrescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class PrescriptionController {
    @Autowired private PrescriptionService service;

    @GetMapping("/prescription/{id}")
    public PrescriptionView findPrescriptionById(@PathVariable("id") int id) {
        return service.findPrescriptionById(id);
    }

    @PostMapping("/prescription")
    public void create(@RequestBody PrescriptionView prescription) {
        service.create(prescription);
    }
}
