package proyectoFinal.MSSeguridad.Repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;
import proyectoFinal.MSSeguridad.Modelos.Permiso;

public interface RepositorioPermiso extends MongoRepository<Permiso,String> {
}
