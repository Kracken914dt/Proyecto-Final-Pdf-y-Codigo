
package Persistencia;
import Excepciones.ExcepcionArchivo;
import Modelo.Caso;
import java.util.List;
public interface ICasosDao {
    void insertarPublicacion(Caso p) throws ExcepcionArchivo;
    List<Caso> leerPublicaciones()throws ExcepcionArchivo;
    Caso buscarPublicacion(Caso p)throws ExcepcionArchivo;
    Caso eliminarPublicacion(Caso p)throws ExcepcionArchivo;
}
