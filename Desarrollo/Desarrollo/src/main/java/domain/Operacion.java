package domain;

public class Operacion {
    private EstadoOperacion estado;

    public Operacion() {
        this.estado = new No_Reservado();
    }

    public EstadoOperacion getEstado() {
        return estado;
    }
    public void setEstado(EstadoOperacion estado) {
        this.estado = estado;
    }



    public double calcularComision(Inmueble unInmueble){
        return 0;
    }

    public void reservar(Cliente unCliente, Empleado unEmpleado, Inmueble unInmueble, Operacion operacion){
        estado.reservar(unCliente, unEmpleado, unInmueble, operacion);
        unEmpleado.agregarOperacion(operacion);
    }

    public void concretar(Cliente unCliente, Empleado unEmpleado, Inmueble unInmueble, Operacion operacion){
        estado.concretar(unCliente, unEmpleado, unInmueble, operacion);
        unEmpleado.agregarOperacion(operacion);
    }

    public void cambiarEstado(EstadoOperacion estadoOperacion){
        this.setEstado(estadoOperacion);
    }



}
