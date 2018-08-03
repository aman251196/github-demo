import java.util.*;
public class _1A
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long m = sc.nextLong();
    long a = sc.nextLong();
    if(a == 1)
    {
      System.out.println(n*m);
    }
    else
    {
      long al = a;
      long ab = a;
      long cl = 0, cb = 0;
      do {
          ++cl;
          if(al >= n) break;
          al += a;
      } while (true);

      do {
        ++cb;
        if(ab >= m) break;
        ab += a;
      } while (true);
      System.out.println(cl*cb);
    }
  }
}
