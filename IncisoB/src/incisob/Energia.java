package incisob;

import java.util.ArrayList;
import java.util.Iterator;

public class Energia {
    ArrayList<Generador> Generadores = new ArrayList();
    ArrayList<Bateria> Baterias = new ArrayList();
    ArrayList<Combustible> Combustibles = new ArrayList();
    Double Total_Energia_Generada = 0.00;
    Double Total_Perdida = 0.00;
    
    public Energia() 
    {
        super();
    }
    
    public void agrega_un_generador(Generador inGen) 
    {
        Generadores.add(inGen);    
    }
    
    public void agrega_Baterias(Bateria inBat)
    {
        Baterias.add(inBat);
    }
    
    public void agrega_Combustible(Combustible inComb) 
    {
        Combustibles.add(inComb);
    }
            
    public void muestra_energia()
    {
      Iterator Iterador_Combustibles = Combustibles.iterator();
      Iterator Iterador_Generadores =  Generadores.iterator();
      Iterator Iterador_Baterias =  Baterias.iterator();
      Double Generacion=0.00;
          
       while (Iterador_Combustibles.hasNext())
         {
             Combustible InstComb = (Combustible) Iterador_Combustibles.next();
             while (Iterador_Generadores.hasNext())
             {
                 Generador InstGen = (Generador) Iterador_Generadores.next();
                 Generacion = InstGen.Genera(InstComb);
                 Total_Energia_Generada=Total_Energia_Generada+Generacion;
                 while ((Iterador_Baterias.hasNext()) & (Generacion > 0.00)) 
                 {
                    Bateria InstBat = (Bateria) Iterador_Baterias.next();
                    Generacion=Generacion-InstBat.cargar(Generacion);
                 }
             }          
         }                            
    }
}
