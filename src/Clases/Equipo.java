
package Clases;
import java.util.ArrayList;

public class Equipo {
    private String nombreEquipo;
    private String siglas;
    private static int tiempoTotalEquipo;
    private ArrayList<Ciclista> ciclistas;

    public Equipo(String nombreEquipo, String siglas) {
        this.nombreEquipo = nombreEquipo;
        this.siglas = siglas;
        this.ciclistas = new ArrayList<>();
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getSiglas() {
        return siglas;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }

    public static int getTiempoTotal() {
        return tiempoTotalEquipo;
    }

    public static void setTiempoTotal(int tiempo) {
        tiempoTotalEquipo = tiempo;
    }

    public void añadirCiclista(Ciclista ciclista) {
        ciclistas.add(ciclista);
    }

    public void imprimirDatos() {
        System.out.println("Equipo: " + nombreEquipo + " (" + siglas + ")");
        System.out.println("Tiempo Total del Equipo: " + tiempoTotalEquipo);
        for (Ciclista ciclista : ciclistas) {
            ciclista.imprimirDatos();
        }
    }
}
    

