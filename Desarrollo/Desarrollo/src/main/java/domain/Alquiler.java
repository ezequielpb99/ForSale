package domain;

public class Alquiler extends Operacion {
    private int meses;


    public Alquiler(int meses) {
        super();
        this.meses = meses;
    }

    public int getMeses() {
        return meses;
    }
    public void setMeses(int meses) {
        this.meses = meses;
    }


    public double calcularComision(Inmueble unInmueble){
        return this.meses * unInmueble.precioTotal()  / 50000;
    }

}
