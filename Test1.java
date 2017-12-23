
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
		System.out.println("姓名:"+name);
		System.out.println("性别:"+sex);
		System.out.println("年龄:"+age);
	}
	
	public static void main(String[] args) {
		
		Test1 t = new Test1("张三",29);
		t.showData();
		t.setData("男");
		t.showData();
	}
}
