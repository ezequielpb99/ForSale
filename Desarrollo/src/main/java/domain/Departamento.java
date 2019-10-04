package domain;

public class Departamento extends Inmueble {

    @Override
    public double precioTotal(){
        return (super.getAmbientes() * 350000)+super.precioPlus();
    }


}
