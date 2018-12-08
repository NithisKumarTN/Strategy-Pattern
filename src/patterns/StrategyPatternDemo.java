package patterns;
import java.util.Scanner;
public class StrategyPatternDemo {
   public static void main(String[] args) {
       int a,b,c,d;
       Scanner s=new Scanner(System.in);
       System.out.println("Enter a value:");
       a=s.nextInt();
       System.out.println("Enter another value:");
       b=s.nextInt();
      Context context = new Context(new OperationAdd());		
      c=context.executeStrategy(a,b);
      System.out.println("The addtion of two numbers:"+a+"+"+b+"="+c);

      context = new Context(new OperationSubstract());		
      d=context.executeStrategy(a,b);
      System.out.println("The subtraction of two numbers:"+a+"-"+b+"="+d);


      
   }
}