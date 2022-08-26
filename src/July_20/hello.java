package July_20;
import java.util.*;
public class hello {
	//hello h = new hello();
	private String name;
	private int salary;
	public String getname()
	{
		return name;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public void setsalary(int salary)
	{
		this.salary= salary;
	}
	public int getsalary()
	{
		return salary;
	}
	public void hello(String name, int salary)
	{
		this.setname(name);
		this.getname();
		this.setsalary(salary);
		this.getsalary();
	}
	public static void main(String[] args)
	{
		hello h=new hello();
		TreeSet<hello> t=new TreeSet<hello>();
		h.hello("anni",56780934);
		
	}
}
