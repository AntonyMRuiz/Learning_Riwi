package com.riwi.learningRiwi.infractructure.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.riwi.learningRiwi.api.dtos.requests.UserRequest;
import com.riwi.learningRiwi.api.dtos.responses.UserBaseResponse;
import com.riwi.learningRiwi.api.dtos.responses.UserFullResponse;
import com.riwi.learningRiwi.domain.entities.User;
import com.riwi.learningRiwi.domain.repositories.UserRepository;
import com.riwi.learningRiwi.infractructure.abstract_services.IUserService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserService implements IUserService {

    @Autowired
    private final UserRepository repository;

    @Override
    public UserFullResponse create(UserRequest request) {
        User user = this.resquestToEntity(request);
        return this.entityToResponse(this.repository.save(user));
    }

    @Override
    public UserFullResponse get(UserRequest request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public User findById(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public Page<UserFullResponse> getAll(int page, int size) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

    @Override
    public UserFullResponse update(UserRequest request, String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public User resquestToEntity(UserRequest request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'resquestToEntity'");
    }

    @Override
    public UserFullResponse entityToResponse(User entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'entityToResponse'");
    }

    @Override
    public UserBaseResponse entityToBaseResponse(User entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'entityToBaseResponse'");
    }

}
