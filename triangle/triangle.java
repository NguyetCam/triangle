package triangle;

import java.util.Scanner;

public class triangle {
    double a,b,c,p,s,cv;
    triangle(){
        System.out.println("Nhập độ dài cạnh của tam giác");
    }
    void bacanh(){
        Scanner sc = new Scanner(System.in);
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        System.out.println("Tam giác có độ dài ba cạnh lần lượt là: " + a + " " + b + " " + c);
    }
    void chuvi(){
        cv = a+b+c;
        p=cv/2;
        System.out.println("Chu vi của tam giác là: " + cv);
    }
    void dientich(){
        s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("Diện tích của tam giác là: " + s);
    }
}
