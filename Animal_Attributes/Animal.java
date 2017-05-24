package Animal_Attributes;
public class Animal {
    public String animalSpecies;
    public String animalName;
    public String skinColour;
    public int legsNumber;
    public Animal(){
    }
    public Animal(String aSpecies,String aName,String sColour,int lNumber){
        this.animalSpecies=aSpecies;
        this.animalName=aName;
        this.skinColour=sColour;
        this.legsNumber=lNumber;
    }
    public String getAnimalSpecies(){
        return animalSpecies;
    }
    public void setAnimalSpecies(String animalSpecies){
        this.animalSpecies=animalSpecies;
    }
    public String getAnimalName(){
        return animalName;
    }
    public void setAnimalName(String animalName){
        this.animalName=animalName;
    }
    public String getSkinColour(){
        return skinColour;
    }
    public void setSkinColour(String skinColour){
        this.skinColour=skinColour;
    }
    public int getLegsNumber(){
        return legsNumber;
    }
    public void setLegsNumber(int legsNumber){
        this.legsNumber=legsNumber;
    }
}
