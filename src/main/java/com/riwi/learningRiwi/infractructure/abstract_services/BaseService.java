package com.riwi.learningRiwi.infractructure.abstract_services;

import org.springframework.data.domain.Page;

public interface BaseService<RequestDTO, ResponseDTO, ID, Entity> {
    
    public ResponseDTO create(RequestDTO request);

    public ResponseDTO get(RequestDTO request);

    public Entity findById(ID id);

    public Page<ResponseDTO> getAll(int page, int size);

    public ResponseDTO update(RequestDTO request, ID id);

    public void delete(ID id);

    public Entity resquestToEntity(RequestDTO request);

    public ResponseDTO entityToResponse(Entity entity);

}
