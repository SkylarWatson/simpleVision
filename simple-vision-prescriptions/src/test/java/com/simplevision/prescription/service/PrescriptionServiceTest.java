package com.simplevision.prescription.service;

import com.simplevision.prescription.view.PrescriptionDetails;
import com.simplevision.prescription.view.PrescriptionView;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class PrescriptionServiceTest {
    @Autowired private PrescriptionService service;

    @Test
    public void findPrescriptionById() {
        PrescriptionDetails od = new PrescriptionDetails();
        PrescriptionDetails os = new PrescriptionDetails();
        od.setSphere("rightSphere");

        PrescriptionView prescription = new PrescriptionView();
        prescription.setOD(od);
        prescription.setOS(os);

        UUID id = service.create(prescription).getId();

        assertEquals("rightSphere", service.findPrescriptionById(id).getOD().getSphere());
    }
}
