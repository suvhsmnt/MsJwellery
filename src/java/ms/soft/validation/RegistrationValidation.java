/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ms.soft.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ms.soft.model.RegistrationBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ms.soft.service.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 *
 * @author Suvh
 */
@Component
public class RegistrationValidation implements Validator {
      @Autowired
         private Service service;
    private Pattern pattern;
    private Matcher matcher;
    private final String strpatten = "[a-zA-Z]";
    private final String phnpattern = "[0-9]";
    private final String EMAIL_PATTERN
            = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    private final String PASSWORD_PATTERN
            = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})";


    @Override
    public boolean supports(Class<?> c) {
        return RegistrationBean.class.isAssignableFrom(c); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void validate(Object command, Errors errors) {
       ValidationUtils.rejectIfEmptyOrWhitespace(errors, "Fname", "field.Fname.empty");
       ValidationUtils.rejectIfEmptyOrWhitespace(errors, "Lname", "field.Lname.empty");
       ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "field.email.empty");
       ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "field.username.empty");
       ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "field.password.empty");
       ValidationUtils.rejectIfEmptyOrWhitespace(errors, "repassword", "field.repassword.empty");
       ValidationUtils.rejectIfEmptyOrWhitespace(errors, "BirthMonth", "field.BirthMonth.empty");
       ValidationUtils.rejectIfEmptyOrWhitespace(errors, "BirthDay", "field.BirthDay.empty");
       ValidationUtils.rejectIfEmptyOrWhitespace(errors, "BirthYear", "field.BirthYear.empty");
       ValidationUtils.rejectIfEmptyOrWhitespace(errors, "gender", "field.gender.empty");
       ValidationUtils.rejectIfEmptyOrWhitespace(errors, "address", "field.address.empty");
       ValidationUtils.rejectIfEmptyOrWhitespace(errors, "phone", "field.phone.empty");
       ValidationUtils.rejectIfEmptyOrWhitespace(errors, "pin", "field.pin.empty");
        RegistrationBean regBean = (RegistrationBean) command;
         if (regBean.getPassword() != null && !regBean.getPassword().isEmpty()) {
            if (regBean.getPassword().length() > 6 && regBean.getPassword().length() < 20) {
                pattern = Pattern.compile(PASSWORD_PATTERN);
                matcher = pattern.matcher(regBean.getPassword());
                if (!matcher.matches()) {
                    errors.rejectValue("password", "password.error");
                }
            } else {
                errors.rejectValue("password", "password.error.length");
            }
        }
        if (regBean.getRepassword() != null && !regBean.getRepassword().isEmpty()) {
            if (!regBean.getRepassword().equals(regBean.getPassword())) {
                errors.rejectValue("repassword", "repassword.error");
            }
        }

        if (regBean.getEmail() != null && !regBean.getEmail().isEmpty()) {
            pattern = Pattern.compile(EMAIL_PATTERN);
            matcher = pattern.matcher(regBean.getEmail());
            if (!matcher.matches()) {
                errors.rejectValue("email", "email.error");
            }else{
              boolean flag=service.getEmailValidation(regBean.getEmail()); 
              if(flag){
                errors.rejectValue("email", "email.exits.error");
              }
            }
        }
    }

  

}
