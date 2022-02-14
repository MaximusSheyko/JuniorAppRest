package com.example.juniorapprest.service;

import com.example.juniorapprest.dto.BodyResponse;
import org.springframework.stereotype.Service;

@Service
public class BodyServiceImpl implements BodyService{

    @Override
    public BodyResponse findById(Long id) {
        return (id == 1) ? new BodyResponse(TestData.FULLNAME.getFullname()) : null;
    }
}
