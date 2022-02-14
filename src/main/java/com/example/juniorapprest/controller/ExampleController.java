package com.example.juniorapprest.controller;

import com.example.juniorapprest.dto.BodyRequest;
import com.example.juniorapprest.service.BodyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.MessageFormat;
import java.util.Objects;


@RestController
@RequestMapping("/api/user")
public class ExampleController {

    private final static String NOT_FOUND = "NULL";

    private final BodyService service;

    private final Logger LOGGER = LoggerFactory.getLogger(ExampleController.class);

    public ExampleController(BodyService service) {
        this.service = service;
    }

    @PostMapping()
    private ResponseEntity<?> user(@RequestBody BodyRequest request){
        var response = service.findById(request.getId());
        LOGGER.debug("Body {}", response);
        return (Objects.nonNull(response))
                ? ResponseEntity.ok(response)
                : ResponseEntity.status(HttpStatus.NOT_FOUND).body(NOT_FOUND);
    }

}
