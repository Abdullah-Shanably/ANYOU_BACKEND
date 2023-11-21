package com.mart.anyouwebappbackend.admin;


import jakarta.persistence.*;

@Entity
@Table(name = "admin")
public class Admin {
    @Id
    @SequenceGenerator(
       name = "admin_sequence",
       sequenceName = "admin_sequence",
       allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Admin_sequence")
    private long id;
    private String userName;
    private String password;

    public Admin(long id, String userName, String password) {
        this.id = id;
        this.userName = userName;
        this.password = password;
    }

    public Admin() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
