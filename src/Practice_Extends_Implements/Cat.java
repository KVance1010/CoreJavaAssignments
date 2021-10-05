package Practice_Extends_Implements;

public class Cat extends Animal{
	
	
	

	@Override
	public String toString() {
		return "Cat [getAge()=" + getAge() + ", getWeight()=" + getWeight() + ", getName()=" + getName()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	

}
