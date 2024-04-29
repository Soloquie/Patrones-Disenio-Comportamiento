package co.edu.uniquindio.poo;

// Clase CalculadorArea
class CalculadorArea implements Visitante {
    private double areaTotal;

    public double getAreaTotal() {
        return areaTotal;
    }

    @Override
    public void visitarCirculo(Circulo circulo) {
        areaTotal += Math.PI * Math.pow(circulo.getRadio(), 2);
    }

    @Override
    public void visitarCuadrado(Cuadrado cuadrado) {
        areaTotal += Math.pow(cuadrado.getLado(), 2);
    }
}
