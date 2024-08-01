/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comments;

import Users.users;

/**
 *
 * @author Johel M
 */
public class Comment {
    private int id;
    private users user;
    private String comment;

    public int getId() {
        return id;
    }

    public users getUser() {
        return user;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Comment(int id, users user, String comment) {
        this.id = id;
        this.user = user;
        this.comment = comment;
    }
    
    public Comment(){
        this(0, new users(),"");
    }
    
    
}
