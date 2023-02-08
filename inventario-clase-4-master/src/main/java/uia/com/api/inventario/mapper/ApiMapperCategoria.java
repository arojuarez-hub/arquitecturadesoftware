package uia.com.api.inventario.mapper;

import org.mapstruct.factory.Mappers;
import uia.com.api.inventario.dto.CategoriaDTO;
import uia.com.api.inventario.model.Categoria;

import java.util.List;

public interface ApiMapperCategoria {

    ApiMapperCategoria INSTANCE = Mappers.getMapper(ApiMapperCategoria.class);

    CategoriaDTO entityToDTO(Categoria categoria);

    Categoria DTOToEntity(CategoriaDTO categoriaDTO);
    //@Mapping(target="lotes", ignore = true)
    List<Categoria> entityToDTO(Iterable<CategoriaDTO> categoria);

    List<Categoria> DTOToEntities(List<CategoriaDTO> categorias);

}
