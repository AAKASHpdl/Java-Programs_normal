package inheritanceDemo;
public class Person {
    private String name;
    private String address;
    private String telephone;
    private String email;
    public int value=11;
    public Person(){
    }
    public Person(String name,String address,String telephone,String email){
        this.name=name;
        this.address=address;
        this.telephone=telephone;
        this.email=email;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getTelephone(){
        return telephone;
    }
    public void setTelephone(String telephone){
        this.telephone = telephone;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void printProfile(){
        System.out.println("Your name is "+this.name);
        System.out.println("Your address is "+ this.address);
        System.out.println("Your telephone is"+this.telephone);
        System.out.println("Your email is "+this.email);
    }
}
