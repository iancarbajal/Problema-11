/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p11;

import java.util.Objects;

/**
 *
 * @author ianca
 */
public class Camion implements Comparable<Camion>{
    private String marca;
    private String numMotor;
    private String placas;
    private double costoCamion;

    public Camion() {
    }

    
    public Camion(String marca, String numMotor, String placas, double costoCamion) {
        this.marca = marca;
        this.numMotor = numMotor;
        this.placas = placas;
        this.costoCamion=costoCamion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNumMotor() {
        return numMotor;
    }

    public double getCostoCamion() {
        return costoCamion;
    }

    public void setCostoCamion(double costoCamion) {
        this.costoCamion = costoCamion;
    }

    public String getPlacas() {
        return placas;
    }

    public void setPlacas(String placas) {
        this.placas = placas;
    }
    @Override
    public int compareTo(Camion otro){
        return otro.getNumMotor().compareTo(numMotor);
    }
    @Override
    public String toString() {
        StringBuilder c= new StringBuilder();
        
        c.append("\nCamion marca: "+marca);
        c.append("\nNumero del Motor: "+numMotor);
        c.append("\nPlacas: "+placas);
        return c.toString();
    }

    @Override
    public boolean equals(Object obj) {
        boolean r=false;
        
        if (obj instanceof Camion && ((Camion) obj).getNumMotor().equals(numMotor))
            r=true;
        
        return r;
    }
    
    
    
}
