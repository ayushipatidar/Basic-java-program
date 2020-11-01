import java.util.Scanner

public class Employee{
 int age;
 String salary,name,designation;
 Scanner sc=new Scanner(System.out);

 public void getDetails()
         {
            printf("enter name salary and age") ;
            name=sc.next();
            age=sc.nextInt();
            salary=sc.next();  
            designation=sc.next();             
   
         }
 
 public void display()
         {
       System.out.print(name+" "+age+" "+salary+" "+designation);
         }

  }

class Main{

 public static void main(String[] arr){
       int i;
       Employee[] employee=new Employee[3]; 
    
       for(i=0;i<3;i++)
         {
       employee[i]=new Employee();
         }
 
      for(i=0;i<3;i++)
        {
       employee[i].getDetails();
       employee[i].display();
        }

}