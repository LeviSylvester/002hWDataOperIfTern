public class hW5charIntIfCompASCII {
    public static void main(String[] args) {
/*
5. Declarati si initializati o variabila de tip char, respectiv una de tip int.
Daca codul ASCII al variabilei de tip char este mai mare decat valoarea variabilei de tip int,
afisati mesajul „MAI MARE”.
In cazul in care codul ASCII este egal cu valoarea variabilei int, afisati „EGAL”.
In caz contrat, afisati „MAI MIC”.
*/
        char charA = 'A'; //065 in ASCII dec.
        int B = 66;
        if (charA > B) {
            System.out.println("MAI MARE");
        } else if (charA == B) {
            System.out.println("EGAL");
        } else {
            System.out.println("MAI MIC");
        }
    }
}
