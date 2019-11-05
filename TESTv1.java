import java.io.Console;

public class Main {
    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static void main(String[] argc) throws Exception{
        Console console = System.console();
        String s = "";
        while(!s.equals("42")){
            s = console.readLine();
            if (isDigit(s) & !s.equals("42")) {
                System.out.println(s);
            }
        }
    }
}