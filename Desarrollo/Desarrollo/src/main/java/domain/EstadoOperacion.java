package domain;

public interface EstadoOperacion {

   public void reservar(Cliente unCliente, Empleado unEmpleado, Inmueble unInmueble, Operacion operacion);
   public void concretar(Cliente unCliente, Empleado unEmpleado, Inmueble unInmueble, Operacion operacion);


}
