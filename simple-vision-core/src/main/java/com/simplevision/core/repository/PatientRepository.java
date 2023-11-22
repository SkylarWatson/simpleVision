package com.simplevision.core.repository;

import com.simplevision.core.domain.Patient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends CrudRepository<Patient, Long> {
    Patient findByPhoneNumber(String number);
    Patient findByEmail(String email);
}
