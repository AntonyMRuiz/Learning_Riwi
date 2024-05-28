package com.riwi.learningRiwi.infractructure.abstract_services;

import com.riwi.learningRiwi.api.dtos.requests.UserRequest;
import com.riwi.learningRiwi.api.dtos.responses.UserBaseResponse;
import com.riwi.learningRiwi.api.dtos.responses.UserFullResponse;
import com.riwi.learningRiwi.domain.entities.UserEntity;

public interface IUserService 
    extends BaseService<
        UserRequest, 
        UserFullResponse, 
        String, 
        UserEntity
        > {
            public UserBaseResponse entityToBaseResponse(UserEntity entity);
        }
