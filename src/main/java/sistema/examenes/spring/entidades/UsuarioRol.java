package sistema.examenes.spring.entidades;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class UsuarioRol {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long usuarioRolId;
	
	
	@ManyToOne(fetch= FetchType.EAGER)
	private Usuario usuario;
	
	@ManyToOne
	private Rol rol;
}
