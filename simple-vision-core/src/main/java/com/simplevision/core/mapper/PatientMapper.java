package com.simplevision.core.mapper;

import com.simplevision.core.domain.Info;
import com.simplevision.core.view.PatientView;
import org.springframework.stereotype.Component;

@Component
public class PatientMapper {
    public PatientView map(Info info) {
        PatientView patientView = new PatientView();
        patientView.setName(info.getName());
        patientView.setAddress(info.getAddress());
        patientView.setPhoneNumber(info.getPhoneNumber());
        patientView.setEmail(info.getEmail());
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
