package Java_Assignments;
//Constructor Overloading
public class Students {
	int id;
	String name;
	int age;
	Students(int i, String n){
		id = i;
		name = n;
	}
	Students(int i, String n, int a){
		id =1;
		name =n;
		age = a;
	}
void display() {System.out.println(id+" "+name+ " " +age);}


	public static void main(String[] args) {
	Students s1 = new Students(777,"Sumi");
	Students s2 = new Students(222,"Kish", 13);
	s1.display();
	s2.display();

	}

}
