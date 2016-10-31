package incisob;

public class Combustible {
    
    String tipo=null;
    Double Cantidad = 0.00;    
    
    public Combustible(String inTipo, Double inCantidad) {
        super();
        tipo=inTipo;
        Cantidad=inCantidad;
    }

    public void setCantidad(Double Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getTipo() {
        return tipo;
    }

    public Double getCantidad() {
        return Cantidad;
    }
}
