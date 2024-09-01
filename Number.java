public class Number {
    public static void main(String[] args) {
        int a = 5;
        int b = 9;
        int c = 10;
        int d = 100;
        int e = 1200;
        int f = 2;
        int g = 7;

        if (a > b) { int temp = a; a = b; b = temp; }
        if (a > c) { int temp = a; a = c; c = temp; }
        if (a > d) { int temp = a; a = d; d = temp; }
        if (a > e) { int temp = a; a = e; e = temp; }
        if (a > f) { int temp = a; a = f; f = temp; }
        if (a > g) { int temp = a; a = e; g = temp; }

        if (b > c) { int temp = b; b = c; c = temp; }
        if (b > d) { int temp = b; b = d; d = temp; }
        if (b > e) { int temp = b; b = e; e = temp; }
        if (b > f) { int temp = b; b = f; f = temp; }
        if (b > g) { int temp = b; b = g; g = temp; }

        if (c > d) { int temp = c; c = d; d = temp; }
        if (c > e) { int temp = c; c = e; e = temp; }
        if (c > f) { int temp = c; c = f; f = temp; }
        if (c > g) { int temp = c; c = g; g = temp; }

        if (d > e) { int temp = d; d = e; e = temp; }
        if (d > f) { int temp = d; d = f; f = temp; }
        if (d > g) { int temp = d; d = g; g = temp; }

        if (e > f) { int temp = e; e = f; f = temp; }
        if (e > g) { int temp = e; e = g; g = temp; }

        if (f > g) { int temp = f; f = g; g = temp; }

        System.out.println("Input Number According " + a + ", " + b + ", " + c + ", " + d + ", " + e + ", " + f +", "+ g);
    }
}
