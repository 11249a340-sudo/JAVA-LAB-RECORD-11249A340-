import java.io.*;

class TextEditor {
    public static void main(String[] args) {
        try {
            FileWriter fw =
                new FileWriter("sample.txt");

            fw.write("Welcome to Java Programming");
            fw.close();

            FileReader fr =
                new FileReader("sample.txt");

            int i;
            System.out.println("File Content:");

            while ((i = fr.read()) != -1) {
                System.out.print((char)i);
            }

            fr.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
