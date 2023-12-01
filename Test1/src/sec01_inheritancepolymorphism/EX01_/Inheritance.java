package sec01_inheritancepolymorphism.EX01_;

class Human{
	String name;
	int age;
	void eat () {System.out.println(name+"이 밥을 먹습니다");}
	void sleep() {System.out.println(name+"이 잠을 잡니다");}
}

class Student extends Human{
	int studentID;
	void gotoSchool() {System.out.println(name+"이 학교에 갑니다");}
}

class Worker extends Human{
	int workerID;
	void goTOWork() {System.out.println(name+"이 일을 하러 갑니다");}
}
public class Inheritance {
	public static void main(String[] args) {
		Human h = new Human();
		h.name = "김현지";
		h.age = 11;
		h.eat();
		h.sleep();
		Student s = new Student();
		s.name = "김민성";
		s.age = 16;
		s.studentID = 128;
		s.eat();s.sleep();
		Worker w = new Worker();
		w.name = "봉윤정";
		w.age = 45;
		w.workerID = 128;
		w.eat();
		w.sleep();
		w.goTOWork();
		
	}
}