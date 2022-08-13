package figuras;

public class Cuadrado implements FiguraGeometrica{
    private float base, altura;
    
    public Cuadrado(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return String.format("Cuadrado con \nBase De: %.2f\nAltura De: %.2f" + 
            "\n\nTiene un Area De: %f",
            base, altura, calcular_area());
    }

    @Override
    public float calcular_area() {
        return base * altura;
    }
    
}
