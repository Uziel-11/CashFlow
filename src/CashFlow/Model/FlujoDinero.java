package CashFlow.Model;

public class FlujoDinero {

    private int idflujoDinero;
    private String fecha;
    private String descripcion;
    private String categoria;
    private String subcat;
    private int cantidad;

    public FlujoDinero(int idflujoDinero, String fecha, String descripcion, String categoria, String subcat, int cantidad) {
        this.idflujoDinero = idflujoDinero;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.subcat = subcat;
        this.cantidad = cantidad;
    }

    public FlujoDinero(){

    }

    public int getIdflujoDinero() {
        return idflujoDinero;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getSubcat() {
        return subcat;
    }

    public void setSubcat(String subcat) {
        this.subcat = subcat;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}
