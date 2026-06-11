/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package triangulos;
import figurasgeometricas.Figuras;
import figurasgeometricas.circulos.Circulo;
/**
 *
 * @author Student
 */
public abstract class Triangulo extends Figuras {
    protected double lado_A;
    protected double lado_B;
    protected double lado_C;
    
    public double getLado_A(){
        return lado_A;
    }

    public double getLado_B() {
        return lado_B;
    }

    public double getLado_C() {
        return lado_C;
    }
    
    public Triangulo(double lado_A, double lado_B, double lado_C) {
        this.lado_A = lado_A;
        this.lado_B = lado_B;
        this.lado_C = lado_C;
    }
    //Calcular sobreescribienod metodos
    
    @Override
    protected double calcularPerimetro() {
        return lado_A + lado_B + lado_C;
    }
    
}
