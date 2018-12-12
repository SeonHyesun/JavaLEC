package ba.coder.hyesun.day6;
/*
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisTest object=new ThisTest();

		System.out.println("obect.Age : "+object.getAge());
		System.out.println("obect.Speed : "+object.getSpeed());
		System.out.println("object.RobotName : " +object.getRobotName());
		System.out.println("object.RobotNum : "+object.getRobotNum());

	}
 */
public class MainClass{

	public static void main(String[] args) {
		Rectangle rec=new Rectangle();
		rec.setWidth(5);

		rec.calc();
		int recArea=rec.calc();
		System.out.println("≥–¿Ã= "+recArea);

	}
}