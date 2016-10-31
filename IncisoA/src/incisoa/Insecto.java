package incisoa;

public class Insecto {
    
    Alas TipoyCantidadAlas = null;
    Patas TipoyCantidadPatas = null;  
    String Tipo="";
    
    public Insecto(Alas inAlas, Patas inPatas, String inTipo)
    {
        super();
        TipoyCantidadAlas = inAlas;
        TipoyCantidadPatas = inPatas;
        Tipo = inTipo;
    }
    
    public String esonoes(Alas inAlas, Patas inPatas)
    {
        if ((inAlas.equals(TipoyCantidadAlas)) &  (inPatas.equals(TipoyCantidadPatas)))
        {
            return "Es un insecto : " + Tipo;
        }
        else
        {
            return "No es un insecto : " + Tipo;
        }
        
    }
    
    
}
