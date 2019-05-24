import java.util.Scanner;

public class Names {
    public static void main(String[] args) {
        String[] names = new String[5];
        Scanner scan = new Scanner(System.in);



        for (int i = 0; i < names.length; i++) {
            names [i] = scan.nextLine();
        }
        System.out.println("Witam");

        for (int i = 4; i >= 0; i--){
            System.out.println("Witam" + " " + names[i]);
        }

    }
}
