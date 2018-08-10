import sun.reflect.annotation.ExceptionProxy;

public class Main {
    public static void main(String[] args) {

        int index = 5;

        try {
            int[] tab = new int[50];
            tab[index] = 6;
        } catch (ArrayIndexOutOfBoundsException blad) {
            System.out.println("Poleciał błąd:");
            blad.printStackTrace();
        } finally {
            System.out.println("Finally");
        }

        System.out.println("bla bla bla");
    }
}
