package pe.edu.cibertec.Starbucks_Clone.service;

import pe.edu.cibertec.Starbucks_Clone.model.bd.Usuario;

import java.util.List;
import java.util.Optional;

public interface IUsuarioService {
    List<Usuario> usuarioList();
    Optional<Usuario> buscarusuarioXID(Integer id);
    Usuario agregarUsuario(Usuario usuario);
    Usuario actualizarUsuario(Integer id, Usuario usuario);
}
