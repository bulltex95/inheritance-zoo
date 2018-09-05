package zoo;

public class Coyote extends Canis{
	
	Coyote(String typeOfAnimal, String name, int age) {
		super(typeOfAnimal, name, age);
		howl();
		hunt();
	}

	protected void howl() {
		
		System.out.println("I howl with "+super.typeOfAnimal);
	}

	protected void hunt() {
		
		System.out.println("I am a " + super.typeOfAnimal + ", watch me hunt");
	}

}
