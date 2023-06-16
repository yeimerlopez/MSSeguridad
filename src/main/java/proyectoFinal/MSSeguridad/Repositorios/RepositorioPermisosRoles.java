package proyectoFinal.MSSeguridad.Repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;
import proyectoFinal.MSSeguridad.Modelos.PermisosRoles;

public interface RepositorioPermisosRoles extends MongoRepository<PermisosRoles,String> {
}
