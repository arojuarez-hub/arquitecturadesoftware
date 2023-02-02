package uia.com.api.inventario.dto;

import java.util.ArrayList;
import java.util.List;

public class SubpartidasDTO {

    private List<SubpartidaDTO> subpartidas = new ArrayList<SubpartidaDTO>();

    public SubpartidasDTO() {
    }

    public SubpartidasDTO(List<SubpartidaDTO> subpartidas) {
        this.subpartidas = subpartidas;
    }

    public List<SubpartidaDTO> getSubpartidas() {
        return subpartidas;
    }

    public void setSubpartidas(List<SubpartidaDTO> subpartidas) {
        this.subpartidas = subpartidas;
    }
}
