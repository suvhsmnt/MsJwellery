/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ms.soft.service;

import ms.soft.model.RegistrationBean;
import ms.soft.model.LoginDetails;

import java.util.List;
/**
 *
 * @author Suvh
 */
public interface Service {


   // ************************************* user registration  *********************************
    public boolean RegistrationUser(RegistrationBean registration) throws RuntimeException;

    public boolean getEmailValidation(String email) throws RuntimeException;
    
}
