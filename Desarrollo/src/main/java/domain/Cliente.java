package domain;

public class Cliente {

    private int dni;
    private String nombre;

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


}
