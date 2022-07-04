
package Modelo;

public class DatosdeDyS {
    int noID;
    private String nombres;
    private String apellidos;

    public DatosdeDyS() {
    }

    public DatosdeDyS(int noID, String nombres, String apellidos) {
        this.noID = noID;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public int getNoID() {
        return noID;
    }

    public void setNoID(int noID) {
        this.noID = noID;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
}
