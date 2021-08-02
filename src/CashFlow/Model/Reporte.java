package CashFlow.Model;

public class Reporte {
    private String descripcion;
    private int semana1;
    private int semana2;
    private int semana3;
    private int semana4;
    private int fnal;

    public Reporte(String descripcion, int semana1, int semana2, int semana3, int semana4, int fnal) {
        this.descripcion = descripcion;
        this.semana1 = semana1;
        this.semana2 = semana2;
        this.semana3 = semana3;
        this.semana4 = semana4;
        this.fnal = fnal;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getSemana1() {
        return semana1;
    }

    public void setSemana1(int semana1) {
        this.semana1 = semana1;
    }

    public int getSemana2() {
        return semana2;
    }

    public void setSemana2(int semana2) {
        this.semana2 = semana2;
    }

    public int getSemana3() {
        return semana3;
    }

    public void setSemana3(int semana3) {
        this.semana3 = semana3;
    }

    public int getSemana4() {
        return semana4;
    }

    public void setSemana4(int semana4) {
        this.semana4 = semana4;
    }

    public int getFnal() {
        return fnal;
    }

    public void setFnal(int fnal) {
        this.fnal = fnal;
    }
}
