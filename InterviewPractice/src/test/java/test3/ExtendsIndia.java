package test3;

public class ExtendsIndia extends India{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		India i=new ExtendsIndia();
		System.out.println(India.i5);

	}

	@Override
	public void method1() {
		System.out.println("From extends method1");
		
	}

}
