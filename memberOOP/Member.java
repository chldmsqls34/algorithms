package memberOOP;

public class Member {
    private String username;
    private String password;
    private String pwAgain;
    private String name;
    private String personId;
    private String phoneNumber;
    private String address;
    private String job;

    public void setUsername (String username){
        this.username = username;
    }
    public String getUsername(){
        return this.username;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return this.password;
    }
    public void setPwAgain(String pwAgain){
        this.pwAgain = pwAgain;
    }
    public String getPwAgain(){
        return this.pwAgain;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setPersonId(String personId){
        this.personId = personId;
    }
    public String getPersonId(){
        return this.personId;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return this.address;
    }
    public void setJob(String job){
        this.job = job;
    }
    public String getJob(){
        return this.job;
    }

}
