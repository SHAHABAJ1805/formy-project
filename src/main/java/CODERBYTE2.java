import java.util.Scanner;

public class CODERBYTE2 {
    public static String reverse(String str){
      String revers="";
      for(int i=str.length()-1;i>0;i--)
      {
          revers+=str.charAt(i);
      }
      return  revers;
    }
    public static void main(String [] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println(reverse(s.nextLine()));
    }
}
