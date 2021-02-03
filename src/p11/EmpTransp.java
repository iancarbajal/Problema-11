/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p11;

/**
 *
 * @author ianca
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
        this.nombre = nombre;
        this.totCam = 0;
        this.camiones = new Camion[MAX_CA];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
    
}
