public class hW2intInitModulo {
    public static void main(String[] args) {
/*
2. Declarati o variabila de tip int si initializati-o cu valoarea 123.
Afisati produsul dintre restul impartirii acesteia la 9 si dublul valorii ultimei cifre.
*/
        int intValue = 123;
        System.out.println((intValue % 9)*((intValue % 10) * 2));
    }
}
