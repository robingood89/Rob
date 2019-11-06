import java.util.Scanner;

public class Main {
    public static void main(String[] argc) throws Exception {
        Scanner scaner = new Scanner(System.in);
        String s = "";
        while (!s.equals("42")) {
            s = scaner.nextLine();
            if (!s.equals("42")) System.out.println(s);
        }
    }
}