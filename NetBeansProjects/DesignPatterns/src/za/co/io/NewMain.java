package za.co.io;

import java.io.IOException;
import java.util.List;

/**
 *
 * @author hmanganyi
 */
public class NewMain {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {

        FileFacade facade = new FileFacade();
        facade.writeToFile("Hunzukani, Manganyi, 2575");

        List<Person> list = facade.read();

        for (Person person : list) {
            System.out.println(person);
        }

    }

}
