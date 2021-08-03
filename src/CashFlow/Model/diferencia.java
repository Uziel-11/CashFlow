package CashFlow.Model;

public class diferencia {

    private double sem1;
    private double sem2;
    private double sem3;
    private double sem4;
    private double sem5;

    public diferencia(double sem1, double sem2, double sem3, double sem4, double sem5) {
        this.sem1 = sem1;
        this.sem2 = sem2;
        this.sem3 = sem3;
        this.sem4 = sem4;
        this.sem5 = sem5;
    }

    public diferencia() {
    }

    public double getSem1() {
        return sem1;
    }

    public void setSem1(double sem1) {
        this.sem1 = sem1;
    }

    public double getSem2() {
        return sem2;
    }

    public void setSem2(double sem2) {
        this.sem2 = sem2;
    }

    public double getSem3() {
        return sem3;
    }

    public void setSem3(double sem3) {
        this.sem3 = sem3;
    }

    public double getSem4() {
        return sem4;
    }

    public void setSem4(double sem4) {
        this.sem4 = sem4;
    }

    public double getSem5() {
        return sem5;
    }

    public void setSem5(double sem5) {
        this.sem5 = sem5;
    }
}
