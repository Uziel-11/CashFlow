package CashFlow.Model;

public class valoresTabla {
    private  String subCategoria;
    private Double semana1;
    private Double semana2;
    private Double semana3;
    private Double semana4;
    private Double semana5;
    private Double total;

    public valoresTabla(String subCategoria, Double semana1, Double semana2, Double semana3, Double semana4, Double semana5, Double total) {
        this.subCategoria = subCategoria;
        this.semana1 = semana1;
        this.semana2 = semana2;
        this.semana3 = semana3;
        this.semana4 = semana4;
        this.semana5 = semana5;
        this.total = total;
    }

    public valoresTabla() {
    }

    public String getSubCategoria() {
        return subCategoria;
    }

    public void setSubCategoria(String subCategoria) {
        this.subCategoria = subCategoria;
    }

    public Double getSemana1() {
        return semana1;
    }

    public void setSemana1(Double semana1) {
        this.semana1 = semana1;
    }

    public Double getSemana2() {
        return semana2;
    }

    public void setSemana2(Double semana2) {
        this.semana2 = semana2;
    }

    public Double getSemana3() {
        return semana3;
    }

    public void setSemana3(Double semana3) {
        this.semana3 = semana3;
    }

    public Double getSemana4() {
        return semana4;
    }

    public void setSemana4(Double semana4) {
        this.semana4 = semana4;
    }

    public Double getSemana5() {
        return semana5;
    }

    public void setSemana5(Double semana5) {
        this.semana5 = semana5;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}


