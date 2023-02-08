package uia.com.api.inventario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uia.com.api.inventario.dto.CategoriasDTO;
import uia.com.api.inventario.service.CategoriaService;

@RestController
@RequestMapping("/Categoria")
public class CategoriasController {

    private CategoriaService categoriaService;

    @Autowired
    public CategoriasController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    @PostMapping
    public ResponseEntity<CategoriasDTO> save(@RequestBody CategoriasDTO categoriasDTO) {
        CategoriasDTO response = categoriaService.save(categoriasDTO);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

}
