package incisoe;

public class Mamifero {
    
    String Tipo_Alimento = "";
    double Necesidades_Energeticas=0.00;
            
    public Mamifero() {
        super();
    }
    
    public boolean come(Alimento inAl) 
    {
        return inAl.getTipo().equals(Tipo_Alimento);
    }

    public void setTipo_Alimento(String Tipo_Alimento) {
        this.Tipo_Alimento = Tipo_Alimento;
    }

    public String getTipo_Alimento() {
        return Tipo_Alimento;
    }

    public void setNecesidades_Energeticas(double Necesidades_Energeticas) {
        this.Necesidades_Energeticas = Necesidades_Energeticas;
    }

    public double getNecesidades_Energeticas() {
        return Necesidades_Energeticas;
    }

}
