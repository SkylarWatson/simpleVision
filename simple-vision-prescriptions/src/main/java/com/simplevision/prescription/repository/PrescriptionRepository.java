package com.simplevision.prescription.repository;

import com.simplevision.prescription.domain.Prescription;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PrescriptionRepository extends CrudRepository<Prescription, UUID> {

}
