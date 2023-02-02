/*
package uia.com.api.inventario.service;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import jakarta.validation.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uia.com.api.inventario.dto.SubpartidaDTO;
import uia.com.api.inventario.dto.SubpartidasDTO;
import uia.com.api.inventario.mapper.ApiMapper;
import uia.com.api.inventario.model.Subpartida;
import uia.com.api.inventario.repository.SubpartidaRepository;

import java.util.List;
import java.util.Set;

@Service
public class SubpartidaService {
    SubpartidaRepository repositorySubpartidas;

    Validator validator;

    @Autowired
    public SubpartidaService(SubpartidaRepository subpartidaRepository, Validator validator) {
        this.repositorySubpartidas = subpartidaRepository;
        this.validator = validator;
    }

    public SubpartidaDTO save(SubpartidaDTO subpartida) {
        return saveInformation(subpartida);
    }

    public SubpartidasDTO save(SubpartidasDTO subpartida) {
        return saveInformation(subpartida);
    }

    public SubpartidasDTO update(SubpartidasDTO subpartida) {
        return saveInformation(subpartida);
    }

    private SubpartidaDTO saveInformation(SubpartidaDTO subpartida) {
        Subpartida entity = ApiMapper.INSTANCE.DTOToEntity(subpartida);

        Set<ConstraintViolation<Subpartida>> violations = validator.validate(entity);
        if (!violations.isEmpty()) {
            throw new ConstraintViolationException(violations);
        }

        Subpartida savedEntity = repositorySubpartidas.save(entity);
        return ApiMapper.INSTANCE.entityToDTO(savedEntity);
    }


}
*/
