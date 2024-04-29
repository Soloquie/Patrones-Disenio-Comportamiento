package co.edu.uniquindio.poo;

class Coffee extends CaffeineBeverage {
    // Implementación de los métodos abstractos
    void brew() {
        System.out.println("Colando el café");
    }

    void addCondiments() {
        System.out.println("Añadiendo azúcar y leche");
    }
}