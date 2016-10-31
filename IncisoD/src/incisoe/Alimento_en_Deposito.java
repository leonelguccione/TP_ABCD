package incisoe;

public class Alimento_en_Deposito {
    
    Alimento Alimento_Depositado = null;
    Double Cantidad_Depositada = 0.0;    
    public Alimento_en_Deposito(Alimento inAlimento, Double inCantidad)
    {
        super();
        this.setAlimento_Depositado(inAlimento);
        this.Cantidad_Depositada = inCantidad;
    }


    public void setAlimento_Depositado(Alimento Alimento_Depositado) {
        this.Alimento_Depositado = Alimento_Depositado;
    }

    public Alimento getAlimento_Depositado() {
        return Alimento_Depositado;
    }

    public void setCantidad_Depositada(Double Cantidad_Depositada) {
        this.Cantidad_Depositada = Cantidad_Depositada;
    }

    public Double getCantidad_Depositada() {
        return Cantidad_Depositada;
    }
}
