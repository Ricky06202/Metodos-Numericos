package figuras;

import java.util.Arrays;

public class Triangulo implements FiguraGeometrica{
    private float[] lado = new float[3];
    private String triangulo;
    private float mitadPerimetro;


    public Triangulo(float lado1, float lado2, float lado3) {
        lado[0] = lado1;
        lado[1] = lado2;
        lado[2] = lado3;
        triangulo = identificar_triangulo();
        mitadPerimetro = (lado[0] + lado[1] + lado[2]) / 2;
    }

    @Override
    public String toString() {
        String textoLados = Arrays.toString(lado);
        return "Triangulo "+ triangulo +" con los Lados:\n" + 
            textoLados.substring(1, textoLados.length() - 1)  + 
            "\n\nTiene un Area De: " + calcular_area();
    }

    private String identificar_triangulo(){
        return es_equilatero() ? "Equilatero" :
            es_isosceles() ? "Isosceles" : "Escaleno";
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
        return medidas_repetidas(2);
    }

    @Override
    public float calcular_area() {
        return (float) Math.sqrt(mitadPerimetro * 
        (mitadPerimetro - getLado()[0]) *
        (mitadPerimetro - getLado()[1]) *
        (mitadPerimetro - getLado()[2]));
    }

    public float[] getLado() {
        return lado;
    }   
     
}
