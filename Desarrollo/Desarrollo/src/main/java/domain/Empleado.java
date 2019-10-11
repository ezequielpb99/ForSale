package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Empleado {
    private String nombre;
    private int dni;
    private List<Operacion> operaciones;
    private double comision;
    private int cantOperacionesConcretadas;
    private int cantOperacionesReservadas;

    public int getCantOperacionesConcretadas() {
        return cantOperacionesConcretadas;
    }
    public void setCantOperacionesConcretadas(int cantOperacionesConcretadas) {
        this.cantOperacionesConcretadas = cantOperacionesConcretadas;
    }
    public int getCantOperacionesReservadas() {
        return cantOperacionesReservadas;
    }
    public void setCantOperacionesReservadas(int cantOperacionesReservadas) {
        this.cantOperacionesReservadas = cantOperacionesReservadas;
    }
    public double getComision() {
        return comision;
    }
    public void setComision(double comision) {
        this.comision = comision;
    }

    public Empleado(int dni, String nombre) {
        this.nombre = nombre;
        this.dni = dni;
        this.comision = 0;
        this.operaciones = new ArrayList<>();
    }
    public void reservar(Inmueble unInmueble, Cliente unCliente){
        unInmueble.reservar(this, unCliente);
    }
    public void ConcretarOperacion(Inmueble unInmueble, Operacion operacion, Cliente unCliente) {
       this.comision = this.comision + operacion.calcularComision(unInmueble);
       unInmueble.concretar(this, unCliente);
    }

    public void agregarOperacion(Operacion operacion){
        operaciones.add(operacion);
    }
    public void aumentarConcretados(){
        this.cantOperacionesConcretadas++;
    }
    public void aumentarReservados(){
        this.cantOperacionesReservadas++;
    }

    /*private List<Operacion> operacionesCerradas(){
        return this.operaciones.stream().filter(o -> o.estaCerrada()).collect(Collectors.toList());
    }

    private List<Zona> zonasOperacionesCerradas(){
        return operacionesCerradas().stream().map(o -> o.zonaDelInmueble()).collect(Collectors.toList());
    }

    public boolean podesTenerproblemasCon(Empleado otroEmpleado){
        return cerrasteOperacionesEnLaMismaZonaQue(otroEmpleado) && concretasteOperacionesReservadasPor(otroEmpleado);
    }

    private boolean cerrasteOperacionesEnLaMismaZonaQue(Empleado otroEmpleado){
        List<Zona> misZonas = zonasOperacionesCerradas();
        List<Zona> zonasDelOtro = otroEmpleado. zonasOperacionesCerradas();
        return misZonas.stream().anyMatch(z -> zonasDelOtro.contains(z));
    }

    private boolean concretasteOperacionesReservadasPor(Empleado otroEmpleado){
        List<Operacion> operacionesReservadasPorElOtro = otroEmpleado.operacionesReservadas();
        return this.operacionesCerradas().stream().anyMatch(o -> operacionesReservadasPorElOtro.contains(o));
    }*/
}



