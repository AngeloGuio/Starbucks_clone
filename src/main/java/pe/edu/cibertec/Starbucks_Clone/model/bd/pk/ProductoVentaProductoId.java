package pe.edu.cibertec.Starbucks_Clone.model.bd.pk;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Embeddable
public class ProductoVentaProductoId implements Serializable {

    private Integer idproducto;
    private Integer codventapro;
    private Integer idtipopago;

}
