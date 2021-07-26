package CashFlow.Model;

public class Gestion {

    private static String nombre;
    private static int noSemana;
    private static String razon;
    private static int monto;

    public Gestion(String nombre, int noSemana, String razon, int monto) {
        this.nombre = nombre;
        this.noSemana = noSemana;
        this.razon = razon;
        this.monto = monto;
    }

    public Gestion() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNoSemana() {
        return noSemana;
    }

    public void setNoSemana(int noSemana) {
        this.noSemana = noSemana;
    }

    public String getRazon() {
        return razon;
    }

    public void setRazon(String razon) {
        this.razon = razon;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }
}
