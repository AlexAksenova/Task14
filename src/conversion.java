import java.util.Scanner;

public class conversion {
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        String S = scanner.nextLine();
        int X = Integer.parseInt (S);
        System.out.println("Числа:\n" + "S: "+ S +"\n"+"X: "+ X + "\n" + "Y: " + (double) X);
    }

}

