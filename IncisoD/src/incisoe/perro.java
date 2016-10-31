package incisoe;

public class perro extends Mamifero{
  
   public perro() {
        super();
    }
    
    public perro(double inNecesidad) {
        super();
        this.setNecesidades_Energeticas(inNecesidad);
        this.setTipo_Alimento("Carne");
    }
    
}
