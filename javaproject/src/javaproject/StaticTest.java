package javaproject;

class Top10{
	static {
		System.out.println("Top 10 Mobile brand is : ");
		System.out.println("Samsung");
		System.out.println("Apple");
		System.out.println("Xiaomi ");
		System.out.println("Oppo ");
		System.out.println("Vivo ");
		System.out.println("Realme ");
		System.out.println("Motorola Mobility");
		System.out.println("Huawei ");
		System.out.println("Transsion");
		System.out.println("Honor ");
	}
	Top10(){
		System.out.println(" Motorola became a subsidiary of Lenovo.");
	}
}
public class StaticTest {
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		Class show = Class.forName("javaproject.Top10");
		show.newInstance();
		System.out.println("Honor is a leading consumer electronics brand which was established in the year 2013");
		System.out.println("Samsung mobile is market leader in the smartphone industry ");
	}

}
