/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ms.soft.model;
import java.util.Date;
import java.io.Serializable;
import java.math.BigDecimal;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
/**
 *
 * @author Suvh
 */
public class RegistrationBean {
    private String Uname;
    private String email;
    private String username;
    private String password;
    private String repassword;
    private String BirthMonth;
    private String BirthDay;
    private String BirthYear;
    private String gender;
    private String address;
    private String phone;
    private String Fname;
    private String Lname;
    private String pin;
    private Date BDate;
    private CommonsMultipartFile filedata;
    private byte[] User_Image;
    private String USER_ADHAR_CARD;

    /**
     * @return the Uname
     */
    public String getUname() {
        return Uname;
    }

    /**
     * @param Uname the Uname to set
     */
    public void setUname(String Uname) {
        this.Uname = Uname;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the repassword
     */
    public String getRepassword() {
        return repassword;
    }

    /**
     * @param repassword the repassword to set
     */
    public void setRepassword(String repassword) {
        this.repassword = repassword;
    }

    /**
     * @return the BirthMonth
     */
    public String getBirthMonth() {
        return BirthMonth;
    }

    /**
     * @param BirthMonth the BirthMonth to set
     */
    public void setBirthMonth(String BirthMonth) {
        this.BirthMonth = BirthMonth;
    }

    /**
     * @return the BirthDay
     */
    public String getBirthDay() {
        return BirthDay;
    }

    /**
     * @param BirthDay the BirthDay to set
     */
    public void setBirthDay(String BirthDay) {
        this.BirthDay = BirthDay;
    }

    /**
     * @return the BirthYear
     */
    public String getBirthYear() {
        return BirthYear;
    }

    /**
     * @param BirthYear the BirthYear to set
     */
    public void setBirthYear(String BirthYear) {
        this.BirthYear = BirthYear;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the Fname
     */
    public String getFname() {
        return Fname;
    }

    /**
     * @param Fname the Fname to set
     */
    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    /**
     * @return the Lname
     */
    public String getLname() {
        return Lname;
    }

    /**
     * @param Lname the Lname to set
     */
    public void setLname(String Lname) {
        this.Lname = Lname;
    }

    /**
     * @return the pin
     */
    public String getPin() {
        return pin;
    }

    /**
     * @param pin the pin to set
     */
    public void setPin(String pin) {
        this.pin = pin;
    }

    /**
     * @return the BDate
     */
    public Date getBDate() {
        return BDate;
    }

    /**
     * @param BDate the BDate to set
     */
    public void setBDate(Date BDate) {
        this.BDate = BDate;
    }

    /**
     * @return the filedata
     */
    public CommonsMultipartFile getFiledata() {
        return filedata;
    }

    /**
     * @param filedata the filedata to set
     */
    public void setFiledata(CommonsMultipartFile filedata) {
        this.filedata = filedata;
    }

    /**
     * @return the User_Image
     */
    public byte[] getUser_Image() {
        return User_Image;
    }

    /**
     * @param User_Image the User_Image to set
     */
    public void setUser_Image(byte[] User_Image) {
        this.User_Image = User_Image;
    }

    /**
     * @return the USER_ADHAR_CARD
     */
    public String getUSER_ADHAR_CARD() {
        return USER_ADHAR_CARD;
    }

    /**
     * @param USER_ADHAR_CARD the USER_ADHAR_CARD to set
     */
    public void setUSER_ADHAR_CARD(String USER_ADHAR_CARD) {
        this.USER_ADHAR_CARD = USER_ADHAR_CARD;
    }


    
}
