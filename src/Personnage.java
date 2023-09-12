public class Personnage {

    String type;
    String name;
    int health;
    Integer strength;
    String offensive;

    public void setDefensive(String defensive) {
        this.defensive = defensive;
    }

    String defensive;


    public void setType(String type) {
        this.type = type;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    public void setOffensive(String offensive) {
        this.offensive = offensive;
    }
    public void setName(String name) {
        this.name = name;
    }





    public Personnage (String name,String type,  int health, Integer strength, String offensive, String defensive) {

        this.name = name;
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

    public Personnage(String type, String name) {
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



    public void setPersonnage (String newName,String newType,  int health, Integer strength, String offensive, String defensive) {
        this.name = newName;
        this.type= newType;

    }




    public String getName() {
        return name;
    }


    public String getType() {
        return type;
    }

    public Integer gethealth() {
        return health;
    }

    public String toString(){
        return "Vous avez choisi un " + type + " qui s'appelle : " +  name.toUpperCase() +
                " | force d'attaque : " + strength + " | Vie " + health + "EquipementOffensif : " + offensive +
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







