package uia.com.api.inventario.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import uia.com.api.inventario.dto.ItemDTO;
import uia.com.api.inventario.model.Item;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-01-25T20:31:30-0600",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 19.0.1 (Oracle Corporation)"
)
@Component
public class ApiMapperImpl implements ApiMapper {

    @Override
    public ItemDTO entityToDTO(Item country) {
        if ( country == null ) {
            return null;
        }

        ItemDTO itemDTO = new ItemDTO();

        return itemDTO;
    }

    @Override
    public Item DTOToEntity(ItemDTO country) {
        if ( country == null ) {
            return null;
        }

        Item item = new Item();

        return item;
    }

    @Override
    public List<ItemDTO> entityToDTO(Iterable<Item> item) {
        if ( item == null ) {
            return null;
        }

        List<ItemDTO> list = new ArrayList<ItemDTO>();
        for ( Item item1 : item ) {
            list.add( entityToDTO( item1 ) );
        }

        return list;
    }
}
