/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;
import models.User;
/**
 *
 * @author Cameron
 */
public class AccountService {
    
    public User loginChecker(String username, String password){    
        if(username.equals("abe") || username.equals("barb")){
            if(password.equals("password")){
                
                return new User(username, null);
            }
        }
        return null;
    }
}
