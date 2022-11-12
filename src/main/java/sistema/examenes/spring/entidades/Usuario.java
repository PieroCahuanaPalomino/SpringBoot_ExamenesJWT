package sistema.examenes.spring.entidades;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="usuarios")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long  id;
	
	private String username;
	
	private String password;
	
	private String nombre;
	
	private String apellido;
	
	private String email;
	
	private String telefono;
	
	private boolean enabled=true;
	
	private String perfil;
	
	@OneToMany(cascade=CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "usuario")
	private Set<UsuarioRol> usuarioRoles=new HashSet<>();
}
