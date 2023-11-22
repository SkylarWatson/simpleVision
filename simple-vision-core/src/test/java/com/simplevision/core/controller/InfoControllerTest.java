package com.simplevision.core.controller;

import com.simplevision.core.service.InfoService;
import com.simplevision.core.view.PatientView;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class InfoControllerTest {
    @InjectMocks private InfoController controller;
    @Mock private InfoService service;

    @Test
    public void findPatientById() {
        PatientView patient = new PatientView();

        when(service.findPatientById(anyLong())).thenReturn(patient);

        assertEquals(patient, controller.findPatientById(1));
    }

    @Test
    public void findPatientByEmail() {
        PatientView patient = new PatientView();

        when(service.findPatientByEmail(anyString())).thenReturn(patient);

        assertEquals(patient, controller.findPatientBy("email", null));
    }

    @Test
    public void findPatientByPhone() {
        PatientView patient = new PatientView();

        when(service.findPatientByPhone(anyString())).thenReturn(patient);

        assertEquals(patient, controller.findPatientBy(null, "phone"));
    }

    @Test
    public void findPatientNotHavingAnyParams() {
        assertNull(controller.findPatientBy(null, null));
    }

    @Test
    public void createPatient() {
        PatientView patient = new PatientView();

        controller.create(patient);

        verify(service).create(patient);
    }
}