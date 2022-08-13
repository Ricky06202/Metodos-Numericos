package figuras;

public class Circulo implements FiguraGeometrica{
    private float radio;

    public Circulo(float radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return String.format("Circulo con Radio De: %.2f" + 
            "\n\nTiene un Area De: %f", 
            radio, calcular_area());
    }

    @Override
    public float calcular_area() {
        // Area = PI * radio^2
        return (float)(Math.PI * Math.pow(radio, 2));
    }
    
}
