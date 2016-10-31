package incisoe;

public class Vegetales extends Alimento{
    
    public Vegetales(String inDescrip, Double inEnergia ) 
    {
        super();
        this.setTipo("Vegetales");
        this.setDescripcion(inDescrip);
        this.setEnergia_Por_unidad(inEnergia);
    }
}
