import java.util.Scanner
class doctor{

Scanner sc=new Scanner(System.in);
int age;
String name,degree;

public void getDetails(){
           System.out.print("Doctor information");
           name=sc.next();
           age=sc.nextInt();
           degree=sc.next();
           }

public void display(){
           System.out.print(name+" "+age+" "+degree) ;
          }

}

class Engineer{

Scanner sc=new Scanner(System.in);
int age;
String name,degree;

public void getDetails(){
           System.out.print("Engineer information");
           name=sc.next();
           age=sc.nextInt();
           degree=sc.next();
           }

public void display(){
           System.out.print(name+" "+age+" "+degree) ;
          }

}

class Pilots{

Scanner sc=new Scanner(System.in);
int age;
String name,degree;

public void getDetails(){
           System.out.print("pilots information");
           name=sc.next();
           age=sc.nextInt();
           degree=sc.next();
           }

public void display(){
           System.out.print(name+" "+age+" "+degree) ;
          }


}

class Main{

public static void main(String[] arr){
       int i;
       Doctor[] doctor=new Doctor[3];
       Engineer[] engineer=new Engineer[3];
       Pilots[] pilots=new Pilots[3];

       for(i=0;i<3;i++)
          {
  
           doctor[i] =new Doctor();
           engineer[i] =new Engineer();
           pilots[i] =new Pilots();
   
          }

       for(i=0;i<3;i++)
          {
 
          doctor[i].getDetails();
          doctor[i].display();

          engineer[i].getDetails();
          engineer[i].display();

          pilots[i].getDetails();
          pilots[i].display();
          }

        }
}