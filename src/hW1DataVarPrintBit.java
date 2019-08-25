/*
1.Scrieti un program in care sa declarati 8 variabile de tipul
byte, short, int, long, float, double, char, boolean, numite corespunzator.
Asignati (initializati) variabilelor valori aferente.
Afisati, rand pe rand, valorile variabilelor declarate,
impreuna cu dimensiunea ocupata pe biti de catre fiecare dintre acestea.
Ex: byte byteValue = 17;
    System.out.println(byteValue);
    System.out.println(8); //dimensiunea pe biti
    // .....
*/
public class Hw1DataVarPrintBit {
    public static void main(String[] args) {
        //every value is the maximum of it's data type
        byte byteValue = 127;
        System.out.println(byteValue);
        System.out.println(8); //size in bits
        short shortValue = 32767;
        System.out.println(shortValue);
        System.out.println(16);
        int intValue = 2_147_483_647;
        System.out.println(intValue);
        System.out.println(32);
        long longValue = 9_223_372_036_854_775_807L;
        System.out.println(longValue);
        System.out.println(64);
        float floatValue = 3.40282347F;
        System.out.println(floatValue);
        System.out.println(32);
        double doubleValue = 1.79769313486231570D;
        System.out.println(doubleValue);
        System.out.println(64);
        char charValue = 65535;
        System.out.println(charValue);
        System.out.println(16);
        boolean booleanValue = true; //not 1 because Java is a strongly-typed language
        System.out.println(booleanValue);
        System.out.println(1);


    }
}
