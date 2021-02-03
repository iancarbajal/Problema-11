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
public class Turismo extends DePasajeros {
    private boolean asientoCama;
    private boolean serviBar;

    public Turismo() {
        super();
    }

    public Turismo(String marca, String numMotor, String placas, double costoCamion,int totalPasaj,boolean asientoCama, boolean serviBar) {
        super(marca, numMotor, placas, costoCamion,totalPasaj);
        this.asientoCama = asientoCama;
        this.serviBar = serviBar;
    }

    @Override
    public String toString() {
        StringBuilder c= new StringBuilder();
        
        c.append(super.toString());
        c.append("\nAsientos Cama: ").append(asientoCama).append("\nServiBar:").append(serviBar);
        return c.toString();
    }
    
    @Override
    public double calculaCostoServicio(double km){
        double precio;
    
        if(serviBar && asientoCama)
            precio=super.calculaCostoServicio(km)*1.1;
        else{
            if(serviBar || asientoCama)
                precio=super.calculaCostoServicio(km)*1.05;
            else
                precio=super.calculaCostoServicio(km);
        }
        
        return precio;
    }        
    }
