package Modelo;

import java.util.ArrayList;
import java.util.Scanner;

public class Anotacion extends Bitacora{

    private String observaciones;
    private String fechaRegistro;
    Scanner leer = new Scanner(System.in);

    public Anotacion() {
    }

    public Anotacion(String observaciones, String fechaRegistro) {
        this.observaciones = observaciones;
        this.fechaRegistro = fechaRegistro;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    
    ArrayList<Anotacion> listaAnotaciones = new ArrayList();
    Anotacion anotacion1[] = new Anotacion[50];
    int numero = getNcaso();
    
    public void PedirObservaciones() {
        System.out.println("Introduzca el numero de anotaciones : ");
        int numcasos = Leer.nextInt();
        setNcaso(numcasos);
        for (int i = 0; i < numcasos; i++) {

            System.out.println("----------|INGRESE LAS ANOTACIONES DEL CASO "+(i+1)+"|----------");
            System.out.println("Ingrese las observaciones del caso: ");
            observaciones = leer.next();
            setObservaciones(observaciones);
            System.out.println("Ingrese la fecha de Registro: ");
            fechaRegistro = leer.next();
            setFechaRegistro(fechaRegistro);
            anotacion1[i] = new Anotacion(observaciones, fechaRegistro);
            listaAnotaciones.add(anotacion1[i]);
        }
    }

    public static void imprimir1(Anotacion anotacion1) {
        System.out.println("----------|ANOTACIONES DEL DETECTIVE|----------");
        System.out.println("Las observaciones del caso son: " + anotacion1.getObservaciones() + "\n" + "La fecha del Registro es: " + anotacion1.getFechaRegistro());

    }

    public void mostarInfoAnota() {

        for (Anotacion anotacion1 : listaAnotaciones) {
            imprimir1(anotacion1);

        }
    }
   public void BorrarAnotacion(){
        System.out.println("Escriba cuantas anotaciones desea borrar");
        int B = Leer.nextInt();
        for (int i = 0; i < B; i++) {
            System.out.println("Escriba la fecha de registo que quiere borra:");
            String fecha = Leer.next();
            int indice = listaAnotaciones.indexOf(anotacion1[i]);
            if (indice != -1) {
                listaAnotaciones.remove(indice);
                System.out.println("++++++++++++++++++++++++++");
                System.out.println("Anotacion Eliminada");
                System.out.println("++++++++++++++++++++++++++");
            } else {
                System.out.println("++++++++++++++++++++++++++");
                System.out.println("Dato no Encontrado");
                System.out.println("++++++++++++++++++++++++++");
            }
        }  
        }  
    
    
}
