package com.simplevision.core.repository;

import com.simplevision.core.domain.IPrescription;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrescriptionRepository extends CrudRepository<IPrescription, Long> {

}
