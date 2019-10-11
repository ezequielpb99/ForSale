package domain;

public class Departamento extends Inmueble {


    public Departamento(double metros2, int ambientes, Zona zona, Operacion operacion) {
        super(metros2, ambientes, zona, operacion);
    }
    @Override
    public double precioTotal(){
        return (this.getAmbientes() * 350000)+super.precioPlus();
    }


}
