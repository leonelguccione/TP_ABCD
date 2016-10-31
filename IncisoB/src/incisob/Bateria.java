package incisob;

public class Bateria {
    Double Capacidad_de_Carga = 0.00;
    Double Carga = 0.00;
    public Bateria() {
        super();
    }
    
    public double cargar(Double inCarga)
    
    {
        Double Remanente=0.00;
        if ((Capacidad_de_Carga-Carga-inCarga)>=0.00) 
        {
           Carga=Carga+inCarga;
           Remanente=0.00;
        }
        else 
        {
           Remanente = inCarga + Carga - Capacidad_de_Carga;
           Carga=Capacidad_de_Carga;
        }
        return Remanente;
    }
}
