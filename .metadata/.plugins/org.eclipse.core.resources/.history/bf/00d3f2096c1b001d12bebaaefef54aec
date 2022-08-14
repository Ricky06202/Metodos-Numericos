package figuras.triangulos;

import figuras.Triangulo;

public class Escaleno extends Triangulo{
    private float mitadPerimetro;
    
    public Escaleno(float[] lado) {
        super(lado);
        mitadPerimetro = (lado[0] + lado[1] + lado[2]) / 2;
    }

    @Override
    public float calcular_area() {
        // A = raiz(S * (S-a) * (S-b) * (S-c))
        return (float) Math.sqrt(mitadPerimetro * 
        (mitadPerimetro - getLado()[0]) *
        (mitadPerimetro - getLado()[1]) *
        (mitadPerimetro - getLado()[2]));
    }
}