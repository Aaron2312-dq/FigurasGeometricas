/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package triangulos;

/**
 *
 * @author Student
 */
public class TrianguloEquilatero extends Triangulo {
    
    public TrianguloEquilatero(double lado){
        super(lado,lado,lado);
    }
     @Override
    protected double calcularArea() {
        return (Math.sqrt(3)/4) * Math.pow(lado_A, 2);
    }

    @Override
    public String toString() {
        return "\nLado_A" + lado_A + "\nLado_B" + lado_B + "\nLado_C" + lado_C +
                "Perimetro: "+ getPerimetro() + "Area: " + getArea();
    }
}
