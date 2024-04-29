package co.edu.uniquindio.poo;


// Clase Cuadrado
class Cuadrado implements Forma {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    @Override
    public void aceptar(Visitante visitante) {
        visitante.visitarCuadrado(this);
    }
}
