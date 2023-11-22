package com.simplevision.prescription.service;

import com.simplevision.core.domain.Prescription;
import com.simplevision.core.mapper.PrescriptionMapper;
import com.simplevision.core.repository.PrescriptionRepository;
import com.simplevision.core.view.PrescriptionView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrescriptionService {
    @Autowired private PrescriptionRepository prescriptionRepository;
    @Autowired private PrescriptionMapper prescriptionMapper;

    public PrescriptionView findPrescriptionById(long id) {
        return prescriptionMapper.map(prescriptionRepository.findById(id).get());
    }

    public Prescription create(PrescriptionView prescription) {
        return prescriptionRepository.save(prescriptionMapper.map(prescription));
    }
}
