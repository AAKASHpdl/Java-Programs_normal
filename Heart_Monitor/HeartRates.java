package Heart_Monitor;
public class HeartRates {
    public String firstName;
    public String lastName;
    public String currentLocation;
    public int birthYear;
    public HeartRates(){
    }
    public HeartRates(String fName,String lName,String cLocation,int bYear){
        this.firstName=fName;
        this.lastName=lName;
        this.currentLocation=cLocation;
        this.birthYear=bYear;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getCurrentLocation() {
        return currentLocation;
    }
    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }
    public int getBirthYear() {
        return birthYear;
    }
    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
    public int getAge(){
        int age=2017-this.birthYear;
        return age;
    }
    public int getMaximumHeartRate(){
        int age = getAge();
        return (220-age);
    }
    public void getTargetHeartRate(int maxHeartRate){
        System.out.println("The target heart rate is between "+(0.5*maxHeartRate)+
                " and "+(0.85*maxHeartRate));
    }
}
