class J4_1 {
    private double radius;

    J4_1() {
        radius = 0.0;
    }

    J4_1(double r) {
        radius = r;
    }

    double getArea() {//求圆的面积
        return Math.PI * radius * radius;
    }

    double getParimater() {//求圆的周长
        return 2 * Math.PI * radius;
    }

    void disp() {
        System.out.println("圆的半径】" + radius);
        System.out.println("圆的面积】" + getArea());
        System.out.println("圆的周长】" + getParimater());
    }
}

class Cylider extends J4_1 {
    private double height;

    Cylider(double r, double h) {
        super(r);
        height = h;
    }

    public double getVol() {//求圆柱体积
        return getArea() * height;
    }

    public void disVol() {//显示圆柱体积
        System.out.println("圆柱体积】" + getVol());
    }
}

public class J4 {
    public static void main(String[] args) {
        J4_1 j4_1 = new J4_1(10.0);
        j4_1.disp();
        Cylider cylider = new Cylider(5.0, 10.0);
        cylider.disp();
        cylider.disVol();
    }
}
