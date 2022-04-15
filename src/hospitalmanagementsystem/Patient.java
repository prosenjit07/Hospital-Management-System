
package hospitalmanagementsystem;

import java.util.Scanner;
public class Patient extends HospitalManagment{
    String pid, pname, disease, gender, admit_status;
    int age;
    int id;
    //Input Method
    void new_patient()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("id:-");
        pid = input.nextLine();
        System.out.print("name:-");
        pname = input.nextLine();
        System.out.print("disease:-");
        disease = input.nextLine();
        System.out.print("sex:-");
        gender = input.nextLine();
        System.out.print("admit_status:-");
        admit_status = input.nextLine();
        System.out.print("age:-");
        age = input.nextInt();
    }
    //Output Method
    void patient_info()
    {
        System.out.println(pid + "\t" + pname + " \t" + disease + "     \t" + gender + "      \t" + admit_status + "\t" + age);
    }
    
}

//oop feature
// java class, inheritance, java object, java array, java method,