/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comments;

import Users.users;

/**
 *
 * @author Usuario
 */
public class comment {
        private int id;
    private users user;
    private comment comment;

    public int getId() {
        return id;
    }

    public users getUser() {
        return user;
    }

    public comment getComment() {
        return comment;
    }

    public void setComment(comment comment) {
        this.comment = comment;
    }

    public comment(int id, users user, comment comment) {
        this.id = id;
        this.user = user;
        this.comment = comment;
    }

    

    public comment() {
        this(0,new users(),null);
    }
}
