package com.simplevision.core;

import com.simplevision.core.service.InfoService;
import com.simplevision.core.view.LensView;
import com.simplevision.core.view.PatientView;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class InfoServiceTest {
    @Autowired private InfoService service;
    private PatientView patient;

    @BeforeEach
    public void setUp() {
        patient = new PatientView();
    }

    @Test
    public void findPatientByEmail() {
        patient.setEmail("email");
        patient.setAddress("myAddress");

        service.create(patient);

        assertEquals("myAddress", service.findPatientByEmail("email").getAddress());
    }

    @Test
    public void findPatientByPhone() {
        patient.setPhoneNumber("phone");
        patient.setAddress("myAddress");

        service.create(patient);

        assertEquals("myAddress", service.findPatientByPhone("phone").getAddress());
    }

    @Test
    public void findPatientById() {
        patient.setAddress("myAddress");

        long id = service.create(patient).getId();

        assertEquals("myAddress", service.findPatientById(id).getAddress());
    }

    @Test
    public void findLensById() {
        LensView lens = new LensView();
        lens.setStyle("trifocal");

        long id = service.create(lens).getId();

        assertEquals("trifocal", service.findLensById(id).getStyle());
    }
}
