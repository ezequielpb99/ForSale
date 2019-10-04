package domain;

public class Operacion {

    public EstadoOperacion getEstado() {
        return estado;
    }
    public void setEstado(EstadoOperacion estado) {
        this.estado = estado;
    }

    private EstadoOperacion estado;

    public double calcularComision(Inmueble unInmueble){
        return 0;
    }

    public void reservar(Cliente unCliente, Empleado unEmpleado, Inmueble unInmueble){
        estado.reservar(unCliente, unEmpleado, unInmueble);
    }

    public void cambiarEstado(EstadoOperacion estadoOperacion){
        this.setEstado(estadoOperacion);
    }
}
