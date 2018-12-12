package ba.coder.hyesun.day6;

public class ThisTest {
	private int Speed;
	private int Age;
	private String RobotName;
	private String RobotNum;

	public ThisTest() {
		this(0,0,"","");
	}
	public ThisTest(int Age,String RobotName,String RobotNum) {
		this.Age=Age;
		this.RobotName=RobotName;
		this.RobotNum=RobotNum;
	}
	public ThisTest(int Speed,int Age, String RobotName,String RobotNum) {
		this.Speed=Speed;
		this.Age=Age;
		this.RobotName=RobotName;
		this.RobotNum=RobotNum;
	}
	public int getSpeed() {
		return Speed;
	}
	public void setSpeed(int speed) {
		Speed = speed;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getRobotName() {
		return RobotName;
	}
	public void setRobotName(String robotName) {
		RobotName = robotName;
	}
	public String getRobotNum() {
		return RobotNum;
	}
	public void setRobotNum(String robotNum) {
		RobotNum = robotNum;
	}


}
