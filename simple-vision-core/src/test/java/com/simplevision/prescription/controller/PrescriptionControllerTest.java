package com.simplevision.prescription.controller;

import com.simplevision.prescription.service.PrescriptionService;
import com.simplevision.prescription.view.PrescriptionView;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class PrescriptionControllerTest {
    public static final String PRESCRIPTION_SERVICE_URL = "http://localhost:9090/prescription";

    @InjectMocks private PrescriptionController controller;
    @Mock private PrescriptionService service;
    @Mock private RestTemplate restTemplate;

    @Test
    public void createPrescription() {
        PrescriptionView prescription = new PrescriptionView();

        controller.create(prescription);

        verify(service).create(prescription);
    }

    @Test
    public void findPrescriptionById() {
        PrescriptionView prescription = new PrescriptionView();

        when(service.findPrescriptionById(anyLong())).thenReturn(prescription);

        assertEquals(prescription, controller.findPrescriptionById(1));
    }

    @Test
    public void storePrescriptionsInPrescriptionService() {
        PrescriptionView prescription = new PrescriptionView();

        controller.create(prescription);

        verify(restTemplate).postForObject(
                PRESCRIPTION_SERVICE_URL,
                prescription,
                PrescriptionView.class
        );
    }
}
