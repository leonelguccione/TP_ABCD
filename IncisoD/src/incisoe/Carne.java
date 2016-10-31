package incisoe;

public class Carne extends Alimento
{
    public Carne(String inDescrip, Double inEnergia) {
        super();
        this.setTipo("Carne");
        this.setDescripcion(inDescrip);
        this.setEnergia_Por_unidad(inEnergia);
    }
}
