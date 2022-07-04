
package Persistencia;
import Excepciones.*;
import Modelo.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class ArchivoTextoDT {
    private File archivo2;
    private FileWriter modoEscritura;
    private Scanner modoLectura;

    public ArchivoTextoDT() {
        this("RegistroDetective.Dt");
    }
    public ArchivoTextoDT(String ruta2){
        this.archivo2=new File(ruta2);
    }


}
