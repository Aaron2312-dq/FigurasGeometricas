/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgeometricas.circulos;
import figurasgeometricas.Figuras;

/**
 *
 * @author Student
 */
public class Circulo extends Figuras {
    private double radio;
    private static final double PI = Math.PI;

    public double getRadio() {
        return radio;
    }

    public double getDiametro() {
        return this.calcularDiametro();
    }

    public static double getPI() {
        return PI;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    //Constructor
    public Circulo(double radio) {
        this.radio = radio;
    }
    
    //Como calcular diametro
    protected double calcularDiametro(){
        return radio * 2;
    }    
    
    //Cacula perimetro y area esto es heredado de la clase figura
    @Override
    protected double calcularPerimetro() {
        return 2 * Circulo.PI*this.radio;
        
    }

    @Override
    protected double calcularArea() {
        return Math.pow(radio, 2) * Circulo.PI;
   
    }  
}