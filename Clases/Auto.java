import java.util.ArrayList;

  //La clase Auto representa un vehículo con una marca y un modelo específicos.


public class Auto {


    private String marca;


    private String modelo;
    /**
     Constructor de la clase coche.
     @param marca La marca del coche.
     @param modelo El modelo del coche.
     */

    public Auto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    /**
     Devuelve la marca del coche.
     @return La marca del coche.
     */

    public String getMarca() {
        return marca;
    }
    /**
     Establece la marca del coche.
     @param marca La nueva marca del coche.
     */

    public void setMarca(String marca) {
        this.marca = marca;
    }
    /**
     Devuelve el modelo del coche.
     @return El modelo del coche.
     */

    public String getModelo() {
        return modelo;
    }
    /**
     Establece el modelo del coche.
     @param modelo El nuevo modelo del coche.
     */

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    /**
     Devuelve una representación en cadena del objeto coche.
     @return Una cadena que representa el coche, incluyendo su marca y modelo.
     */

    @Override
    public String toString() {
        return "Auto [marca=" + marca + ", modelo=" + modelo + "]";
    }
}
