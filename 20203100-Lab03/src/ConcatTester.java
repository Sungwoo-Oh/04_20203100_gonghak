public class ConcatTester
{
 public static void main(String[] args)
 {
String animal1 = "quick brown fox";
 String animal2 = "lazy dog";
 String article = "the";
 String action = "jumps over";
/* ��ɹ� �߰��� �� �Ʒ��� �ϼ��� */
 String message = animal1.concat(" "+animal2+" ").concat(article+" ").concat(action);
 System.out.println(message);
 System.out.println(message.length()); 
 }
}