import java.nio.DoubleBuffer;
import java.util.Objects;

public class Complex {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(397.0, 828.0);
        ComplexNumber b = new ComplexNumber(238.0, 921.0);

        System.out.println(a.equals(b));
        System.out.println(a.hashCode());
        System.out.println(a.hashCode() == b.hashCode());
    }
    public static class ComplexNumber {
        private double re;
        private double im;

        public ComplexNumber() {
        }

        public ComplexNumber(double re, double im) {
            this.re = re;
            this.im = im;
        }


        public double getRe() {
            return re;
        }

        public double getIm() {
            return im;
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ComplexNumber obj = (ComplexNumber) o;
//            return (Double.compare(re, obj.re) + Double.compare(im, obj.im)) == 0;
            if (Double.compare(obj.re, re) != 0) return false;
            return Double.compare(obj.im, im) == 0;

        }

        @Override
        public int hashCode() {
            int result;
            long temp;
            int temp2, temp3;
//            temp = Double.doubleToLongBits(re);
            temp2 = Double.hashCode(re);
            temp3 = Double.hashCode(im);
            result = 31 * temp2 + temp3;
//            result = (int) (temp ^ (temp >>> 32));
//            temp = Double.doubleToLongBits(im);
//            result = 31 * result + (int) (temp ^ (temp >>> 32));
            return result;
        }
    }

}
