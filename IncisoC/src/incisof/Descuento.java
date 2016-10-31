package incisof;

public class Descuento extends Concepto {

    public Descuento(String inDescr, double inValor)
    {
        super();
        this.setDescripcion(inDescr);
        this.setCantidad(1.00);
        this.setValor(inValor);
    }

    @Override
    public Double calculo() {
        return (-1)*this.getValor();
    }
    
}
