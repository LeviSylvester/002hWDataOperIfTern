public class hW3int2BitsComment {
    public static void main(String[] args) {
/*
3. Declarati si initializati 2 variabile de tip int a si b (valori: 10, 17).
Aplicati variabilelor operatorii „si pe biti”, „sau pe biti”
si afisati rezultatele pe ecran pe cate o linie noua.
Adaugati cate un comentariu in care specificati cum se calculeaza rezultatul fiecarei operatii.
*/
    int a = 10;
    int b = 17;
    System.out.println(a&b);/*a0000 1010
                              b0001 0001
                              __________aplicand unui bit operatorul & cu 0, bitul este sters
                              &0000 0000         "        operatorul & cu 1, bitul este neschimbat*/
    System.out.println(a|b);//|0001 1011         "        operatorul | cu 1, bitul este setat
    }
}