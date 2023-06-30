package activity28thJune;

public class Dog {
	String name;
	String breed;
	
	public Dog(String name, String breed) {
		this.name = name;
		this.breed = breed;
		}
	
	public String getName() {
		return name;
		}
	
	public void setName(String name) {
		this.name = name;
		}
	
	public String getBreed() {
		return breed;
		}
	
	public void setBreed(String breed) {
		this.breed = breed;
		}
	
    // Overriding the equals method to compare Dog objects
    public boolean equals(Dog dog) {
    	if(this.breed == dog.breed) {
    		return true;
    	}else {
    		return false;
    	}

    }

    public String toString() {
    	return "Dog{ name = '" + name +  '\'' +  ", breed ='" + breed + '\'' +'}';
    	}
	
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    	//create two dogs
    	Dog dog1 = new Dog("Pipi", "Border Collie");
		Dog dog2 = new Dog("Huniu", "Chinese Country Dog");
		
		dog1.setName("PP");
		dog2.setBreed("Chinese Rural Dog");
		
		System.out.println(dog1);
		System.out.println(dog2);
		
		//create an array to store dogs
		Dog[] dogArray;
		dogArray = new Dog[]{dog1, dog2};
		
		//compare dogs' breed
		//dog1 v. dog2
		if(dog1.equals(dog2)) {
			System.out.println(" dog1 and dog2 are the same breed"  );
		}else {
			System.out.println(" dog1 and dog2 are not the same breed"  );
		}
		//dog3 vs dog1 & dog2
		Dog dog3 = new Dog("Pi", "Border Collie" );
		for(int i = 0; i < 2; i++) {
			if(dog3.equals(dogArray[i])) {
				System.out.println(" dog3 and dog" + (i + 1) +" are the same breed"  );
			}else {
				System.out.println(" dog3 and dog" + (i + 1) +" are not the same breed"  );
			}
		}

    }
    
}
