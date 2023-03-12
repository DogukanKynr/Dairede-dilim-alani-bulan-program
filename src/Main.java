import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double yaricap, merkezAci, alan;
        double pi = 3.14;

        System.out.print("Yarıçap uzunluğunu giriniz : ");
        yaricap = input.nextDouble();

        System.out.print("Merkez açının ölçüsünü giriniz : ");
        merkezAci = input.nextDouble();

        alan = (pi * (yaricap*yaricap) * merkezAci)/360;

        System.out.print("Alan : " + alan);


    }
}