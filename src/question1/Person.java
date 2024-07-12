package question1;

public class Person implements Comparable<Person>{

	private long id;
	private String name;
	private int salary;
	private int age;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Person(long id, String name, int salary, int age) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = age;
	}
	public Person() {
		super();
		
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", salary=" + salary + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Person o) {
		
		if( this.name.compareTo(o.name)==0) 
			return (this.salary-o.salary);
		return this.name.compareTo(o.name);
	}

	
	

	
	
	
}
