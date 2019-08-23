public class hW9int4CompIfElseIf {
    public static void main(String[] args) {
        /*
        9. Avand 4 numere de tip intreg, daca primul numar este mai mare decat ultimul
        si al doilea este dublul celui de-al treilea, afisati triplul primului numar.
        In caz contrar, daca primul numar este mai mic decat cel de-al doilea, afisati „UNU-DOI”,
        altfel afisati „DOI-UNU”.
        */
        int a = 1;
        int b = 2;
        int c = 4;
        int d = 8;
        if ((a > d) & (b == 2 * c)) {
            System.out.println(3 * a);
        } else if (a < b) {
            System.out.println("UNU-DOI");
        } else {
            System.out.println("DOI-UNU");
        }
    }
}
