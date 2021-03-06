/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema11;


/**
 *
 * @author gerardotrejo
 */
public class EmpTransp {
    private String nombre;
    private int totCam;
    private Camion [] camiones;
    private final int MAX_CA=50;

    public EmpTransp() {
        this.totCam = 0;
        this.camiones = new Camion[MAX_CA];
    }
    
    public EmpTransp(String nombre) {
        this();
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTotCam() {
        return totCam;
    }
    public String getUnCamion(int pos){
        String r="Error";
        Camion otro;
        if(pos<MAX_CA && pos>=0){
            otro=camiones[pos];
            r=otro.toString();
        }
        
        return r;
        
    }
    public boolean alta(String marca, String numMotor, String placas, double costoCamion, int totalPasaj,boolean lugarProyecto){
        boolean resp=false;
        
        if(totCam<MAX_CA){
            camiones[totCam]=new Escolar(marca, numMotor, placas, costoCamion, totalPasaj, lugarProyecto);
            totCam++;
            resp=true;
        }
        return resp;
    }
    
    public boolean alta(String marca, String numMotor, String placas, double costoCamion,int totalPasaj,boolean asientoCama, boolean serviBar){
       boolean r=false;
       
       if(totCam<MAX_CA){
           camiones[totCam]=new Turismo(marca, numMotor, placas, costoCamion, totalPasaj, asientoCama, serviBar);
           totCam++;
           r=true;
       }
       
       return r;
    }
    
    
    
    
    public String camTuristaDisp(int totPasaj, double km){
        StringBuilder c= new StringBuilder();
        
        for (int i=0; i<totCam; i++){
            if (camiones[i] instanceof Turismo && ((Turismo)camiones[i]).getTotalPasaj()>=totPasaj){
                c.append(camiones[i].toString());
                c.append("\nCosto de servicio: "+((Turismo) camiones[i]).calculaCostoServicio(km));
            }
        }
        if(c.toString().isEmpty())
            c.append("No hay camiones disponibles");
        
        return c.toString();
    }
    
    public boolean posibleRentaEscolar(int numMaxNinos, int cantCamiones){
        boolean r = false;
        int contador=0;
        
        for (int i=0; i<totCam;i++){
            if (camiones[i] instanceof Escolar && ((Escolar)camiones[i]).getTotalPasaj()>=numMaxNinos)
                contador++;
        }
        
        if (contador>=cantCamiones)
            r=true;
        
        return r;
    }
    
    public String estaDisponible(String placas){
        String resp = "";
        int i;
        i=0;
        while(i<totCam && !camiones[i].getPlacas().equals(placas))
            i++;
        if(i<totCam){
            if(camiones[i] instanceof Escolar)
                    resp="El camion es escolar";
                else
                    if(camiones[i] instanceof Turismo)
                        resp="El camion es de turismo";
            
        }
        else
            resp="El camion no esta disponible";
        
        return resp;
        
        }
    
    public String placasDisponibles(){
        StringBuilder c= new StringBuilder();
        int i;
        
        c.append("Placas : \n");
        for(i=0;i<totCam;i++){
            if(camiones[i] instanceof Escolar)
                if(((Escolar)camiones[i]).getTotalPasaj()>20 && ((Escolar)camiones[i]).isLugarProyecto()==true)
                    c.append(camiones[i].getPlacas()+"\t");
        }
        if(c.toString().isEmpty())
            c.append("No hay camiones disponibles");
        
        return c.toString();
    }
     
     public int camionesTuristaPorMarcaPrecio(String marca, double costo, double km){
        int cuantos, i;
        cuantos=0;
        
        for(i=0;i<totCam;i++){
            if(camiones[i] instanceof Turismo && camiones[i].getMarca().equals(marca)){
                if(((Turismo)camiones[i]).isServiBar() && ((Turismo)camiones[i]).calculaCostoServicio(km)<costo)
                    cuantos++;
            }
         }
        return cuantos; 
    }
     
     
}
        
   
    

