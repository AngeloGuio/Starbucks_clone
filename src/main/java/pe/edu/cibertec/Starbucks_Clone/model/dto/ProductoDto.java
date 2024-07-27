package pe.edu.cibertec.Starbucks_Clone.model.dto;

import lombok.Data;

@Data
public class ProductoDto implements DtoEntity{
    private Integer idproducto;
    private Integer idtipopro;
    private Integer idproveedor;
    private String nombre;
    private Integer cantidad;
    private double preciopublico;
    private Integer stockminimo;
    private Integer stockmaximo;
    private boolean codestado;
    private Integer idanimal;
    private double precioproveedor;
}
