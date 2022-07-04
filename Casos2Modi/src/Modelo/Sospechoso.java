package Modelo;

import java.util.Scanner;
import java.util.ArrayList;

public class Sospechoso extends DatosdeDyS implements MensajeDetectiveySospechoso{

    private int edad;
    private String descripcionFisica;
    private String alias;
    Scanner leer = new Scanner(System.in);

    public Sospechoso() {
    }

    public Sospechoso(int edad, String descripcionFisica, String alias, int noID, String nombres, String apellidos) {
        super(noID, nombres, apellidos);
        this.edad = edad;
        this.descripcionFisica = descripcionFisica;
        this.alias = alias;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDescripcionFisica() {
        return descripcionFisica;
    }

    public void setDescripcionFisica(String descripcionFisica) {
        this.descripcionFisica = descripcionFisica;
    }

  
    ArrayList<Sospechoso> listaspSospechoso = new ArrayList();
    Sospechoso sospechoso1[] = new Sospechoso[50];

    public void DatoSospechoso() {
        System.out.println("Introduzca cuantos sospechosos quiere resgistrar: ");
        int numSospe = leer.nextInt();
        for (int i = 0; i < numSospe; i++) {

            System.out.println("----------|INGRESE LOS DATOS DEL SOSPECHOSO "+(i+1)+"|----------");
            System.out.println("Ingrese su numero de id: ");
            noID = leer.nextInt();
            setNoID(noID);
            System.out.println("Ingrese su nombre: ");
            String nombres = leer.next();
            setNombres(nombres);
            System.out.println("Ingrese su Apellido: ");
            String apellidos = leer.next();
            setApellidos(apellidos);
            System.out.println("Ingrese su edad: ");
            edad = leer.nextInt();
            setEdad(edad);
            System.out.println("Ingrese el alias: ");
            alias = leer.next();
            setAlias(alias);
            sospechoso1[i]=new Sospechoso(edad, descripcionFisica, alias, noID, nombres, apellidos);
            listaspSospechoso.add(sospechoso1[i]);
        }
    }
    @Override
    public void MensajeS(Sospechoso sospechoso1) {
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("----------|DATOS DEL SOSPECHOSO|----------");
        System.out.println("Su id es: " + sospechoso1.getNoID() + "\n" + "Su nombre es: " + sospechoso1.getNombres() + "\n" + "Su apellido es: " + sospechoso1.getApellidos() + "\n" +"Su alias es: " + sospechoso1.getAlias() + "\n" +"Su edad es: " + sospechoso1.getEdad());
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }

    public void mostarInfoSospechoso() {
        for (Sospechoso sospechoso1 : listaspSospechoso) {
            MensajeS(sospechoso1);

        }
    }

    public void obtenerfoto() {
    }

    @Override
    public void MensajeD(Detective nada) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void BorrarSospechoso(){
        System.out.println("Ingrese cuantos sospechoso desea borrar");
        int B = leer.nextInt();
        for (int i = 0; i < B; i++) {
            System.out.println("Ingrese el numero de identificacion del sospechoso:");
            int noID = leer.nextInt();
            int indice = listaspSospechoso.indexOf(sospechoso1[i]);
            if (indice != -1) {
                listaspSospechoso.remove(indice);
                System.out.println("++++++++++++++++++++++++++");
                System.out.println("Sospechoso Eliminado");
                System.out.println("++++++++++++++++++++++++++");
            } else {
                System.out.println("++++++++++++++++++++++++++");
                System.out.println("Sospechoso no Encontrado");
                System.out.println("++++++++++++++++++++++++++");
            }
        }  
        }  

}
