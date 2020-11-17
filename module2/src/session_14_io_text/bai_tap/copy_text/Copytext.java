package session_14_io_text.bai_tap.copy_text;

import java.io.*;

public class Copytext {
    public static void main(String[] args) throws IOException {
        File file = new File("src/session_14_io_text/bai_tap/copy_text/test");
        File file1 = new File("src/session_14_io_text/bai_tap/copy_text/test2");
        FileWriter fileWriter = new FileWriter(file1);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while (true){
            String line =  bufferedReader.readLine();
            if (line == null){
                break;
            }
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            System.out.println(line);
        }
        bufferedReader.close();
        bufferedWriter.close();
//        File file1 = new File("src/session_14_io_text/bai_tap/copy_text/test2");
//        FileWriter fileWriter = new FileWriter(file1);
//        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//        String lineNew = ;
//        bufferedWriter.write(lineNew);
//        bufferedWriter.close();

    }
}
