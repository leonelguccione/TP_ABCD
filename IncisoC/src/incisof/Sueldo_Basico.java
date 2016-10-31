package incisof;

public class Sueldo_Basico extends Concepto {
    public Sueldo_Basico(Double inValor) {
        super();
        this.setDescripcion("Sueldo Basico");
        this.setCantidad(1.00);
        this.setValor(inValor);
    }

    @Override
    public Double calculo() {
       
        return this.getValor();
    }
}
