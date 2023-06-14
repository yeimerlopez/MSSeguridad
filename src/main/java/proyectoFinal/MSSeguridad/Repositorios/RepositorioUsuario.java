package proyectoFinal.MSSeguridad.Repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;
import proyectoFinal.MSSeguridad.Modelos.Usuario;

public interface RepositorioUsuario extends MongoRepository<Usuario,String> {
}
