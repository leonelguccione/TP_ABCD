package incisoa;

public class Alas {
    Integer Cantidad_Alas =0;
    String Tipo_Alas = null;
    
    public Alas(Integer inCantidad, String inTipo) {
        super();
        Cantidad_Alas = inCantidad;
        Tipo_Alas = inTipo;
    }


    public Integer getCantidad_Alas() {
        return Cantidad_Alas;
    }

    public String getTipo_Alas() {
        return Tipo_Alas;
    }


    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Alas)) {
            return false;
        }
        final Alas other = (Alas) object;
        if (!(Cantidad_Alas == null ? other.Cantidad_Alas == null : Cantidad_Alas.equals(other.Cantidad_Alas))) {
            return false;
        }
        if (!(Tipo_Alas == null ? other.Tipo_Alas == null : Tipo_Alas.equals(other.Tipo_Alas))) {
            return false;
        }
        return true;
    }

}
