package pe.edu.cibertec.Starbucks_Clone.repository;

import com.sun.jdi.Value;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.cibertec.Starbucks_Clone.model.bd.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    Usuario findByNomusuario(String nomusuario);


    @Query(value = "UPDATE usuario SET nombres=:nombres, apellidos=:apellidos," +
            "activo=:activo where idusuario=:idusuario", nativeQuery = true)
    void actualizarUsuario(@Param("nombres") String nombres,
                           @Param("apellidos") String apellidos,
                           @Param("activo") Boolean activo,
                           @Param("idusuario") Integer idusaurio);

}
