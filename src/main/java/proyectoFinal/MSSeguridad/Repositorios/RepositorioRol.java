package proyectoFinal.MSSeguridad.Repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;
import proyectoFinal.MSSeguridad.Modelos.Rol;

public interface RepositorioRol extends MongoRepository<Rol,String> {
}
