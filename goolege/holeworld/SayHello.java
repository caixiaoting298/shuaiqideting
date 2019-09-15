public class SayHello{
    public static void main(String[] args){
     System.out.println("Below is the function of sayhello");
  SayHello();
 }
 public static void SayHello(){
     System.out.println("say hello!"+Sum());
 }
 public static int Sum(){
     int i,sum=0;
  for(i=1;i<=100;i++){
      sum=sum+i;
  }
  return sum;
 }
}