import java.util.*;
// An exploration of basic input and output.
class BasicIO {
// Reads and processes string input.
public static void main(String[] args) {
Scanner stdin = new Scanner(System.in);
// get first input
System.out.printf("Enter your name : ");
String name = stdin.nextLine();
System.out.printf("Enter your age : ");
int years = stdin.nextInt();
System.out.printf("Enter your height : ");
int height = stdin.nextInt();
// display output on console
System.out.println("your name is " + name + " and your age is " + years);
System.out.println(years*365);
System.out.printf("2020년 9월 27일 현재 " + name + "(" + years + ")의 키는 "+ height + " cm 입니다.");
} // method main
} // class BASIC_IO