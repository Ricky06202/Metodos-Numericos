package figuras.triangulos;

import figuras.Triangulo;

public class Equilatero extends Triangulo{

    public Equilatero(float[] lado) {
        super(lado);
    }

    @Override
    public float calcular_area() {
        float base = getLado()[1];
        float altura = (float) Math.sqrt(Math.pow(getLado()[0], 2) - Math.pow(base / 2, 2));
        return base * altura / 2;
    }
}