import java.util.Scanner;
class Person
{
	char gender;
	String name,branch,qualification;
	int age;
	void personal()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter Name:");
		name=scan.nextLine();
		System.out.print("Enter age:");
		age=scan.nextInt();
		System.out.print("Enter gender:");
		gender=scan.next().charAt(0);
	}
	void qualificat()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter Qualification:");
		qualification=scan.nextLine();
		System.out.print("Enter branch:");
		branch=scan.nextLine();
	}
  	void display()
	{
		System.out.print("****Entered details are*****\n");
		System.out.println("Name="+name);
		System.out.println("Age="+age);
		System.out.println("Gender="+gender);
		System.out.println("Qualification="+qualification);
		System.out.println("Branch="+branch);
	}
	public static void main(String args[])
	{
		Person p=new Person();
		p.personal();
		p.qualificat();
		p.display();
	}
}
	