import java.io.FileWriter;
import java.io.IOException;

public class Exercise2 {

    public static void main(String[] args) {

        Poem poem1 = new Poem();
        Poem poem2 = new Poem();
        Poem poem3 = new Poem();
        poem1.setName("Fire and Ice");
        poem2.setName("Invictus");
        poem3.setName("The Raven");
        poem1.setPoet("Robert Frost");
        poem2.setPoet("William Ernest Henley");
        poem3.setPoet("Edgar Allen Poe");

        try {
            FileWriter poem = new FileWriter("src/Chapter5HW/poems.txt");
            poem.write(poem1.getName() + "\n" + poem1.getPoet() + "\n");
            poem.write(poem2.getName() + "\n" + poem2.getPoet() + "\n");
            poem.write(poem3.getName() + "\n" + poem3.getPoet() + "\n");
            poem.close();
        } catch(IOException e){
            e.printStackTrace();
        }

    }
}
