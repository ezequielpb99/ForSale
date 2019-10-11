package domain;

public abstract class Inmueble {
    private double metros2;
    private int ambientes;
    private Zona zona;
    private  Operacion operacion;

    public Inmueble(double metros2, int ambientes, Zona zona, Operacion operacion) {
        this.metros2 = metros2;
        this.ambientes = ambientes;
        this.zona = zona;
        this.operacion = operacion;
    }

    public double getMetros2() {
        return metros2;
    }
    public void setMetros2(double metros2) {
        this.metros2 = metros2;
    }
    public int getAmbientes() {
        return ambientes;
    }
    public void setAmbientes(int ambientes) {
        this.ambientes = ambientes;
    }
    public Zona getZona() {
        return zona;
    }
    public void setZona(Zona zona) {
        this.zona = zona;
    }
    public Operacion getOperacion() {
        return operacion;
    }
    public void setOperacion(Operacion operacion) {
        this.operacion = operacion;
    }


    public void reservar(Empleado unEmpleado, Cliente unCliente){
        this.operacion.reservar(unCliente, unEmpleado, this, operacion);
    }

    public void concretar(Empleado unEmpleado, Cliente unCliente){
        this.operacion.concretar(unCliente, unEmpleado, this, operacion);
    }

    public double precioPlus(){
        return this.zona.getPlus();
    }

    public double precioTotal(){
        return 0;
    }

}
