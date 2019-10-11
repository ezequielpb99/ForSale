package domain;

public class Reservado implements EstadoOperacion{

    @Override
    public void reservar(Cliente unCliente, Empleado unEmpleado, Inmueble unInmueble, Operacion operacion) {
    }

    @Override
    public void concretar(Cliente unCliente, Empleado unEmpleado, Inmueble unInmueble, Operacion operacion) {
        operacion.cambiarEstado(new Concretado());
        unEmpleado.aumentarConcretados();
    }
}