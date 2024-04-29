package co.edu.uniquindio.poo;



public class App {
    public static void main(String[] args) {
        // Crear una lista de formas geométricas
        Forma[] formas = {new Circulo(5), new Cuadrado(4), new Circulo(3)};
        
        // Crear un visitante para calcular el área total
        CalculadorArea calculadorArea = new CalculadorArea();
        
        // Calcular el área total de todas las formas geométricas
        for (Forma forma : formas) {
            forma.aceptar(calculadorArea);
        }
        
        // Imprimir el área total
        System.out.println("El área total de todas las formas geométricas es: " + calculadorArea.getAreaTotal());
    }
}