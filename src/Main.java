import java.util.Scanner;

public class Main {
    static void display(String name1,String usn1, int mark1,int mark2,int mark3,int total1,int avg1){
        System.out.println("Student name: "+name1);
        System.out.println("Student usn: "+usn1);
        System.out.println("Student mark 1: "+mark1);
        System.out.println("Student mark 2: "+mark2);
        System.out.println("Student mark 2: "+mark3);
        System.out.println("total marks: "+total1);
        System.out.println("Average marks: "+avg1);
    }
    static void grade(int avg2){
        if(avg2>=90 && avg2<100){
            System.out.println("Grade S");
        }
        else if(avg2>=80 && avg2<90){
            System.out.println("Grade A");
        }
        else if(avg2>=70 && avg2<80){
            System.out.println("Grade B");
        }
        else if(avg2>=60 && avg2<70){
            System.out.println("Grade C");
        }
        else if(avg2>=50 && avg2<40){
            System.out.println("Grade D");
        }
        else{
            System.out.println("FAIL");
        }
    }
    public static void main(String[] args) {
        student s=new student();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter student name");
        s.name=sc.nextLine();
        System.out.println("Enter Student Usn");
        s.usn=sc.nextLine();
        System.out.println("Enter mark 1");
        s.mark1=sc.nextInt();
        System.out.println("Enter mark 2");
        s.mark2=sc.nextInt();
        System.out.println("Enter mark 3");
        s.mark3=sc.nextInt();
        s.total=s.mark1+s.mark2+s.mark3;
        s.avg=s.total/3;
        display(s.name,s.usn,s.mark1,s.mark2,s.mark3,s.total,s.avg);
        grade(s.avg);
    }
}