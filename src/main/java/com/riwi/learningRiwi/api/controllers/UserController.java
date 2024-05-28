package com.riwi.learningRiwi.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.riwi.learningRiwi.api.dtos.requests.UserRequest;
import com.riwi.learningRiwi.api.dtos.responses.UserFullResponse;
import com.riwi.learningRiwi.infractructure.abstract_services.IUserService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "/user")
@AllArgsConstructor
public class UserController implements BaseController<UserRequest, UserFullResponse, String> {
    @Autowired
    private final IUserService service;

    @PostMapping
    public ResponseEntity<UserFullResponse> create(
            @Validated @RequestBody UserRequest request) {
        return ResponseEntity.ok(this.service.create(request));
    }

    @Override
    public ResponseEntity<UserFullResponse> get(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public ResponseEntity<Page<UserFullResponse>> getAll(int page, int size) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

    @Override
    public ResponseEntity<UserFullResponse> update(UserRequest request, String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public ResponseEntity<Void> delete(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

}
