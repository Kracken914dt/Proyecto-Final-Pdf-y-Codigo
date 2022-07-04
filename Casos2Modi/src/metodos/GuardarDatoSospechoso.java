package metodos;

import Modelo.*;
import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;
import javax.swing.table.*;

public class GuardarDatoSospechoso {

    Vector vPrincipal = new Vector();

    public void guardar(Sospechoso unSospechoso) {
        vPrincipal.addElement(unSospechoso);
    }

    public void guardarArchivo(Sospechoso sospechoso1) {
        try {
            FileWriter fw = new FileWriter("Sospechoso.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.print(sospechoso1.getNoID());
            pw.print("|" + sospechoso1.getNombres());
            pw.print("|" + sospechoso1.getApellidos());
            pw.print("|" + sospechoso1.getEdad());
            pw.print("|" + sospechoso1.getAlias());
            pw.println("|" + sospechoso1.getDescripcionFisica());
            pw.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public DefaultTableModel listaSospechosos() {
        Vector cabeceras = new Vector();
        cabeceras.addElement("NoID");
        cabeceras.addElement("Nombres");
        cabeceras.addElement("Apellidos");
        cabeceras.addElement("Edad");
        cabeceras.addElement("Alias");
        cabeceras.addElement("DescripcionFisica");

        DefaultTableModel mdlTabla = new DefaultTableModel(cabeceras, 0);
        try {
            FileReader fr = new FileReader("Sospechoso.txt");
            BufferedReader br = new BufferedReader(fr);
            String d;
            while ((d = br.readLine()) != null) {
                StringTokenizer dato = new StringTokenizer(d, "|");
                Vector x = new Vector();
                while (dato.hasMoreTokens()) {
                    x.addElement(dato.nextToken());
                }
                mdlTabla.addRow(x);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return mdlTabla;

    }

}
