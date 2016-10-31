package incisof;

public abstract class Concepto {
    
    String Descripcion = "";
    Double Cantidad = 0.00;
    Double Valor = 0.00;

    public Concepto() {
        super();
    }


    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setCantidad(Double Cantidad) {
        this.Cantidad = Cantidad;
    }

    public Double getCantidad() {
        return Cantidad;
    }

    public void setValor(Double Valor) {
        this.Valor = Valor;
    }

    public Double getValor() {
        return Valor;
    }

    public abstract Double calculo();

}
