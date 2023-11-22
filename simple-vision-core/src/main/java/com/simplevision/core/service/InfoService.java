package com.simplevision.core.service;

import com.simplevision.core.domain.Patient;
import com.simplevision.core.mapper.PatientMapper;
import com.simplevision.core.repository.PatientRepository;
import com.simplevision.core.view.PatientView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InfoService {
    @Autowired private PatientRepository patientRepository;
    @Autowired private PatientMapper patientMapper;

    public PatientView findPatientById(long id) {
        return patientMapper.map(patientRepository.findById(id).get());
    }

    public PatientView findPatientByEmail(String email) {
        return patientMapper.map(patientRepository.findByEmail(email));
    }

    public PatientView findPatientByPhone(String phone) {
        return patientMapper.map(patientRepository.findByPhoneNumber(phone));
    }

    public Patient create(PatientView patient) {
        return patientRepository.save(patientMapper.map(patient));
    }
}