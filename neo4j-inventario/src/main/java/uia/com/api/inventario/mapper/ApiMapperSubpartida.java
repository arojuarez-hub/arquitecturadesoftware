package uia.com.api.inventario.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import uia.com.api.inventario.dto.SubpartidaDTO;
import uia.com.api.inventario.model.Subpartida;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ApiMapperSubpartida {

    ApiMapperSubpartida INSTANCE = Mappers.getMapper(ApiMapperSubpartida.class);

    SubpartidaDTO entityToDTO(Subpartida subpartida);

    Subpartida DTOToEntity(SubpartidaDTO subpartidaDTO);

    //@Mapping(target="partidas", ignore = true)
    List<Subpartida> entityToDTO(Iterable<SubpartidaDTO> subpartida);

    List<Subpartida> DTOToEntities(List<SubpartidaDTO> subpartidas);
}
