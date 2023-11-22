package com.simplevision.prescription.controller;

import com.simplevision.core.service.InfoService;
import com.simplevision.core.view.PrescriptionView;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class PrescriptionControllerTest {
    @InjectMocks private PrescriptionController controller;
    @Mock private InfoService service;

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
}
