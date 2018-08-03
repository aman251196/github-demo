import java.util.Scanner;
public class _71A
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while(n --> 0)
    {
      String S = sc.next();
      int len = S.length();
      if(len <= 10)
      {
        System.out.println(S);
      }
      else
      {
        char i = S.charAt(0);
        char l = S.charAt(len-1);
        System.out.println(i + "" + (len-2) + l);
      }
    }
  }
}
