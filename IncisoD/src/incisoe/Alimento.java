package incisoe;

public abstract class Alimento {
    
    String Descripcion ="";
    String Tipo = "";
    Double Energia_Por_unidad = 0.00;
 
    public Alimento() {
        super();
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setEnergia_Por_unidad(Double Energia_Por_unidad) {
        this.Energia_Por_unidad = Energia_Por_unidad;
    }

    public Double getEnergia_Por_unidad() {
        return Energia_Por_unidad;
    }

  
    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getTipo() {
        return Tipo;
    }

    
}
