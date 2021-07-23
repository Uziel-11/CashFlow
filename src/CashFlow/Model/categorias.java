package CashFlow.Model;

public class categorias {

    private int idCategoria;
    private String clasificacion;
    private String nombre;
    private int idSubCategoria;

    public categorias(int idCategoria, String clasificacion, String nombre, int idSubCategoria) {
        this.idCategoria = idCategoria;
        this.clasificacion = clasificacion;
        this.nombre = nombre;
        this.idSubCategoria= idSubCategoria;

    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdSubCategoria() {
        return idSubCategoria;
    }

    public void setIdSubCategoria(int idSubCategoria) {
        this.idSubCategoria = idSubCategoria;
    }
}
