package domain;

public class Casa extends Inmueble {
    private double valor;


    @Override
    public double precioTotal(){
        return this.valor+super.precioPlus();
    }

}
