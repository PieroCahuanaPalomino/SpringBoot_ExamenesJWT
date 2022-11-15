package sistema.examenes.spring.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import sistema.examenes.spring.entidades.Usuario;
import sistema.examenes.spring.repositorios.UsuarioRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	
	//impl
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario usuario=this.usuarioRepository.findByUsername(username);
		if(usuario==null) {
			throw new UsernameNotFoundException("Usuario no encontrado");
		}
		return usuario;
	}

}
