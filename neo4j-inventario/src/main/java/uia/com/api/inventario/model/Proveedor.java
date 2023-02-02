package uia.com.api.neo4jinventario.model;

import org.springframework.data.neo4j.core.schema.*;

@Node("Proveedor")
public class Proveedor {
    @Id
    @GeneratedValue
    private Long id;
    @Property("name")
    private String name;
    @Property("estatus")
    private String estatus;
    @Property("clase")
    private String clase;
    private @Relationship Item item;


    public Proveedor(String name, String estatus, String clase) {
        this.name = name;
        this.estatus = estatus;
        this.clase = clase;
    }

    public Proveedor() {
    }


}
