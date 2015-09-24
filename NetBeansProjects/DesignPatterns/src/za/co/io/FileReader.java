package za.co.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hmanganyi
 */
public class FileReader implements FileReaderSession {

    private final File file = FileManager.getInstance().getFile();
    private final java.io.FileReader fileReader;
    private final BufferedReader bufferedReader;
    
    public FileReader() throws IOException {
        fileReader = new java.io.FileReader(file);
        bufferedReader = new BufferedReader(fileReader);
    } 
    
    @Override
    public List read() throws IOException {
        String line = "";
        List list = new ArrayList<>();
        String [] tokenizer = null;
        while((line = bufferedReader.readLine()) != null) {
            tokenizer = line.split(",");
            
            Person person = new Person(tokenizer[0], tokenizer[1], tokenizer[2]);
            list.add(person);
        }
        return list;
    }
}
