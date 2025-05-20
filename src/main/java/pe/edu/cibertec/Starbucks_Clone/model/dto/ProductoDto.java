package pe.edu.cibertec.Starbucks_Clone.model.dto;

import lombok.Data;

@Data
public class ProductoDto implements DtoEntity{

    private Integer idproducto;
    private String nombre;
    private Integer idtipopro;
    private double precio;


}
