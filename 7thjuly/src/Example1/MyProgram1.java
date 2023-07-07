package Example1;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import java.io.PrintWriter;

 

public class MyProgram1 {

 

    public static void main(String[] args) throws FileNotFoundException {

        // TODO Auto-generated method stub

        Scanner kb = new Scanner(System.in);

        PrintWriter pw;

        pw = new PrintWriter(new FileOutputStream("Info.txt")); //没有处理文件不存在的情况

 

        String s;

        System.out.println("Hello please give me your first name:");

        s = kb.nextLine();

        pw.println("Name :" + s);

 

        System.out.println("Hello please give me your address:");

        s = kb.nextLine();

        pw.println("Address :" + s);

 

        System.out.println("Hello please give me your school name:");

        s = kb.nextLine();

        pw.println("School :" + s);

 

        kb.close();

        pw.close();

        

    }

 

}