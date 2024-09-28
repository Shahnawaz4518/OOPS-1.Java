package OPPSinJAVA;


    public class fraction {
        public static Fraction add(Fraction f1, Fraction f2) {
            int numerator = f1.num * f2.den + f1.den * f2.num;
            int denominator = f1.den * f2.den;
            Fraction f3 = new Fraction(numerator, denominator);
            return f3;
        }

        public static class Fraction {
            int num;
            int den;

            // No-argument constructor
            public Fraction() {
                this.num = 1; // Default values (optional)
                this.den = 1;
            }

            // Constructor with arguments
            public Fraction(int num, int den) {
                this.num = num;
                this.den = den;
                simplify();
            }

            public void simplify() {
                int hcf = gcd(num, den);
                num /= hcf;
                den /= hcf;
            }

            // Helper method to calculate the greatest common divisor (GCD)
            public static int gcd(int num, int den) {
                int min = Math.min(num, den);
                for (int i = min; i >= 1; i--) {
                    if (num % i == 0 && den % i == 0) return i;
                }
                return min;
            }
        }

        public static void main(String[] args) {
            Fraction f1 = new Fraction(35, 21); // Creating a fraction with numerator and denominator
            System.out.println(f1.num + "/" + f1.den);

            // You can now either create f2 with a default constructor or with specific values
            Fraction f2 = new Fraction(7,21); // Using the no-argument constructor
            System.out.println(f2.num + "/" + f2.den);
        }

    }


/*

6 pillars of oops
 * Polymorphism
 * Incapsulation
 * Abstraction
 * Inheritance
 * Exceptional Handling
 * Interfaces

 */

