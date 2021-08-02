package CashFlow.Model;

public class valores {
    private String categoria;
    private Double cantidad;


    public valores(String categoria, Double cantidad) {
        this.categoria = categoria;
        this.cantidad = cantidad;
    }

    public valores() {
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }
}
