package incisof;

public class Horas_Extras extends Concepto {
    public Horas_Extras(double inCant, double inVal) {
        super();
        this.setDescripcion("Horas Extras");
        this.setCantidad(inCant);
        this.setValor(inVal);
    }

    @Override
    public Double calculo() {
         return this.getCantidad()*this.getValor();
    }
}
