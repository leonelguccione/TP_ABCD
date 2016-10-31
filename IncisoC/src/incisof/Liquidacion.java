package incisof;

import java.util.ArrayList;
import java.util.Iterator;

public class Liquidacion {
    
    Empleado InstEmpl = null;
    String Periodo = "";
    ArrayList<Concepto>Conceptos = new ArrayList();
    
    public Liquidacion(Empleado inEmpl, String inPer)
    {
        super();
        this.setInstEmpl(inEmpl);
        this.setPeriodo(inPer);
        Conceptos.add(new Sueldo_Basico(inEmpl.getSueldo()));
        
    }

    public void agregar_Conceptos(Concepto inConc) 
    {
        Conceptos.add(inConc);
    }
    
    public void setConceptos(ArrayList<Concepto> Conceptos) {
        this.Conceptos = Conceptos;
    }

    public ArrayList<Concepto> getConceptos() {
        return Conceptos;
    }

    public void setInstEmpl(Empleado InstEmpl) {
        this.InstEmpl = InstEmpl;
    }

    public Empleado getInstEmpl() {
        return InstEmpl;
    }

    public void setPeriodo(String Periodo) {
        this.Periodo = Periodo;
    }

    public String getPeriodo() {
        return Periodo;
    }
    
    public double Liquidar()
    {
        double sueldo_neto=0.00;
        double valor_concepto=0.00;
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Legajo : "+InstEmpl.getLegajo());
        System.out.println("Empleado :"+InstEmpl.getApellido_y_Nombre());
        System.out.println("DNI :"+InstEmpl.getDNI());
        System.out.println("Categoria : "+InstEmpl.getCategoria_Empleado().getNombre());
        System.out.println("-----------------------------------------------------------------");
        Iterator iterador_Conceptos = Conceptos.iterator();
        while (iterador_Conceptos.hasNext())
           {
            Concepto InstCon = (Concepto) iterador_Conceptos.next(); 
            valor_concepto=InstCon.calculo();
            sueldo_neto=sueldo_neto+valor_concepto;
            System.out.println(InstCon.getDescripcion()+" "+ Double.toString(InstCon.getCantidad())+"  "+Double.toString(valor_concepto));           }
        return sueldo_neto;        
    } 
}
