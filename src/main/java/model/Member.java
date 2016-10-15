/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author josephawwal
 */
public class Member {
    
    private static int nextID;
    private int id;
    private int age;
    
    private String eyeColor;
    private String name;
    private String gender;
    private String email;
    private List<Member> friends = new ArrayList();
    
    public Member(int age, String eyeColor, String name, String gender, String email){
        
        this.id = ++nextID;
        this.age = age;
        this.eyeColor = eyeColor;
        this.name = name;
        this.gender = gender;
        this.email = email;
        
    }

    public static int getNextID() {
        return nextID;
    }

    public static void setNextID(int nextID) {
        Member.nextID = nextID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Member> getFriends() {
        return friends;
    }

    public void setFriends(List<Member> friends) {
        this.friends = friends;
    }
    
    public void addFriend(Member friend){
        
        friends.add(friend);
    }
    
}
