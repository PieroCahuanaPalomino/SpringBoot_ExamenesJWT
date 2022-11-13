package sistema.examenes.spring.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sistema.examenes.spring.entidades.Rol;

public interface RolRepository extends JpaRepository<Rol,Long>{

}
