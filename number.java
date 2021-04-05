import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so " );
        int num = scanner.nextInt();
        int hangTram = num / 100;
        int hangChuc = (num % 100) / 10;
        int hangdonvi = (num % 100) % 10;
        switch (hangTram){
            case 1:
                System.out.print("onehundred and ");
                break;
            case 2:
                System.out.print("twohundred and  ");
                break;
            case 3:
                System.out.print("threehundred and ");
                break;
            case 4:
                System.out.print("fourhundred and ");
                break;
            case 5:
                System.out.print("fivehundred and ");
                break;
            case 6:
                System.out.print("sixhundred and");
                break;
            case 7:
                System.out.print("sevenhundred and ");
                break;
            case 8:
                System.out.print("eighthundred and ");
                break;
            case 9:
                System.out.print("ninehundred and ");
                break;
        }
        switch (hangChuc) {
            case 1:
                switch (hangdonvi){
                    case 0:
                        System.out.print("ten");
                        break;
                    case 1:
                        System.out.print("eleven");
                        break;
                    case 2:
                        System.out.print("twelen");
                        break;
                    case 3:
                        System.out.print("thirteen");
                        break;
                    case 4:
                        System.out.print("fourteen");
                        break;
                    case 5:
                        System.out.print("fifteen");
                        break;
                    case 6:
                        System.out.print("sixteen");
                        break;
                    case 7:
                        System.out.print("seventeen");
                        break;
                    case 8:
                        System.out.print("eighteen");
                        break;
                    case 9:
                        System.out.print("ninteen");
                        break;

                }
                break;
            case 2:
                System.out.print("tewnty ");
                break;
            case 3:
                System.out.print("thirty ");
                break;
            case 4:
                System.out.print("fourty ");
                break;
            case 5:
                System.out.print("fifty ");
                break;
            case 6:
                System.out.print("sixteen ");
                break;
            case 7:
                System.out.print("seventeen ");
                break;
            case 8:
                System.out.print("eighteen ");
                break;
            case 9:
                System.out.print("nineteen ");
                break;
        }
        switch (hangdonvi) {
            case 0:
                System.out.print("zero");
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
                break;
        }
        switch (num) {
            case 10:
                System.out.print("ten");
                break;
            case 11:
                System.out.print("eleven");
                break;
            case 12:
                System.out.print("twelen");
                break;
            case 13:
                System.out.print("thirteen");
                break;
            case 14:
                System.out.print("fourteen");
                break;
            case 15:
                System.out.print("fifteen");
                break;
            case 16:
                System.out.print("sixteen");
                break;
            case 17:
                System.out.print("seventeen");
                break;
            case 18:
                System.out.print("eighteen");
                break;
            case 19:
                System.out.print("ninteen");
                break;
        }

    }
}
