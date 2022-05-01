package com.dev.objects;
import javax.persistence.*;

@Entity
@Table (name = "treatments")
public class TreatmentObject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    @Column
    private String turn;

    @ManyToOne
    @JoinColumn (name = "author_id")
    private UserObject userObject;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTurn() {
        return turn;
    }

    public void setTurn(String turn) {
        this.turn = turn;
    }

    public UserObject getUserObject() {
        return userObject;
    }

    public void setUserObject(UserObject userObject) {
        this.userObject = userObject;
    }
}

