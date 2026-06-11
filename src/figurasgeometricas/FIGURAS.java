/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgeometricas;

/**
 *
 * @author Student
 */
public abstract class Figuras {
    public double getArea() {
        return this.getArea();
    }
    public double getPerimetro() {
        return this.calcularPerimetro();
    }
    protected abstract double calcularPerimetro();
    protected abstract double calcularArea();   
}