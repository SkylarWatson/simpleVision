package com.simplevision.lens.controller;

import com.simplevision.lens.view.LensView;
import com.simplevision.lens.service.LensService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class LensController {
    @Autowired private LensService service;

    @PostMapping("/lens")
    public void create(@RequestBody LensView lens) {
        service.create(lens);
    }

    @GetMapping("/lens")
    public LensView findLensById(int id) {
        return service.findLensById(id);
    }
}
