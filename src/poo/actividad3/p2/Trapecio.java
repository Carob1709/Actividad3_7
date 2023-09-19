package poo.actividad3.p2;

public class Trapecio {
    int lado_a;
    int lado_b;
    int base_a;
    int base_b;
    int altura;
    
    Trapecio (int lado_a, int lado_b, int base_a, int base_b, int altura) {
        this.lado_a = lado_a;
        this.lado_b = lado_b;
        this.base_a = base_a;
        this.base_b = base_b;
        this.altura = altura;
    }
    
    double calcularArea() {
        return ((base_a + base_b) * altura) / 2;
    }
    
    double calcularPerimetro() {
        return lado_a + lado_b + base_a + base_b;
    }
}
