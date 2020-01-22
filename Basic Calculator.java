public class Calculator  // our class is Calculator
{
  public static void main(String args[])
  {
   int a,b,c,d;
    a=Integer.parseInt(args[0]); // this is to convert the string to integer
    b=Integer.parseInt(args[1]);
    c=Integer.parseInt(args[2]);
   if(args[1]=="+")
     {
       d=a+c;
       System.out.println(  d+" "); // addition
     }
   else if(args[1]=="-")
     {
        d=a-c;
        System.out.println( d+" ");  // subtraction
     }
   else if(args[1]=="*")
     {
        d=a*c;
        System.out.println( d+" ");  // multiplication
     }
   else if(args[1]=="/")
     {
         d=a/c;
        System.out.println( d+" ");  // division
     }
   else
     {
        System.out.println( " error "); // none of the operator shows error 
     }
  }
}
