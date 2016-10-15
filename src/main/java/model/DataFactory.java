/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author josephawwal
 */
public class DataFactory {
    
    private final List<Member> members = new ArrayList();
    private final Gson gson = new GsonBuilder().setPrettyPrinting().create();
    
    
    public DataFactory(){
        Member jan = new Member(29, "Brun", "Brun mand", "male", "janbrun@brun.dk");
        members.add(jan);
                
        Member hans = new Member(20, "Hvid", "Hvid dame", "female", "HansHvid@hvid.dk");
        members.add(hans);
        
        Member peter = new Member(24, "Gul", "Gul mand", "mand", "peterGul@gul.dk");
        members.add(peter);
        
        Member mikkeline = new Member(30, "Grøn", "Grøn dame", "dame", "mikkelineGrøn@grøn.dk");
        members.add(mikkeline);
        
        Member janni = new Member(28, "Lila", "lilla dame", "dame", "lillaDame@lilla.dk" );
        members.add(janni);
        
        Member henrik = new Member(28, "orange", "orange mand", "mand", "orangemand@lilla.dk" );
        members.add(henrik);
        
        jan.addFriend(peter);
        jan.addFriend(mikkeline);
        
        hans.addFriend(hans);
        hans.addFriend(janni);
        hans.addFriend(jan);
        
        peter.addFriend(mikkeline);
        
        janni.addFriend(henrik);
        
        
        
        
        
    }
    
    public List<Member> getMembers(){
        return members;
    }
    
    public String getMembersAsJson(){
        
        JsonArray membersJson = new JsonArray();
        
        for (Member m: members){
            
            JsonObject mj = getMemberAsJsonObject(m);
            JsonArray friends = new JsonArray();
            
            for(Member mf : m.getFriends()){
                
                friends.add(getMemberAsJsonObject(mf));
                
            }
            mj.add("friends", friends);
            membersJson.add(mj);
            
            
            }
        
        return gson.toJson(membersJson);
        
        }
    private JsonObject getMemberAsJsonObject(Member m){
        
        JsonObject mj = new JsonObject();
        mj.addProperty("id", m.getId());
        mj.addProperty("age", m.getId());
        mj.addProperty("eyeColor", m.getEyeColor());
        mj.addProperty("name", m.getName());
        mj.addProperty("email", m.getEmail());
        return mj;
    }
    
    public static void main(String[] args) {
        DataFactory f = new DataFactory();
        System.out.println(f.getMembersAsJson());
    }

   
    
}
