package figuras;

import figuras.triangulos.Equilatero;
import figuras.triangulos.Escaleno;
import figuras.triangulos.Isosceles;
import java.util.Arrays;

public class Triangulo implements FiguraGeometrica{
    private float[] lado = new float[3];
    private Triangulo triangulo;

    public Triangulo(float lado1, float lado2, float lado3) {
        lado[0] = lado1;
        lado[1] = lado2;
        lado[2] = lado3;
    }

    public Triangulo(float[] lado) {
        this(lado[0], lado[1], lado[2]);
    }

    @Override
    public String toString() {
        triangulo = identificar_triangulo();
        String textoLados = Arrays.toString(lado);
        return "Triangulo "+ triangulo.getClass().getSimpleName() +" con los Lados:\n" + 
            textoLados.substring(1, textoLados.length() - 1)  + 
            "\n\nTiene un Area De: " + calcular_area();
    }

    private Triangulo identificar_triangulo(){
        return es_equilatero() ? new Equilatero(lado) :
            es_isosceles() ? new Isosceles(lado) : new Escaleno(lado);
    }

    private boolean medidas_repetidas(int limite) {
        for (int i = 0; i < lado.length; i++) {
            int repetidos = 1;
            for (int j = 0; j < lado.length; j++) 
                if (lado[i] == lado[j] && i != j)
                    repetidos++;
            if (repetidos == limite)
                return true;
        }
        return false;
    }

    private boolean es_equilatero(){
        return medidas_repetidas(3);
    }

    private boolean es_isosceles(){
        return medidas_repetidas(2) && !es_equilatero();
    }

    @Override
    public float calcular_area() {
        return triangulo.calcular_area();
    }

    public float[] getLado() {
        return lado;
    }   
     
}
