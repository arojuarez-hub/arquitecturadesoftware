package uia.com.api.neo4jinventario.service;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.stereotype.Service;
import uia.com.api.neo4jinventario.model.Item;
import uia.com.api.neo4jinventario.repository.ItemRepository;
import uia.com.api.neo4jinventario.dto.ItemDTO;
import uia.com.api.neo4jinventario.mapper.ApiMapper;
import javax.xml.validation.*;
import java.util.Set;

@Service
public class ItemService {
    ItemRepository repository;
    Validator validator;

    @Autowired
    public ItemService(ItemRepository repository, Validator validator) {
        this.repository = repository;
        this.validator = validator;
    }

    public ItemDTO save(ItemDTO item) {
        return saveInformation(item);
    }

    public ItemDTO update(ItemDTO item) {
        return saveInformation(item);
    }

    private ItemDTO saveInformation(ItemDTO item) {
        Item entity = ApiMapper.INSTANCE.DTOToEntity(item);
        Set<ConstraintViolation<Item>> violations = validator.validate(entity);
        if (!violations.isEmpty()) {
            throw new ConstraintViolationException(violations);
        }

        Item savedEntity = repository.save(entity);
        return ApiMapper.INSTANCE.entityToDTO(savedEntity);

    }

}
