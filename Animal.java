public abstract class Animal implements Comparable<Animal>{
	private int age;
	private String name;
	private final Diet DIET; //Constant cannot be changed unique to each Animal
	private WeightClass weight;

	public Animal(String name, int age, Diet diet, WeightClass weight) {
		this.name = name;
		if (age < 0)
			this.age = 0;
		else
			this.age = age;
		this.age = age;
		this.DIET = diet;
		this.weight = weight;
	}
	//Standard Getters and Setters
	public int getAge() {
		return age;
	}
	public Diet getDiet() {
		return DIET;
	}
	public String getName() {
		return name;
	}
	public WeightClass getWeight() {
		return weight;
	}
	public void setName(String name) {
		this.name = name;
	}
	//Can only increase age
	public void setAge(int age) {
		if(age > this.age)
			this.age = age;
	}
	public void setWeight(WeightClass weight) {
		this.weight = weight;
	}
	public boolean equals(Object other) {
		if (other instanceof Animal) {
			Animal an = (Animal) other;
			//Compares each core atribute of Animal
			return this.name.equals(an.name) && this.age == an.age && this.DIET == an.DIET && this.weight == an.weight;
		}
		return false;
	}
	public int compareTo(Animal o) {
		//Compare by Diet, Weightclass, Age, Name
		if(this.DIET.compareTo(o.DIET)!=0) {
			return this.DIET.compareTo(o.DIET);
		}
		else if (this.weight.compareTo(o.weight)!=0) {
			return this.weight.compareTo(o.weight);
		}
		else if (this.age != o.age) {
			return this.age - o.age;
		}
		else {
			return this.name.compareTo(o.name);
		}
	}
	@Override
	public String toString() {
		return "Age: "+this.getAge()+" years\nDiet: "+this.getDiet()+"\nRelative Weight: "+this.getWeight();
	}
	// Returns the amount of time in minutes it takes to care for the animal
	public abstract double getCareTime(); 

}