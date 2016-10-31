package incisof;

public class Empleado {
    String Legajo = "";
    String Apellido_y_Nombre="";
    String DNI="";
    Categoria Categoria_Empleado=null;
    
    public Empleado(String inLegajo, String inApellido_y_Nombre, String inDNI, Categoria inCat)
    {
        super();
        this.setLegajo(inLegajo);
        this.setApellido_y_Nombre(inApellido_y_Nombre);
        this.setDNI(inDNI);
        this.setCategoria_Empleado(inCat);
    }

    public double getSueldo()
    {
        return Categoria_Empleado.getSueldo_Basico();
    }
    
    public void setLegajo(String Legajo) {
        this.Legajo = Legajo;
    }

    public void setCategoria_Empleado(Categoria Categoria_Empleado) {
        this.Categoria_Empleado = Categoria_Empleado;
    }

    public Categoria getCategoria_Empleado() {
        return Categoria_Empleado;
    }

    public String getLegajo() {
        return Legajo;
    }

    public void setApellido_y_Nombre(String Apellido_y_Nombre) {
        this.Apellido_y_Nombre = Apellido_y_Nombre;
    }

    public String getApellido_y_Nombre() {
        return Apellido_y_Nombre;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getDNI() {
        return DNI;
    }
}
