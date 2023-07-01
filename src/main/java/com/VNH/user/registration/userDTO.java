/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.VNH.user.registration;

import java.io.Serializable;

/**
 *
 * @author thanh
 */
public class userDTO implements Serializable{
    private String userID;
    private String email;
    private String password;
    private String Role;
    private float totalScore;

    public userDTO() {
    }

    public userDTO(String userID, String email, String password, String Role, float totalScore) {
        this.userID = userID;
        this.email = email;
        this.password = password;
        this.Role = Role;
        this.totalScore = totalScore;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String Role) {
        this.Role = Role;
    }

    public float getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(float totalScore) {
        this.totalScore = totalScore;
    }

   
}
