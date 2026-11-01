import java.io.*;

class FitnessApp {
    public static void main(String[] args) {
        try {
            FileOutputStream fout =
                new FileOutputStream("profile.txt");

            String data = "Name: Rohith\nAge: 20\nWeight: 65 kg";

            fout.write(data.getBytes());
            fout.close();

            FileInputStream fin =
                new FileInputStream("profile.txt");

            int i;
            System.out.println("User Profile:");

            while ((i = fin.read()) != -1) {
                System.out.print((char)i);
            }

            fin.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
