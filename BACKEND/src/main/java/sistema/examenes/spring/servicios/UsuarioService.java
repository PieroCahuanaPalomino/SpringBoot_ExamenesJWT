package sistema.examenes.spring.servicios;

import java.util.Set;

import sistema.examenes.spring.entidades.Usuario;
import sistema.examenes.spring.entidades.UsuarioRol;

public interface UsuarioService {
	public Usuario guardarUsuario(Usuario usuario,Set<UsuarioRol> usuarioRoles) throws Exception;
	public Usuario obtenerUsuario(String username);
	public void eliminarUsuario(Long usuarioId);
}
