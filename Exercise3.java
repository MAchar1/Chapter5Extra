import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {

        Scanner poems2 = new Scanner("poem2.txt");
        Poem poem1 = new Poem();
        poem1.setName(poems2.nextLine());
        poem1.setPoet(poems2.nextLine());
        Poem poem2 = new Poem();
        poem2.setName(poems2.nextLine());
        poem2.setPoet(poems2.nextLine());
        Poem poem3 = new Poem();
        poem3.setName(poems2.nextLine());
        poem3.setPoet(poems2.nextLine());
        Poem poem4 = new Poem();
        poem4.setName(poems2.nextLine());
        poem4.setPoet(poems2.nextLine());

        System.out.println(poem1.getName() + ", " + poem1.getPoet());
        System.out.println(poem2.getName() + ", " + poem2.getPoet());
        System.out.println(poem3.getName() + ", " + poem3.getPoet());
        System.out.println(poem4.getName() + ", " + poem4.getPoet());

    }
}
