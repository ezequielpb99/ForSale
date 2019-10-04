package domain;

public class PH extends Inmueble {

    @Override
    public double precioTotal(){
        return (super.getMetros2()*14000) + super.precioPlus() + 500000;
    }

}
