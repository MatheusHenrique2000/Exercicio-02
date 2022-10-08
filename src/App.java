import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número: ");
        int numero = sc.nextInt();
        sc.close();
        System.out.print("O número digitado foi: ");
        System.out.println(numero);
        
    }
}