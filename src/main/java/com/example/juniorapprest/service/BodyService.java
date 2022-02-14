package com.example.juniorapprest.service;

import com.example.juniorapprest.dto.BodyResponse;

import java.util.Optional;

public interface BodyService {
    BodyResponse findById(Long id);
}
