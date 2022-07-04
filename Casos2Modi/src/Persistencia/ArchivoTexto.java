
package Persistencia;
import Excepciones.*;
import Modelo.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ArchivoTexto {
    private File archivo;
    private FileWriter modoEscritura;
    private Scanner modoLectura;

    public ArchivoTexto() {
        this("RegistroCaso.Cs");
    }
    public ArchivoTexto(String ruta){
        this.archivo=new File(ruta);
    }
}

   