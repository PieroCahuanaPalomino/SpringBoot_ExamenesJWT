package sistema.examenes.spring.servicios.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sistema.examenes.spring.entidades.Usuario;
import sistema.examenes.spring.entidades.UsuarioRol;
import sistema.examenes.spring.repositorios.RolRepository;
import sistema.examenes.spring.repositorios.UsuarioRepository;
import sistema.examenes.spring.servicios.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService{

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private RolRepository rolRepository;
	
	@Override
	public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception {
		Usuario usuarioLocal=usuarioRepository.findByUsername(usuario.getUsername());
		if(usuarioLocal!=null) {
			System.out.print("El usuario ya exixte");
			throw new Exception("El usuario ya esta presente");
		}else {
			for(UsuarioRol usuarioRol:usuarioRoles) {
				rolRepository.save(usuarioRol.getRol());
			}
			usuario.getUsuarioRoles().addAll(usuarioRoles);
			usuarioLocal=usuarioRepository.save(usuario);
		}
		return usuarioLocal;
	}

	@Override
	public Usuario obtenerUsuario(String username) {
		return usuarioRepository.findByUsername(username);
	}

	@Override
	public void eliminarUsuario(Long usuarioId) {
		usuarioRepository.deleteById(usuarioId);
	}

}
