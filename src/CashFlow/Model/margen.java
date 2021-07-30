package CashFlow.Model;

public class margen {
    private int NoSemana;
    private double Cantidad;

    public margen() {
    }

    public margen(int noSemana, double cantidad) {
        NoSemana = noSemana;
        Cantidad = cantidad;
    }

    public int getNoSemana() {
        return NoSemana;
    }

    public void setNoSemana(int noSemana) {
        NoSemana = noSemana;
    }

    public double getCantidad() {
        return Cantidad;
    }

    public void setCantidad(double cantidad) {
        Cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "margen{" +
                "NoSemana=" + NoSemana +
                ", Cantidad=" + Cantidad +
                '}';
    }
}
