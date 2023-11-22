package com.simplevision.core.service;

import com.simplevision.core.domain.ILens;
import com.simplevision.core.domain.IPatient;
import com.simplevision.core.domain.IPrescription;
import com.simplevision.core.domain.Prescription;
import com.simplevision.core.mapper.LensMapper;
import com.simplevision.core.mapper.PatientMapper;
import com.simplevision.core.mapper.PrescriptionMapper;
import com.simplevision.core.repository.PatientRepository;
import com.simplevision.core.repository.LensRepository;
import com.simplevision.core.repository.PrescriptionRepository;
import com.simplevision.core.view.LensView;
import com.simplevision.core.view.PatientView;
import com.simplevision.core.view.PrescriptionView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InfoService {
    @Autowired private PatientRepository patientRepository;
    @Autowired private PatientMapper patientMapper;
    @Autowired private PrescriptionMapper prescriptionMapper;
    @Autowired private LensMapper lensMapper;
    @Autowired private LensRepository lensRepository;
    @Autowired private PrescriptionRepository prescriptionRepository;

    public PatientView findPatientById(long id) {
        return patientMapper.map(patientRepository.findById(id).get());
    }

    public PatientView findPatientByEmail(String email) {
        return patientMapper.map(patientRepository.findByEmail(email));
    }

    public PatientView findPatientByPhone(String phone) {
        return patientMapper.map(patientRepository.findByPhoneNumber(phone));
    }

    public PrescriptionView findPrescriptionById(long id) {
        return prescriptionMapper.map(prescriptionRepository.findById(id).get());
    }

    public IPatient create(PatientView patient) {
        return patientRepository.save(patientMapper.map(patient));
    }

    public Prescription create(PrescriptionView prescription) {
        return prescriptionRepository.save(prescriptionMapper.map(prescription));
    }

    public ILens create(LensView lens) {
        return lensRepository.save(lensMapper.map(lens));
    }

    public LensView findLensById(long id) {
        return lensMapper.map(patientRepository.findById(id).get());
    }
}