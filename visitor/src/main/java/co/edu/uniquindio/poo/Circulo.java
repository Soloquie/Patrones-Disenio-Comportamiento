package co.edu.uniquindio.poo;

// Clase Circulo
class Circulo implements Forma {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    @Override
    public void aceptar(Visitante visitante) {
        visitante.visitarCirculo(this);
    }
}
