package CashFlow.Model;

public class Gestion {

    private int idGestionDinero;
    private int numSemana;
    private String razonSocial;
    private double monto;
    private String mes;
    private String tipo;

    public Gestion() {
    }

    public Gestion(int idGestionDinero, int numSemana, String razonSocial, double monto, String mes, String tipo) {
        this.idGestionDinero = idGestionDinero;
        this.numSemana = numSemana;
        this.razonSocial = razonSocial;
        this.monto = monto;
        this.mes = mes;
        this.tipo = tipo;
    }

    public int getIdGestionDinero() {
        return idGestionDinero;
    }

    public void setIdGestionDinero(int idGestionDinero) {
        this.idGestionDinero = idGestionDinero;
    }

    public int getNumSemana() {
        return numSemana;
    }

    public void setNumSemana(int numSemana) {
        this.numSemana = numSemana;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
