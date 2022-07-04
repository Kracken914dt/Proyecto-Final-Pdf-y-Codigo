package Modelo;

import java.util.Scanner;
import java.util.ArrayList;

public class Detective extends DatosdeDyS implements MensajeDetectiveySospechoso{
    
    private int año_experiencia;
    private int especializado;
    Scanner leer = new Scanner(System.in);

    public Detective() {
    }


    public Detective(int año_experiencia, int especializado, int noID, String nombres, String apellidos) {
        super(noID, nombres, apellidos);
        this.año_experiencia = año_experiencia;
        this.especializado = especializado;
    }

   
    public int getEspecializado() {
        return especializado;
    }

    public void setEspecializado(int especializado) {
        this.especializado = especializado;
    }

    public int getAño_experiencia() {
        return año_experiencia;
    }

    public void setAño_experiencia(int año_experiencia) {
        this.año_experiencia = año_experiencia;
    }
    ArrayList<Detective> listadDetectives = new ArrayList();
    Detective detective1[] = new Detective[50];

    public void DatosDetectives() {
        System.out.println("Introduzca el numero de dectectives: ");
        int numDect = leer.nextInt();
        for (int i = 0; i < numDect; i++) {

            System.out.println("----------|INGRESE DATOS DEL DETECTIVE "+(i+1)+"|----------");
            System.out.println("Ingrese su numero de identificaion: ");
            noID = leer.nextInt();
            setNoID(noID);
            System.out.println("Ingrese su nombre: ");
            String nombres = leer.next();
            setNombres(nombres);
            System.out.println("Ingrese su Apellido: ");
            String apellidos = leer.next();
            setApellidos(apellidos);
            System.out.println("Ingrese cuantos años de experiencia tiene: ");
            año_experiencia = leer.nextInt();
            setAño_experiencia(año_experiencia);
            System.out.println("Ingrese la especializacion opcion (1, 2 o 3) ( 1 = Homicidio, 2 = Cybercrimen, 3 = Narcotico): ");
            int especiali = leer.nextInt();
            setEspecializado(especiali);
            detective1[i]=new Detective(año_experiencia, especializado, noID, nombres, apellidos);
            listadDetectives.add(detective1[i]);
        }
    }

    public void imprimirEspecia() {
        switch (getEspecializado()) {
            case 1:
                System.out.println("Detective especializado en caso de Homicidio");
                break;

            case 2:
                System.out.println("Detective especializado en caso de Cybercrimen");
                break;

            case 3:
                System.out.println("Detective especializado en caso de Narcotico");
                break;
        }
    }
    @Override
    public void MensajeD(Detective detective1) {
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("----------|DATOS DEL DETECTIVE|----------");
        System.out.println("Su numero de identificacion es: " + detective1.getNoID()+ "\n" + "Su nombre es: " + detective1.getNombres() + "\n" + "Su apellido es: " + detective1.getApellidos() + "\n" + "Tienes " + detective1.getAño_experiencia() + " años de experiencia");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }

    public void mostarInfoDectectives() {
        for (Detective detective1 : listadDetectives) {
            MensajeD(detective1);
            imprimirEspecia();
            
        }
    }

    @Override
    public void MensajeS(Sospechoso nada) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
 public void BorrarDetective(){
        System.out.println("Ingrese cuantos detectives desea borrar");
        int B = leer.nextInt();
        for (int i = 0; i < B; i++) {
            System.out.println("Ingrese el numero de identificacion del detective:");
            int noID = leer.nextInt();
            int indice = listadDetectives.indexOf(detective1[i]);
            if (indice != -1) {
                listadDetectives.remove(indice);
                System.out.println("++++++++++++++++++++++++++");
                System.out.println("Detective Eliminado");
                System.out.println("++++++++++++++++++++++++++");
            } else {
                System.out.println("++++++++++++++++++++++++++");
                System.out.println("Detective no Encontrado");
                System.out.println("++++++++++++++++++++++++++");
            }
        }  
        }  
    

}
