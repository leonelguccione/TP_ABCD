package incisob;

public class Generador {
    String Tipo_Combustible=null;
    Double EnergiaPorUnidaddeCombustible= 0.00;
    public Generador(String inTipo, Double inGeneracion)
    {
        super();
        Tipo_Combustible=inTipo;
        EnergiaPorUnidaddeCombustible=inGeneracion;
    }

    public String getTipo_Combustible() {
        return Tipo_Combustible;
    }

    public Double Genera(Combustible inComb)
    {
        Double salida=0.00;
        if (inComb.getTipo()==Tipo_Combustible) 
        {
            salida=inComb.getCantidad()/EnergiaPorUnidaddeCombustible;
            inComb.setCantidad(0.00);
        }
        return salida;
    }
    
}
