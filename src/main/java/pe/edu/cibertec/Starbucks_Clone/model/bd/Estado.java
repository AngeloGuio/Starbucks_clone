package pe.edu.cibertec.Starbucks_Clone.model.bd;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Data
@Entity
@Table(name = "estado")
public class Estado {
    @Id
    private Boolean codestado;
    @Column(name = "nombreestado")
    private String nombreestado;

}
