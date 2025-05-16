package pe.edu.cibertec.Starbucks_Clone.service;

import lombok.AllArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.Starbucks_Clone.exception.ResourceNotFoundException;
import pe.edu.cibertec.Starbucks_Clone.model.bd.Estado;
import pe.edu.cibertec.Starbucks_Clone.model.bd.Rol;
import pe.edu.cibertec.Starbucks_Clone.model.bd.Usuario;
import pe.edu.cibertec.Starbucks_Clone.repository.EstadoRepository;
import pe.edu.cibertec.Starbucks_Clone.repository.RolRepository;
import pe.edu.cibertec.Starbucks_Clone.repository.UsuarioRepository;
import pe.edu.cibertec.Starbucks_Clone.util.RandomPassword;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UsuarioService implements IUsuarioService{

    private UsuarioRepository usuarioRepository;
    private EstadoRepository estadoRepository;
    private RolRepository rolRepository;
    private RandomPassword randomPassword;
    private BCryptPasswordEncoder bCryptPasswordEncoder=
            new BCryptPasswordEncoder();

    @Override
    public List<Usuario> usuarioList() {
        return usuarioRepository.findAll();
    }

    @Override
    public Optional<Usuario> buscarusuarioXID(Integer id) {
        Optional<Usuario> usuarioOptional=usuarioRepository.findById(id);
        if (usuarioOptional.isEmpty()){ return  Optional.empty();}
        return usuarioOptional;
    }

    @Override
    public Usuario buscarUsuairoXNomnreUsuario(String nomusuario) {
        return null;
    }

    @Override
    public Usuario agregarUsuario(Usuario usuario) {
        Estado estadoActivo = estadoRepository.findById(true)
                .orElseThrow(() -> new ResourceNotFoundException("Estado ACTIVO no encontrado"));
        usuario.setEstado(estadoActivo);

        Rol rolPorDefecto = rolRepository.findById(2)
                .orElseThrow(() -> new ResourceNotFoundException("Rol por defecto no encontrado"));

        usuario.setRoles(Collections.singleton(rolPorDefecto));
        // Generamos una contraseña aleatoria si el usuario no proporciona una
        if (usuario.getPassword() == null || usuario.getPassword().isEmpty()) {
            String generatedPassword = randomPassword.generar(6); // Ejemplo de longitud 6
            usuario.setPassword(bCryptPasswordEncoder.encode(generatedPassword));
        } else {
            usuario.setPassword(bCryptPasswordEncoder.encode(usuario.getPassword()));
        }
        return usuarioRepository.save(usuario);
    }

    @Override
    public void actualizarUsaurio(Usuario usuario) {
        usuarioRepository.actualizarUsuario(
                usuario.getNombres(),usuario.getApellidos(),
                usuario.getEstado().getCodestado(), usuario.getIdusuario()
        );
    }

    @Override
    public Usuario actualizarUsuario(Integer id, Usuario usuarioActualizado) {
        Usuario usuario = usuarioRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("El usuario con ID " + id + " no existe"));

        usuario.setEmail(usuarioActualizado.getEmail());
        usuario.setNombres(usuarioActualizado.getNombres());
        usuario.setApellidos(usuarioActualizado.getApellidos());
        usuario.setDni(usuarioActualizado.getDni());
        usuario.setTelefono(usuarioActualizado.getTelefono());


        // Actualizar el estado si es necesario
        if (usuarioActualizado.getEstado() != null) {
            usuario.setEstado(usuarioActualizado.getEstado());
        }

        // Actualizar los roles si es necesario
        if (usuarioActualizado.getRoles() != null && !usuarioActualizado.getRoles().isEmpty()) {
            usuario.setRoles(usuarioActualizado.getRoles());
        }

        return usuarioRepository.save(usuario);
    }
}
