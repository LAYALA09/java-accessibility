package ar.com.ada.online.second.javaaccessibility.access.modifiers;

public class User {
    protected String nickName;
    protected String password;

    protected void showAttributeValues() {
        System.out.println("Nick Name: " + this.nickName);
        System.out.println("Password " + this.password);


    }
}
