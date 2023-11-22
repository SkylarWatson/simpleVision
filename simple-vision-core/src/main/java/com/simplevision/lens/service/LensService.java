package com.simplevision.lens.service;

import com.simplevision.core.domain.Lens;
import com.simplevision.core.mapper.LensMapper;
import com.simplevision.lens.repository.LensRepository;
import com.simplevision.core.view.LensView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LensService {
    @Autowired private LensMapper lensMapper;
    @Autowired private LensRepository lensRepository;

    public Lens create(LensView lens) {
        return lensRepository.save(lensMapper.map(lens));
    }

    public LensView findLensById(long id) {
        return lensMapper.map(lensRepository.findById(id).get());
    }
}
