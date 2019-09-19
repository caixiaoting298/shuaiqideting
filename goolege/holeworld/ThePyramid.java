/**
*Description:pyramid display
*Author:cxt
*Data:2019-09-16
*/
import java.util.Scanner;
/*用来构建Scanner对象*/
public class ThePyramid{
    public static void main(String[] args){
	 Scanner scan=new Scanner(System.in);
     int i,j,n;
	 System.out.println("input the pyramid floor");
	 int k=scan.nextInt();
	 for(i=1;i<=k;i++){
	 for(j=1;j<=k-i;j++){
	 System.out.printf(" ");
	 }
	 for(j=1;j<=2*i-1;j++){
	 /*简单运算*/
	 System.out.printf("$");
	 }
	 System.out.println();/*换行*/
	 }
	 
 }
 }