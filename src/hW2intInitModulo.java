public class hW2intInitModulo {
    public static void main(String[] args) {
/*
2. Declarati o variabila de tip int si initializati-o cu valoarea 123.
Afisati produsul dintre restul impartirii acesteia la 9 si dublul valorii ultimei cifre.
*/
        int intValue = 123;
        System.out.println(intValue % 9); //remainder after dividing intValue by 9
        System.out.println((intValue % 10) * 2); //last digit from intValue multiplied by 2
    }
}
