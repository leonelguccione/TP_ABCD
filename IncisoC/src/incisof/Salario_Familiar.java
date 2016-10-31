package incisof;

public class Salario_Familiar extends Concepto {
    public Salario_Familiar(String inDescrip, double inCant, double inVal) {
        super();
        this.setDescripcion(inDescrip);
        this.setCantidad(inCant);
        this.setValor(inVal);
    }  

    @Override
    public Double calculo() {
        return this.getCantidad()*this.getValor();
    }
}
