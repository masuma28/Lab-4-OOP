public class Fraction {
    int num, den;

    Fraction(int n, int d) {
        if (d == 0) d = 1;
        num = n;
        den = d;
        simplify();
    }

    Fraction add(Fraction f) {
        return new Fraction(num * f.den + f.num * den, den * f.den);
    }

    Fraction sub(Fraction f) {
        return new Fraction(num * f.den - f.num * den, den * f.den);
    }

    Fraction mul(Fraction f) {
        return new Fraction(num * f.num, den * f.den);
    }

    Fraction div(Fraction f) {
        return new Fraction(num * f.den, den * f.num);
    }

    void display() {
        System.out.println(num + "/" + den);
    }

    void simplify() {
        int gcd = GCD(Math.abs(num), Math.abs(den));
        num /= gcd;
        den /= gcd;
        if (den < 0) { num *= -1; den *= -1; }
    }

    int GCD(int a, int b) {
        return b == 0 ? a : GCD(b, a % b);
    }
}

