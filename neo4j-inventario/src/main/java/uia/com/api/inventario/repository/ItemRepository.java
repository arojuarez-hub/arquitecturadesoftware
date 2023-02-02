package uia.com.api.neo4jinventario.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import uia.com.api.neo4jinventario.model.Item;
import java.util.List;

public interface ItemRepository extends CrudRepository<Item, Long>,QueryByExampleExecutor<Item> {
        List<Item> findByName(String name);
}
