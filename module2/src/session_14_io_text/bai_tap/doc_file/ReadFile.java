package session_14_io_text.bai_tap.doc_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        File file = new File("src/session_14_io_text/bai_tap/doc_file/test_file");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = null ;
        while (true){
            line = bufferedReader.readLine();
            if (line == null){
                break;
            }
            list.add(line);
            System.out.println(list.size());
        }
        for ( String i : list){
            System.out.println(i);
        }
        bufferedReader.close();

    }
}
