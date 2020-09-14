import java.util.Scanner;

public class IlegalIdentifiers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfVariables = Integer.parseInt(scanner.nextLine());

        //String identifier = scanner.nextLine();
        //String regex = "[A-Za-z_][A-Za-z0-9]*";
        //String regex = "^[A-Za-z_][A-Za-z0-9]*$";
        String regex = "^[A-Za-z_][A-Za-z0-9_]*$";
        //System.out.println(identifier.matches(regex));
        //Correcta
        //String regex = "(_[a-zA-Z0-9]|[a-zA-Z][a-zA-Z_0-9]*)[a-zA-Z_0-9]*";
        //correcta
        //String regex = "^(?:_[A-Za-z0-9]|[A-Z-a-z])\\w*$";
        //correcta
        //String regex = "[a-zA-Z]\\w*|\\_[0-9A-Za-z]\\w*";
        for (int i = 0; i < numberOfVariables; i++) {
            String identifier = scanner.nextLine();
            if (!identifier.matches(regex) | identifier.equals("_")) {
                System.out.println(identifier);
            }
        }
    }
}