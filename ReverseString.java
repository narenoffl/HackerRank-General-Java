public class ReverseString{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    StringBuilder sb = new StringBuilder(str);
    sb.reverse();
    System.out.println(sb.toString());
  }
}
