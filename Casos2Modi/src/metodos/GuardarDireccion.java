
package metodos;
import Modelo.*;
import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;
import javax.swing.table.*;

public class GuardarDireccion {
    Vector vPrincipal=new Vector();

    public GuardarDireccion() {

    }
    
    public void guardarDire(Direccion unDireccion){
        vPrincipal.addElement(unDireccion);
    }
    public void GuardarDireccion(Direccion direccion1){
        try {
            FileWriter fw=new FileWriter("Dire.txt",true);
            BufferedWriter bw=new BufferedWriter(fw);
            PrintWriter pw=new PrintWriter(bw);
            pw.print(direccion1.getCiudad());
            pw.print("|"+direccion1.getDepartamento());
            pw.print("|"+direccion1.getPais());
            pw.print("|"+direccion1.getLocalidad());
            pw.println("|"+direccion1.getUltidireconocidad());
            pw.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public DefaultTableModel listaDireccion(){
        Vector cabeceras=new Vector();
        cabeceras.addElement("Ciudad");
        cabeceras.addElement("Departamento");
        cabeceras.addElement("Pais");
        cabeceras.addElement("Localidad");
        cabeceras.addElement("UltimaDireccionConocidad");
        
        DefaultTableModel mdltabla=new DefaultTableModel(cabeceras,0);
        try {
            FileReader fr=new FileReader("Dire.txt");
            BufferedReader br=new BufferedReader(fr);
            String d;
            while((d=br.readLine())!=null){
                StringTokenizer dato=new StringTokenizer(d,"|");
                Vector x =new Vector();
                while(dato.hasMoreTokens()){
                    x.addElement(dato.nextToken());
                }
                mdltabla.addRow(x);
            
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return mdltabla;
        
        
    }
    
}
