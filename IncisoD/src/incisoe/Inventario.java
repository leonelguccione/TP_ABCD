package incisoe;

import java.util.ArrayList;
import java.util.Iterator;

public class Inventario {
    
    ArrayList<Alimento_en_Deposito>Deposito = new ArrayList();
    ArrayList<Mamifero>Comensales = new ArrayList();   
                             
    public Inventario() {
        super();
    }
    
    public void agregar_Alimento_en_Deposito(Alimento_en_Deposito inAlDep)
    {
        Deposito.add(inAlDep);
    }
    
    public void agregar_Comensal(Mamifero inMam)
    {
        Comensales.add(inMam);
    }
    
    
    public double Estado_del_Deposito() 
    {
        double Existencia_de_Energia=0.00;
        Iterator iterador_deposito = Deposito.iterator();
        while (iterador_deposito.hasNext()) 
        {
            Alimento_en_Deposito InstAlDep = (Alimento_en_Deposito) iterador_deposito.next();
            double instEnergia = InstAlDep.getCantidad_Depositada()*InstAlDep.getAlimento_Depositado().getEnergia_Por_unidad();
            Existencia_de_Energia=Existencia_de_Energia+instEnergia;
        }
        return Existencia_de_Energia;
    }
    
    public void consumo()
    
    {
        Integer cantidad_Comensales = Comensales.size();
        Integer cantidad_Alimentos = Deposito.size();
        for (int i=0; i<=cantidad_Comensales; i++)
        {
            for (int j=0; j<=cantidad_Alimentos; j++)
            {
                if ((Comensales.get(i).getNecesidades_Energeticas())>0)
                {
                    if (Comensales.get(i).come(Deposito.get(j).getAlimento_Depositado()))
                    {
                        double stock_Energia=Deposito.get(j).getCantidad_Depositada()*Deposito.get(j).getAlimento_Depositado().getEnergia_Por_unidad();
                        if (Comensales.get(i).getNecesidades_Energeticas()<=stock_Energia) 
                        {
                            Deposito.get(j).setCantidad_Depositada(stock_Energia-Comensales.get(i).getNecesidades_Energeticas());
                            Comensales.get(i).setNecesidades_Energeticas(0.00);
                        }
                        else
                        {
                            Deposito.get(j).setCantidad_Depositada(0.00);
                            double diferencia=Comensales.get(i).getNecesidades_Energeticas()-stock_Energia;
                            Comensales.get(i).setNecesidades_Energeticas(diferencia);
                        }
                           
                    }
                }
            }
      
        }
    }
}
