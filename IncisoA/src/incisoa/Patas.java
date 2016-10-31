package incisoa;

public class Patas {
    
    Integer Cantidad_Patas = 0;
    String Tipo_de_Patas = null;
    
    public Patas(Integer inPatas, String inTipo) 
    {
        super();
        Cantidad_Patas = inPatas;
        Tipo_de_Patas = inTipo;
    }

    public Integer getCantidad_Patas() 
    {
        return Cantidad_Patas;
    }

    public String getTipo_de_Patas() 
    {
        return Tipo_de_Patas;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Patas)) {
            return false;
        }
        final Patas other = (Patas) object;
        if (!(Cantidad_Patas == null ? other.Cantidad_Patas == null : Cantidad_Patas.equals(other.Cantidad_Patas))) {
            return false;
        }
        if (!(Tipo_de_Patas == null ? other.Tipo_de_Patas == null : Tipo_de_Patas.equals(other.Tipo_de_Patas))) {
            return false;
        }
        return true;
    }

   
}
