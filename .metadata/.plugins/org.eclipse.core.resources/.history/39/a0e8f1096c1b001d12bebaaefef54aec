package figuras.triangulos;

import figuras.Triangulo;

public class Isosceles extends Triangulo {

    public Isosceles(float[] lado) {
        super(lado);
    }

    @Override
    public float calcular_area() {
        float base = getLado()[0] == getLado()[1] ? getLado()[2] :
            getLado()[0] == getLado()[2] ? getLado()[1] : getLado()[0];
        float hipotenusa = base != getLado()[0] ? getLado()[0] :
            base != getLado()[1] ? getLado()[1] : getLado()[2];   
        float altura = (float) Math.sqrt(Math.pow(hipotenusa, 2) - Math.pow(base / 2, 2));
        return base * altura / 2;
    }
}