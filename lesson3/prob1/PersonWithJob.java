package lesson3.prob1;


public class PersonWithJob {
	private Person person;
	private double salary;

	public PersonWithJob(String name, double salary) {
		this.person = new Person(name);
		this.salary = salary;
	}

	public Person getPerson() {
		return person;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) return false;

		if (obj instanceof PersonWithJob) {
			PersonWithJob person1 = (PersonWithJob) obj;
			return person1.getPerson().getName().equals(this.getPerson().getName()) && this.getSalary() == person1.getSalary();
		}

		if (obj instanceof Person) {
			Person person1 = (Person) obj;
			return person1.getName().equals(this.getPerson().getName());
		}

		return false;
	}

	public static void main(String[] args) {
		PersonWithJob p1 = new PersonWithJob("Joe", 30000);
		Person p2 = new Person("Joe");
		//As PersonsWithJobs, p1 should be equal to p2
		System.out.println("p1.equals(p2)? " + p1.equals(p2));
		System.out.println("p2.equals(p1)? " + p2.equals(p1));
	}


}