
package hospitalmanagementsystem;

//import java.io.*;
//import java.util.*;
import java.util.Calendar;
import java.util.Scanner;
public class Staff extends HospitalManagment {
    
     String sid, sname, desg, gender;
    int salary;
    void new_staff()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("id:-");
        sid = input.nextLine();
        System.out.print("name:-");
        sname = input.nextLine();
        System.out.print("desigination:-");
        desg = input.nextLine();
        System.out.print("sex:-");
        gender = input.nextLine();
        System.out.print("salary:-");
        salary = input.nextInt();
    }
    void staff_info()
    {
        System.out.println(sid + "\t" + sname + "\t" + gender + "\t" + salary);
    }
    
}
