package com.riwi.learningRiwi.infractructure.abstract_services;

import org.springframework.data.domain.Page;

public interface BaseService<RequestDTO, ResponseDTO, ID> {
    
    public ResponseDTO create(RequestDTO request);

    public ResponseDTO get(RequestDTO request);

    public Page<ResponseDTO> getAll(int page, int size);

    public ResponseDTO update(RequestDTO request, ID id);

    public boolean delete(ID id);

}
