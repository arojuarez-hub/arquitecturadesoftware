package uia.com.api.inventario.dto;

import java.util.ArrayList;
import java.util.List;

public class CategoriasDTO {

    private List<CategoriaDTO> categorias = new ArrayList<CategoriaDTO>();

    public CategoriasDTO() {
    }

    public CategoriasDTO(List<CategoriaDTO> proveeedores) {
        this.categorias = categorias;
    }

    public List<CategoriaDTO> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<CategoriaDTO> categorias) {
        this.categorias = categorias;
    }
}
