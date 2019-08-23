public class hW8varIfMultiple {
    public static void main(String[] args) {
/*
8. Asignati unei variabile avand tipul corespunzator,
 daca un numar este multiplu al numarului 7.
Ulterior afisati valoarea negata a variabilei.
*/
        int a = 862;
        int b = 7;
        boolean divisibility; //it becomes true if a is divisible by b:
        if (a % b == 0) {
            divisibility = true;
            //System.out.println(divisibility); //else it becomes false:
        } else {
            divisibility = false;
            //System.out.println(divisibility);
        }
        System.out.println("Opposite of divisibility is " + !(divisibility) + ". :)");

    }
}
