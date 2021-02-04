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
public class Escolar extends DePasajeros{
    private boolean lugarProyecto;

    public Escolar() {
        super();
    }

    public Escolar(String marca, String numMotor, String placas, double costoCamion, int totalPasaj,boolean lugarProyecto) {
        super(marca, numMotor, placas, costoCamion, totalPasaj);
        this.lugarProyecto = lugarProyecto;
    }

    public boolean isLugarProyecto() {
        return lugarProyecto;
    }

    public void setLugarProyecto(boolean lugarProyecto) {
        this.lugarProyecto = lugarProyecto;
    }
    
    @Override
    public double calculaCostoServicio(double km){
        double costo;
        
        costo=((.0001*getCostoCamion())/getTotalPasaj())*250;
        
        return costo;
    }
    
    
    
    
}