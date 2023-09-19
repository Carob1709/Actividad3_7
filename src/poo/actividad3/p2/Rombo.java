package poo.actividad3.p2;

public class Rombo {
    int base;
    int altura;
    
    Rombo (int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
    double calcularArea() {
        return base * altura;
    }
    
    double calcularPerimetro() {
        return base * 4;
    }
}
