package domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DomainTest {
    //Inmuebles
    private Casa casa1;
    private Casa casa2;
    private Casa casa3;
    private PH ph1;
    private PH ph2;
    private PH ph3;
    private Departamento depto1;
    private Departamento depto2;
    private Departamento depto3;

    //Zonas
    private Zona palermo;
    private Zona recoleta;
    private Zona lugano;
    private Zona urquiza;
    private Zona liniers;
    private Zona mataderos;

    //Operacioes
    private Alquiler alquiler1;
    private Alquiler alquiler2;
    private Alquiler alquiler3;
    private Venta venta1;
    private Venta venta2;
    private Venta venta3;

    //Empleados
    private Empleado emp1;
    private Empleado emp2;
    private Empleado emp3;
    private Empleado emp4;

    //Clientes
    private Cliente cliente1;
    private Cliente cliente2;
    private Cliente cliente3;
    private Cliente cliente4;




    @Before
    public void Init(){
        //Zona
        this.palermo = new Zona(40000, "Palermo");
        this.recoleta = new Zona(60000, "Recoleta");
        this.lugano = new Zona(10000, "Lugano");
        this.urquiza = new Zona(20000, "Urquiza");
        this.liniers = new Zona(50000, "Liniers");
        this.mataderos = new Zona(30000, "Mataderos");

        //Operacion
        this.alquiler1 = new Alquiler(24);
        this.alquiler2 = new Alquiler(48);
        this.alquiler3 = new Alquiler(36);
        this.venta1 = new Venta();
        this.venta2 = new Venta();
        this.venta3 = new Venta();

        //Inmueble
        this.depto1 = new Departamento(800, 2, palermo, alquiler1);
        this.depto2 = new Departamento(950, 3, liniers, alquiler2);
        this.depto3 = new Departamento(420, 1, mataderos, venta1);
        this.ph1 = new PH(1600, 5, urquiza, alquiler3);
        this.ph2 = new PH(1300, 4, recoleta, venta2);
        this.ph3 = new PH(1000, 3, palermo, venta3);
        this.casa1 = new Casa(1860, 4, lugano, venta2, 500000);
        this.casa2 = new Casa(1700, 3, liniers, venta1, 752000);
        this.casa3 = new Casa(2000, 4, urquiza, venta3, 1275000);

        //Cliente
        this.cliente1 = new Cliente(42201756, "Ezequiel");
        this.cliente2 = new Cliente(41236554, "Agustin");
        this.cliente3 = new Cliente(26895424, "Carlos");
        this.cliente4 = new Cliente(45024578, "Ignacio");

        //Empleado
        this.emp1 = new Empleado(40687125, "Pablo");
        this.emp2 = new Empleado(42168952, "Alejandro");
        this.emp3 = new Empleado(48751455, "Matias");
        this.emp4 = new Empleado(44541741, "Julian");



    }

    @Test
    public void CalcularComisionTest(){
        this.emp1.ConcretarOperacion(depto1, alquiler1, cliente1);
        Assert.assertEquals(alquiler1.calcularComision(depto1), emp1.getComision(),0);
    }


    @Test
    public void MejorEmpleadoTest(){
        List<Empleado> empleados = new ArrayList<>();
        this.emp1.ConcretarOperacion(depto1, alquiler1, cliente1);
        this.emp2.ConcretarOperacion(ph2, venta3, cliente3);
        this.emp3.ConcretarOperacion(casa1, venta1, cliente4);
        this.emp4.ConcretarOperacion(depto3, alquiler3, cliente2);
        this.emp1.ConcretarOperacion(ph3, alquiler2, cliente1);
        this.emp4.ConcretarOperacion(casa3, venta2, cliente2);
        this.emp2.ConcretarOperacion(depto2, alquiler1, cliente4);
        this.emp3.ConcretarOperacion(casa2, venta3, cliente2);

        empleados.add(emp1);
        empleados.add(emp2);
        empleados.add(emp3);
        empleados.add(emp4);


        Assert.assertEquals(emp4, Collections.max(empleados, Comparator.comparing(e -> e.getComision())));
        Assert.assertEquals(emp4, Collections.max(empleados, Comparator.comparing(e -> e.getCantOperacionesReservadas())));
        Assert.assertEquals(emp4, Collections.max(empleados, Comparator.comparing(e -> e.getCantOperacionesConcretadas())));



    }

}
