package domain;

public class Cliente {

    private int dni;
    private String nombre;

    public Cliente(int dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void reservar(Inmueble unInmueble, Empleado unEmpleado){
        unEmpleado.reservar(unInmueble, this);
    }

    public void concretar(Inmueble unInmueble, Operacion unaOperacion, Empleado unEmpleado){ unEmpleado.ConcretarOperacion(unInmueble, unaOperacion, this);}


}
