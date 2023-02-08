package uia.com.api.inventario.service;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import jakarta.validation.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uia.com.api.inventario.dto.CategoriaDTO;
import uia.com.api.inventario.dto.CategoriasDTO;
import uia.com.api.inventario.mapper.ApiMapperCategoria;
import uia.com.api.inventario.model.Categoria;
import uia.com.api.inventario.repository.CategoriaRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
public class CategoriaService {
    CategoriaRepository repository;
    Validator validator;

    @Autowired
    public CategoriaService(CategoriaRepository repository, Validator validator) {
        this.repository = repository;
        this.validator = validator;
    }

    public CategoriasDTO save(CategoriasDTO categoria) {
        return saveInformation(categoria);
    }

    public CategoriasDTO update(CategoriasDTO categoria) {
        return saveInformation(categoria);
    }

    private CategoriaDTO saveInformation(CategoriaDTO categoria) {
        Categoria entity = ApiMapperCategoria.INSTANCE.DTOToEntity(categoria);

        Set<ConstraintViolation<Categoria>> violations = validator.validate(entity);
        if (!violations.isEmpty()) {
            throw new ConstraintViolationException(violations);
        }

        Categoria savedEntity = repository.save(entity);
        return ApiMapperCategoria.INSTANCE.entityToDTO(savedEntity);
    }

    private CategoriasDTO saveInformation(CategoriasDTO categorias) {
        List<Categoria> entities = ApiMapperCategoria.INSTANCE.DTOToEntities(categorias.getCategorias());
        List<CategoriaDTO> entitiesDTO = new ArrayList<CategoriaDTO>();
        CategoriasDTO result = new CategoriasDTO();

        for (int i = 0; i < entities.size(); i++) {
            Set<ConstraintViolation<Categoria>> violations = validator.validate(entities.get(i));
            if (!violations.isEmpty()) {
                throw new ConstraintViolationException(violations);
            }

            Categoria savedEntity = repository.save(entities.get(i));
            entitiesDTO.add(ApiMapperCategoria.INSTANCE.entityToDTO(savedEntity));
        }

        result.setCategorias(entitiesDTO);
        return result;
    }
}