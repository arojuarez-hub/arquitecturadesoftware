package uia.com.api.inventario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uia.com.api.inventario.service.ItemService;
import uia.com.api.inventario.dto.ItemDTO;

@RestController
@RequestMapping("/Item")
public class ItemController {

    private ItemService itemService;

    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @PostMapping
    public ResponseEntity<ItemDTO> save(@RequestBody ItemDTO itemDTO){
        ItemDTO response = itemService.save(itemDTO);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
