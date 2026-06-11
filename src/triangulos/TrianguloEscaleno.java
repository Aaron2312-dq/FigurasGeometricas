/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package triangulos;

/**
 *
 * @author Student
 */
public class TrianguloEscaleno extends Triangulo {
        public TrianguloEscaleno(double ladoA,double ladoB,double ladoC){
         super(ladoA,ladoB,ladoC);   
        }
@Override
    protected double calcularArea() {
        double S = (lado_A + lado_B+lado_C);
        return Math.sqrt(S - lado_A * (S - lado_B) * (S - lado_C));
    }
        @Override
    public String toString() {
        return "\nLado_A" + lado_A + "\nLado_B" + lado_B + "\nLado_C" + lado_C +
                "Perimetro: "+ getPerimetro() + "Area: " + getArea();
    }
}
