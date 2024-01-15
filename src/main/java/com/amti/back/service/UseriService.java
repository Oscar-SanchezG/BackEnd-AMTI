package com.amti.back.service;

import com.amti.back.persitence.entity.UseriEntity;
import com.amti.back.persitence.repository.UseriRepository;
import com.amti.back.service.dto.UseriDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UseriService {
    private final UseriRepository useriRepository;
    @Autowired
    public UseriService(UseriRepository useriRepository) {
        this.useriRepository = useriRepository;
    }

    @Transactional
    public List<UseriEntity> getUseri(UseriDto useriDto) {
        return this.useriRepository.getUseri(useriDto.getUseri(),useriDto.getEmail());
    }
}
