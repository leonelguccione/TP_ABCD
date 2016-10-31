package incisoa;

import java.util.ArrayList;
import java.util.Iterator;

public class Esuninsecto 

{
    ArrayList<Alas> ListaAlas = new ArrayList();
    ArrayList<Patas> ListaPatas = new ArrayList();
    ArrayList<Insecto> ListaInsectos = new ArrayList();
    
    public Esuninsecto() {
        super();
        
    }
    
    public void muestra_Insectos()
    {
      Iterator Iterador_Alas = ListaAlas.iterator();
      Iterator Iterador_Patas =  ListaPatas.iterator();
      Iterator Iterador_Insectos =  ListaInsectos.iterator();
            
       while (Iterador_Alas.hasNext())
         {
             Alas InstAlas= (Alas) Iterador_Alas.next();
             while (Iterador_Patas.hasNext())
             {
                 Patas InstPatas = (Patas) Iterador_Patas.next();
                 while (Iterador_Insectos.hasNext())  
                 {
                    Insecto InstInsecto = (Insecto) Iterador_Insectos.next();
                    System.out.println(InstInsecto.esonoes(InstAlas, InstPatas));
                 }
             }          
         }                            
    }
}
