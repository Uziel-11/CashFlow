package CashFlow.Model;

public class categorias {

    private int idCategoria;
    private String clasificacion;
    private String nombre;
    private String nombreSubCategoria;

    public categorias(int idCategoria, String clasificacion, String nombre, String nombreSubCategoria) {
        this.idCategoria = idCategoria;
        this.clasificacion = clasificacion;
        this.nombre = nombre;
        this.nombreSubCategoria = nombreSubCategoria;

    }
    public categorias (){}
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

    public String getNombreSubCategoria() {
        return nombreSubCategoria;
    }

    public void setNombreSubCategoria(String nombreSubCategoria) {
        this.nombreSubCategoria = nombreSubCategoria;
    }
}
