package com.simplevision.core.repository;

import com.simplevision.core.domain.Info;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends CrudRepository<Info, Long> {
    Info findByPhoneNumber(String number);
    Info findByEmail(String email);
}
