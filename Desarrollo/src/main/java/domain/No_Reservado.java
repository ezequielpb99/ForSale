package domain;

public class No_Reservado implements EstadoOperacion{

    @Override
    public void reservar(Cliente unCliente, Empleado unEmpleado, Inmueble unInmueble, Operacion operacion) {
        operacion.cambiarEstado(new Reservado);
    }
}
