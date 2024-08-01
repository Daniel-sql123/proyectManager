/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Users;

/**
 *
 * @author Usuario
 */
public class users {
    
    private String id;
    private String name;
    private String email;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public users(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public users() {
        this("","","");
    }

    @Override
    public String toString() {
        return "users{" + "id=" + id + ", name=" + name + ", email=" + email + '}';
    }
    
    
    
    
}
