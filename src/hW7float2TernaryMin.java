public class hW7float2TernaryMin {
    public static void main(String[] args) {
/*
7. Calculati si asignati unei variabile „minim”, minimul a 2 numere de tip float,
folosind operatorul ternar.
*/
        float a = 0.123456F;
        float b = 0.1234567F;
        float minim;
        minim = a < b ? a : b;
        System.out.println(minim);
    }
}
