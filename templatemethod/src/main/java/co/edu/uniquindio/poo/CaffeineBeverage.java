package co.edu.uniquindio.poo;

abstract class CaffeineBeverage {
    // Método de Plantilla
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }
    
    abstract void brew(); // Método abstracto a implementar por las subclases
    abstract void addCondiments(); // Método abstracto a implementar por las subclases

    void boilWater() {
        System.out.println("Hirviendo agua");
    }

    void pourInCup() {
        System.out.println("Vertiendo en la taza");
    }
}