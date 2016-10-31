package incisof;

public class Categoria {
    
    private String Nombre="";
    private Double Sueldo_Basico=0.00;
        
    public Categoria(String inNombre, Double inSueldo)
    {
        super();
        this.setNombre(inNombre);
        this.setSueldo_Basico(inSueldo);
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setSueldo_Basico(Double Sueldo_Basico) {
        this.Sueldo_Basico = Sueldo_Basico;
    }

    public Double getSueldo_Basico() {
        return Sueldo_Basico;
    }

}
