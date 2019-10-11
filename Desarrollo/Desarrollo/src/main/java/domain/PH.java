package domain;

public class PH extends Inmueble {

    public PH(double metros2, int ambientes, Zona zona, Operacion operacion) {
        super(metros2, ambientes, zona, operacion);
    }

    @Override
    public double precioTotal(){
        return (super.getMetros2()*14000) + super.precioPlus() + 500000;
    }

}
