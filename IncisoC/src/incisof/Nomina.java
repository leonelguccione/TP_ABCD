package incisof;

import java.util.ArrayList;
import java.util.Iterator;

public class Nomina {
    
    ArrayList<Liquidacion> ListaLiquidacion = new ArrayList();
    
    public Nomina() {
        super();
    }
    
     
    public void agrego_Liquidacion(Liquidacion inLiq)
    {
       ListaLiquidacion.add(inLiq);   
    }

    public void setListaLiquidacion(ArrayList<Liquidacion> ListaLiquidacion) {
        this.ListaLiquidacion = ListaLiquidacion;
    }

    public ArrayList<Liquidacion> getListaLiquidacion() {
        return ListaLiquidacion;
    }

    public void calcular_nomina(String inPeriodo)
    {
        double nomina=0.00;
        Iterator iterador_Liquidacion = ListaLiquidacion.iterator();
        while (iterador_Liquidacion.hasNext())
        {
            Liquidacion InstLiqui = (Liquidacion) iterador_Liquidacion.next();
            if (InstLiqui.getPeriodo().equals(inPeriodo))
                nomina=nomina+InstLiqui.Liquidar();
        }
        System.out.println("valor total de la nomina :" + Double.toString(nomina));
     }
}
