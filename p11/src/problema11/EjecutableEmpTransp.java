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
public class EjecutableEmpTransp {
    
    public static void main(String[] args) {
        EmpTransp una;
        boolean resp;
        String info;
        int cuantos;
        una= new EmpTransp("El rapido");
        
        resp=una.alta("Ford", "hshssh", "6666", 2200, 150, true, true);
        if(resp)
            System.out.println("Alta exitosa");
        else
            System.out.println("Alta NO exitosa");
        
        resp=una.alta("Ford", "383838", "3262", 20202, 123, true, true);
        if(resp)
            System.out.println("Alta exitosa");
        else
            System.out.println("Alta NO exitosa");
        
        resp=una.alta("Mercedes", "sjsjsj", "39393", 30000, 120, true, false);
        if(resp)
             System.out.println("Alta exitosa");
        else
            System.out.println("Alta NO exitosa");
        
        resp=una.alta("Mercedes", "827363", "1330", 5000, 123, true);
        if(resp)
            System.out.println("Alta exitosa");
        else
            System.out.println("Alta NO exitosa");
        
        resp=una.alta("Mercedes", "3839393", "2622", 7500, 200, false);
        if(resp)
             System.out.println("Alta exitosa");
        else
            System.out.println("Alta NO exitosa");
        
        resp=una.alta("Volvo", "3494vc", "38383", 10000, 150, true);
        if(resp)
            System.out.println("Alta exitosa");
        else
            System.out.println("Alta NO exitosa");
        
        info=una.camTuristaDisp(100, 2000);
        System.out.println(info);
        
        info=una.camTuristaDisp(150, 5000);
        System.out.println(info);
        
        resp=una.posibleRentaEscolar(100, 2);
        
        if(resp)
            System.out.println("Si es posible");
        else
            System.out.println("No es posible");
        
        info=una.estaDisponible("1330");
        System.out.println(info);
        
        info=una.estaDisponible("37383");
        System.out.println(info);
        
        info=una.placasDisponibles();
        System.out.println(info);
        
        cuantos=una.camionesTuristaPorMarcaPrecio("Ford", 3000, 2000);
        System.out.println("Hay "+cuantos+" camiones que cumplen esas condiciones");
    }
    
}
