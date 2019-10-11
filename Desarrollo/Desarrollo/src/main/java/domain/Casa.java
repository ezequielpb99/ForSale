package domain;

public class Casa extends Inmueble {
    private double valor;

    public Casa(double metros2, int ambientes, Zona zona, Operacion operacion, double valor) {
        super(metros2, ambientes, zona, operacion);
        this.valor = valor;
    }

    @Override
    public double precioTotal(){
        return this.valor+super.precioPlus();
    }

}
