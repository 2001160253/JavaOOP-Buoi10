public class Quadratic {
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    private double a;
    private double b;
    private double c;

    public Quadratic(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Quadratic() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }

    public double calculateDelta(){
        return b*b-4*a*c;
    }

    public String solveTheEquation() {
        if (a == 0) {
            return "Đây không phải là phương trình bậc hai.";
        }

        double delta = calculateDelta();

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            return "Phương trình có 2 nghiệm: x1 = " + x1 + ", x2 = " + x2;
        } else if (delta == 0) {
            double x = -b / (2 * a);
            return "Phương trình có 1 nghiệm kép: x = " + x;
        } else {
            return "Phương trình không có nghiệm";
        }
    }

    @Override
    public String toString() {
        return "Quadratic{" +
                "a = " + a +
                ", b = " + b +
                ", c = " + c +
                ", delta = " + calculateDelta()+
                ", nghiệm = "+ solveTheEquation() +
                '}';
    }
}
