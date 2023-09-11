public class Personnage {

    String type;
    String name;
    int health;
    Integer strength;
    String offensive;
    String defensive;


    public Personnage (String type, String name, int health, Integer strength, String offensive, String defensive) {


        this.type = type;
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.offensive = offensive;
        this.defensive = defensive;
    }





    public Personnage() {

    }


    public Personnage(String type) {
        this.type = type;
    }

    public Personnage(String type, String nom) {
        this.type = type;
        this.name = name;
    }

    /* Setter et Getter d'u attribut privé
    private String name;

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String newName) {
        this.name = newName;
    }
    */
    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getType() {
        return type;
    }

    public Integer gethealth() {
        return health;
    }

    public String toString(){
        return "Vous avez choisi un " + type + " qui s'appelle : " +  name.toUpperCase() +
                " | force d'attaque : " + strength + " | EquipementOffensif : " + offensive +
                " | EquipementDefensif : " + defensive;
    }

}

    /*
    public EquipementOffensif (){
        ;
    }
*/




    /*
    class Student{
	String name;
	String rollNo;

	//constructor
	Student(String name, String rollNo){
		this.name = name;
		this.rollNo = rollNo;
	}

	//Override toString method to get customize results.
	public String toString(){
		return "Name:" + name + ", RollNo: " + rollNo;
	}
}

public class ToStringExample2 {
	public static void main(String args[]){
		//creating Student class object
		Student stu1 = new Student("Sunil", "MCA/07/15");
		Student stu2 = new Student("Sandy", "MCA/07/19");
		Student stu3 = new Student("Roxy", "MCA/07/32");

		//println internally call toString method
		System.out.println(stu1);
		System.out.println(stu2);
		System.out.println(stu3);
	}
}
*/







