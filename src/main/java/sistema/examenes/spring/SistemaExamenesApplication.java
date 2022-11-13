package sistema.examenes.spring;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import sistema.examenes.spring.entidades.Rol;
import sistema.examenes.spring.entidades.Usuario;
import sistema.examenes.spring.entidades.UsuarioRol;
import sistema.examenes.spring.servicios.UsuarioService;

@SpringBootApplication
public class SistemaExamenesApplication implements CommandLineRunner{

	@Autowired
	private UsuarioService usuarioService;
	
	public static void main(String[] args) {
		SpringApplication.run(SistemaExamenesApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception{
		/*Usuario usuario=new Usuario();
		usuario.setNombre("Christian");
		usuario.setApellido("Ramirez");
		usuario.setUsername("christian");
		usuario.setPassword("12345");
		usuario.setEmail("c1@gmail.com");
		usuario.setTelefono("938626150");
		usuario.setPerfil("foto.png");
		
		Rol rol=new Rol();
		rol.setRolId(1L);
		rol.setNombre("ADMIN");
		
		Set<UsuarioRol> usuarioRoles=new HashSet<>();
		
		UsuarioRol usuarioRol= new UsuarioRol();
		usuarioRol.setRol(rol);
		usuarioRol.setUsuario(usuario);
		
		usuarioRoles.add(usuarioRol);
		
		Usuario usuarioGuardado=usuarioService.guardarUsuario(usuario, usuarioRoles);
		System.out.print(usuarioGuardado.getUsername());*/
	}

}
