package com.simplevision.core.service;

import com.simplevision.core.domain.Info;
import com.simplevision.core.mapper.LensMapper;
import com.simplevision.core.mapper.PatientMapper;
import com.simplevision.core.mapper.PrescriptionMapper;
import com.simplevision.core.repository.InfoRepository;
import com.simplevision.core.view.LensView;
import com.simplevision.core.view.PatientView;
import com.simplevision.core.view.PrescriptionView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InfoService {
    @Autowired private InfoRepository repository;
    @Autowired private PatientMapper patientMapper;
    @Autowired private PrescriptionMapper prescriptionMapper;
    @Autowired private LensMapper lensMapper;

    public PatientView findPatientById(long id) {
        return patientMapper.map(repository.findById(id).get());
    }

    public PatientView findPatientByEmail(String email) {
        return patientMapper.map(repository.findByEmail(email));
    }

    public PatientView findPatientByPhone(String phone) {
        return patientMapper.map(repository.findByPhoneNumber(phone));
    }

    public PrescriptionView findPrescriptionById(long id) {
        return prescriptionMapper.map(repository.findById(id).get());
    }

    public Info create(PatientView patient) {
        return repository.save(patientMapper.map(patient));
    }

    public Info create(PrescriptionView prescription) {
        return repository.save(prescriptionMapper.map(prescription));
    }

    public Info create(LensView lens) {
        return repository.save(lensMapper.map(lens));
    }

    public LensView findLensById(long id) {
        return lensMapper.map(repository.findById(id).get());
    }
}