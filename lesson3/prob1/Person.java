package lesson3.prob1;


public class Person {

	private String name;
	Person(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}

	@Override
	public boolean equals(Object o) {
		if (o == null) return false;

		if (o instanceof PersonWithJob) {
			PersonWithJob person = (PersonWithJob) o;
			return person.getPerson().getName().equals(this.getName());
		}

		if (o instanceof Person) {
			Person person = (Person) o;
			return person.getName().equals(this.getName());
		}

		return false;
	}
}

/*
 * Explanation:
 *
 * Based on the initial boilerplate that was provided, the equals() method
 * that was declared in the Person class was implemented by
 * only comparing the "name" field while the PersonWithJob class was comparing
 * both "name" and "salary" which will not be equal when comparing PersonJob
 * to Person because the person doesn't have a salary property. That's why
 * p1.equals(p2) is false since p2 doesn't have a "salary", so it will return false
 * but for p2.equals(p1) it is true since when checking the equals inside the Person
 * class it is only checking the "name" property.
 *
 */