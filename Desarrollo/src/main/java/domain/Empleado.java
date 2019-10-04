package domain;

public class Empleado {
    private String nombre;
    private int dni;

    public void reservar(Inmueble unInmueble, Cliente unCliente){
        unInmueble.reservar(this, unCliente);
    }

    public void ConcretarOperacion(Inmueble unInmueble, EstadoOperacion estadoOperacion, Operacion operacion){
        operacion.calcularComision(unInmueble);
        operacion.setEstado(estadoOperacion);
    }
}
