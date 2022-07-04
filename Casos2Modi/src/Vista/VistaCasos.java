package Vista;

import Modelo.*;
import java.util.ArrayList;
import java.util.Scanner;

public class VistaCasos {

    public static void main(String[] args) {

        Oficina caso1 = new Oficina();
        Anotacion anotacion1 = new Anotacion();
        Detective detective1 = new Detective();
        Sospechoso sospechoso1 = new Sospechoso();
        Direccion direccion1 = new Direccion();
        int Opciones;

        do {

            System.out.println("----------|MENU PRINCIPAL|----------");
            System.out.println("1 Introducir dato");
            System.out.println("2 Consultar dato");
            System.out.println("3 Editar dato");
            System.out.println("4 Eliminar dato");
            System.out.println("5 Salir");
            System.out.println("-------------------------------------");
            System.out.println("Elija una opcion");
            Scanner Leer = new Scanner(System.in);
            Opciones = Leer.nextInt();
            switch (Opciones) {
                case 1:
                    System.out.println("----------|MENU DE INTRODUCCION DE DATOS|----------");
                    System.out.println("1 Introducir datos del caso");
                    System.out.println("2 Introducir datos del detective");
                    System.out.println("3 Introducir datos del sospechoso");
                    System.out.println("4 Salir");
                    System.out.println("Elija una opcion");
                    int Opciones2 = Leer.nextInt();
                    if (Opciones2 == 1) {
                        System.out.println("1 Introducir datos del caso");
                        caso1.Introducir_datos();
                        anotacion1.PedirObservaciones();
                    } else {
                        if (Opciones2 == 2) {
                            System.out.println("2 Introducir datos del detective");
                            detective1.DatosDetectives();

                        } else {
                            if (Opciones2 == 3) {
                                System.out.println("3 Introducir datos del sospechoso");
                                sospechoso1.DatoSospechoso();
                                direccion1.DatoDireccion();

                            } else {
                                if (Opciones2 == 4) {
                                    System.out.println("4 Salir");
                                    break;
                                }
                            }
                        }
                    }
                    break;
                case 2:
                    System.out.println("----------|MENU DE CONSULTAR DATOS|----------");
                    System.out.println("1 Consultar caso");
                    System.out.println("2 Consultar datos del detective");
                    System.out.println("3 Consultar datos del Sospechoso");
                    System.out.println("4 Salir");
                    System.out.println("Elija una opcion");
                    int Opciones3 = Leer.nextInt();
                    if (Opciones3 == 1) {
                        System.out.println("1 Consultar casos");
                        caso1.mostarInfoCaso();
                        anotacion1.mostarInfoAnota();
                        break;
                    } else {
                        if (Opciones3 == 2) {
                            System.out.println("2 Consultar datos del detective");
                            detective1.mostarInfoDectectives();
                            detective1.imprimirEspecia();
                            break;

                        } else {
                            if (Opciones3 == 3) {
                                System.out.println("3 Consultar datos del Sospechoso");
                                sospechoso1.mostarInfoSospechoso();
                                direccion1.mostraUltiDire();
                                break;
                                
                            } else {
                                if (Opciones3 == 4) {
                                    System.out.println("4 Salir");
                                    break;
                                }
                            }
                        }
                    }

                case 3:
                    System.out.println("3 Editar dato");
                    caso1.EditarCaso();
                    break;

                case 4:
                    System.out.println("----------|MENU DE ELIMINAR DATOS|----------");
                    System.out.println("1 Eliminar datos del caso");
                    System.out.println("2 Eliminar datos del detective");
                    System.out.println("3 Eliminar datos del Sospechoso");
                    System.out.println("4 Salir");
                    System.out.println("Elija una opcion");
                    int Opciones4 = Leer.nextInt();
                    if (Opciones4 == 1) {
                        System.out.println("1 Eliminar datos del caso");
                        caso1.Borrarcaso();
                        anotacion1.BorrarAnotacion();
                        break;
                    } else {
                        if (Opciones4 == 2) {
                            System.out.println("2 Eliminar datos del detective");
                            detective1.BorrarDetective();
                            break;

                        } else {
                            if (Opciones4 == 3) {
                                System.out.println("3 Eliminar datos del Sospechoso");  
                                sospechoso1.BorrarSospechoso();
                                break;
                                
                            } else {
                                if (Opciones4 == 4) {
                                    System.out.println("4 Salir");
                                    break;
                                }
                            }
                        }
                    }

                case 5:
                    break;
            }

        } while (Opciones != 5);

    }

}
