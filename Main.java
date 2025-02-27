import java.util.Scanner;
class Double {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String newLine = System.getProperty("line.separator");
        System.out.print("Print a: ");
        double a = scanner.nextDouble();
        System.out.print("Print b: ");
        double b = scanner.nextDouble();
        System.out.print("Print c: ");
        double c = scanner.nextDouble();
        double d = Math.pow(b, 2) - 4 * a * c;
        if (d < 0){
            System.out.println("No solution");
            }
        if (d == 0) {
            double x = -b / (2 * a);
            System.out.println("x= "+x);
            }
        if (d > 0) {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("x1= "+ x1 + newLine + "x2= " + x2);
            }
        }
    }
