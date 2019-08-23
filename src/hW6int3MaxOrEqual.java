public class hW6int3MaxOrEqual {
    public static void main(String[] args) {
//6. Calculati si afisati maximul a 3 numere intregi (cu si fara posibile valori egale).

        //finds maximum value without testing equality
        int a = 5;
        int b = 5;
        int c = 15;
        if (b > a) {
            if (c > b) {
                System.out.println("c " + c);
            } else {
                System.out.println("b " + b);
            }
        } else if (c > a) {
            System.out.println("c " + c);
        } else {
            System.out.println("a " + a);
        }

        //finds maximum value and tests equality
        int maxValue;
        if (b > a) {
            if (c > b) {
                maxValue = c;
            } else {
                maxValue = b;
            }
        } else if (c > a) {
            maxValue = c;
        } else {
            maxValue = a;
        }
        if (a != b & b != c & c != a) {
            System.out.println(maxValue);
        } else {
            System.out.println(maxValue + " with an equality case");
        }
    }
}