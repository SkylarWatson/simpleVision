package com.simplevision.core.mapper;

import com.simplevision.core.domain.Info;
import com.simplevision.core.view.PatientView;
import org.springframework.stereotype.Component;

@Component
public class PatientMapper {
    public PatientView map(Info patient) {
        PatientView patientView = new PatientView();
        patientView.setName(patient.getName());
        patientView.setAddress(patient.getAddress());
        patientView.setPhoneNumber(patient.getPhoneNumber());
        patientView.setEmail(patient.getEmail());
        return patientView;
    }

    public Info map(PatientView patient) {
        Info info = new Info();
        info.setName(patient.getName());
        info.setEmail(patient.getEmail());
        info.setPhoneNumber(patient.getPhoneNumber());
        info.setAddress(patient.getAddress());
        return info;
    }
}
