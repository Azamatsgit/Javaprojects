package encampsulation;

public class EtsyUser {

    private String email;
    private String firsName;
    private String Password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        if (password.length() <6){
            System.out.println("Password - Must be at least 6 characters");
            return;
        }
        Password = password;
    }
    public void setAccountInfo (String email, String firsName, String password){
        this.email=email;
        this.firsName=firsName;
        setPassword(password);
    }
    public String setAccountInfo(){
        return email + " | " + firsName + " | " + getPassword();


    }

}
