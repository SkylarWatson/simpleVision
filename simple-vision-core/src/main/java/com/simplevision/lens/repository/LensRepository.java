package com.simplevision.lens.repository;

import com.simplevision.lens.domain.Lens;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LensRepository extends CrudRepository<Lens, Long> {

}
