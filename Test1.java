
public class Test1 {

	private String name ,sex;
	private int age;
	
	Test1(String name,int age)
	{
		this.name = name;
		this.age  = age;
	}
	public void setData(String sex)
	{
		this.sex = sex;
	}
	
	public void showData()
	{
		System.out.println("����:"+name);
		System.out.println("�Ա�:"+sex);
		System.out.println("����:"+age);
	}
	
	public static void main(String[] args) {
		
		Test1 t = new Test1("����",29);
		t.showData();
		t.setData("��");
		t.showData();
	}
}
