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
public class DePasajeros extends Camion{
    private int totalPasaj;

    public DePasajeros() {
        super();
        this.totalPasaj = 0;
    }

    public DePasajeros(String marca, String numMotor, String placas, double costoCamion, int totalPasaj) {
        super(marca, numMotor, placas, costoCamion);
        this.totalPasaj=totalPasaj;
    }

    public int getTotalPasaj() {
        return totalPasaj;
    }

    public void setTotalPasaj(int totalPasaj) {
        this.totalPasaj = totalPasaj;
    }

    @Override
    public String toString() {
        StringBuilder c = new StringBuilder();
        
        c.append(super.toString());
        c.append("\n Total de pasajeros: "+totalPasaj);
        
        return c.toString();
    }
    
    public double calculaCostoServicio(double km){
        double costo;
        
        costo=(getCostoCamion()*0.0001)/totalPasaj;
        
        return costo*km;
    }
    
    
    
    
    
    
}
