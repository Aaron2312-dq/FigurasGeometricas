/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuadrados;
import figurasgeometricas.Figuras;

/**
 *
 * @author Student
 */
public class Rectangulo extends Figuras {
    protected double base;
    protected double altura;
    protected double diagonal;

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public double getDiagonal() {
        return calcularDiagonal();
    }

    public Rectangulo(double base, double altura, double diagonal) {
        this.base = base;
        this.altura = altura;
        this.diagonal = diagonal;
    }
    
    private  double calcularDiagonal(){
        return Math.sqrt(Math.pow(base, 2) + Math.pow(altura,2));
    }
    protected double calcularPerimetro(){
        return base  * 2 + altura * 2;
    }
    protected double calcularArea(){
        return base * altura;
    }

    @Override
    public String toString() {
        return "\nbase: " + base + "\naltura: " + altura + "\ndiagonal: " + diagonal;
    }
    
    
}
