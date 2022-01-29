package com.simplevision.core.mapper;

import com.simplevision.core.domain.Info;
import com.simplevision.core.view.PatientView;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PatientMapperTest {
    @Test
    public void mapToPatient_name() {
        Info patient = new Info();
        patient.setName("name");

        assertEquals("name", new PatientMapper().map(patient).getName());
    }

    @Test
    public void mapToPatient_address() {
        Info patient = new Info();
        patient.setAddress("address");

        assertEquals("address", new PatientMapper().map(patient).getAddress());
    }

    @Test
    public void mapToPatient_phone() {
        Info patient = new Info();
        patient.setPhoneNumber("phone");

        assertEquals("phone", new PatientMapper().map(patient).getPhoneNumber());
    }

    @Test
    public void mapToPatient_email() {
        Info patient = new Info();
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
}