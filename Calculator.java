// Calculator.java (tras resolver el conflicto)
public class Calculator {
 public static int add(int a, int b) { return a + b; }
 public static int sub(int a, int b) { return a - b; }
 public static void main(String[] args) {
 if (args.length < 2) {
 System.out.println(
 "Uso: java Calculator <a> <b> [sum|sub]"
 );
 return;
 }
 int a = Integer.parseInt(args[0]);
 int b = Integer.parseInt(args[1]);
 String op = (args.length >= 3) ? args[2] : "sum";
 if ("sub".equals(op)) {
 System.out.printf(
 "Resultado resta = %d (a=%d, b=%d)%n",
 sub(a, b), a, b
 );
 } else {
 System.out.printf(
 "Resultado suma = %d (a=%d, b=%d)%n",
 add(a, b), a, b
 );
 }
 }
}
