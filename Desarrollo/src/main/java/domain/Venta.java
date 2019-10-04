package domain;

public class Venta extends Operacion {

    public double calcularComision(Inmueble unInmueble){
        return unInmueble.precioTotal() * 0.015;
    }


}
