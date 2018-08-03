import java.util.*;
public class _4A
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String S = "NO";
    if(n > 2 && n % 2 == 0) S = "YES";
    System.out.println(S);
  }
}
