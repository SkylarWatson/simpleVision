package com.simplevision.core.repository;

import com.simplevision.core.domain.Lens;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LensRepository extends CrudRepository<Lens, Long> {

}
