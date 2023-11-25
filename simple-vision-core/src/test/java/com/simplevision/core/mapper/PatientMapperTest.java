package com.simplevision.core.mapper;

import com.simplevision.core.domain.Patient;
import com.simplevision.core.view.PatientView;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PatientMapperTest {
    @Test
    public void mapToPatient_name() {
        Patient patient = new Patient();
        patient.setName("name");

        assertEquals("name", new PatientMapper().map(patient).getName());
    }

    @Test
    public void mapToPatient_address() {
        Patient patient = new Patient();
        patient.setAddress("address");

        assertEquals("address", new PatientMapper().map(patient).getAddress());
    }

    @Test
    public void mapToPatient_phone() {
        Patient patient = new Patient();
        patient.setPhoneNumber("phone");

        assertEquals("phone", new PatientMapper().map(patient).getPhoneNumber());
    }

    @Test
    public void mapToPatient_email() {
        Patient patient = new Patient();
        patient.setEmail("email");

        assertEquals("email", new PatientMapper().map(patient).getEmail());
    }

    @Test
    public void mapToInfo_name() {
        PatientView patient = new PatientView();
        patient.setName("name");

        assertEquals("name", new PatientMapper().map(patient).getName());
    }

    @Test
    public void mapToInfo_email() {
        PatientView patient = new PatientView();
        patient.setEmail("email");

        assertEquals("email", new PatientMapper().map(patient).getEmail());
    }

    @Test
    public void mapToInfo_phone() {
        PatientView patient = new PatientView();
        patient.setPhoneNumber("phone");

        assertEquals("phone", new PatientMapper().map(patient).getPhoneNumber());
    }

    @Test
    public void mapToInfo_address() {
        PatientView patient = new PatientView();
        patient.setAddress("address");

        assertEquals("address", new PatientMapper().map(patient).getAddress());
    }

    @Test
    public void mapToPatient_prescriptionId() {
        UUID uuid = UUID.randomUUID();

        Patient patient = new Patient();
        patient.setPrescriptionId(uuid);

        assertEquals(uuid, new PatientMapper().map(patient).getPrescriptionId());
    }

    @Test
    public void mapToInfo_prescriptionId() {
        UUID uuid = UUID.randomUUID();

        PatientView patient = new PatientView();
        patient.setPrescriptionId(uuid);

        assertEquals(uuid, new PatientMapper().map(patient).getPrescriptionId());
    }
}