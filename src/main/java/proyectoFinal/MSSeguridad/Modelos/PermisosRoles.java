package proyectoFinal.MSSeguridad.Modelos;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document



public class PermisosRoles {

    @Id
    private String _id;
    @DBRef
    private Rol rol;
    @DBRef
    private Permiso permiso;


    //Constructor vacio por que en  los atributos solo esta el id
    public PermisosRoles() {
    }

    public String get_id() {
        return _id;
    }

    // no hay get para id por que el id se genera de manera automatica


    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public Permiso getPermiso() {
        return permiso;
    }

    public void setPermiso(Permiso permiso) {
        this.permiso = permiso;
    }
}


