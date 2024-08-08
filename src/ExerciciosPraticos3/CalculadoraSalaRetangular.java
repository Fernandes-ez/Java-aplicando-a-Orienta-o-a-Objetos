package ExerciciosPraticos3;

public class CalculadoraSalaRetangular implements CalculoGeometrico {

    @Override
    public void calcularArea(double largura, double altura) {
        double area;
        area = largura * altura;
        System.out.println("A área é: " + area);
    }

    @Override
    public void calcularPerimetro(double largura, double altura) {
        double perimetro;
        perimetro = (altura * 2) + ( largura * 2);
        System.out.println("O perímetro é: " + perimetro);
    }
}
