import java.util.ArrayList;
/**
 La clase Concesionario representa una colección de coche.
 Permite agregar, listar e imprimir los coche almacenados.
 */
public class Concesionario {


    private ArrayList<Auto> autos;

    /**
     Constructor de la clase Concesionario.
     Inicializa la lista de coches.
     */
    public Concesionario() {
        autos = new ArrayList<>();
    }
    /**
     Agrega un coche a la lista del concesionario.
     @param auto El coche a agregar.
     */

    public void agregarAuto(Auto auto) {
        autos.add(auto);
    }
    /**
     Devuelve una lista de todos los coches almacenados en el concesionario.
     @return La lista de autos.
     */
    public ArrayList<Auto> listarAutos() {
        return autos;
    }
    /**
     Imprime los detalles de todos los coches almacenados en el concesionario.
     */

    public void imprimirAutos(){
        for (Auto auto: autos){
            System.out.println(auto);
        }
    }
}
