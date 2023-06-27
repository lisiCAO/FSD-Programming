package pargol;
import java.util.Random;
import java.util.Scanner;
public class MyProgram4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner kb = new Scanner(System.in);

System.out.println("Please give me 2 size for ar 2 dimention");
int sz = kb.nextInt();
		Random rand = new Random();
int[][] arr = new int[sz][sz];
int i = 0 ,  j = 0;
for(i = 0 ; i <sz ; i++) {
	for (j = 0 ; j < sz; j++) {
		arr[i][j] = rand.nextInt(100);
	}
}
System.out.println("Here are my array : ");
for (i = 0; i < sz; i++) {
	for( j= 0; j < sz; j++) {
		System.out.printf("%4d", arr[i][j]);
	}System.out.println();
}
	}
	

}
