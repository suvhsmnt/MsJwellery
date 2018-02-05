/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ms.soft.model;

import java.io.Serializable;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

/**
 *
 * @author suvh
 */
public class LoginDetails implements Serializable {

    private String name;
    private String password;
    private String fristName;
    private String lastName;
    private String address;
    private String pinCode;
    private String mobileNo;
    private String emailId;
    private String passWd;
    private byte[] productImage;
    private CommonsMultipartFile filedata;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
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
     * @return the fristName
     */
    public String getFristName() {
        return fristName;
    }

    /**
     * @param fristName the fristName to set
     */
    public void setFristName(String fristName) {
        this.fristName = fristName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
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
     * @return the pinCode
     */
    public String getPinCode() {
        return pinCode;
    }

    /**
     * @param pinCode the pinCode to set
     */
    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    /**
     * @return the mobileNo
     */
    public String getMobileNo() {
        return mobileNo;
    }

    /**
     * @param mobileNo the mobileNo to set
     */
    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    /**
     * @return the emailId
     */
    public String getEmailId() {
        return emailId;
    }

    /**
     * @param emailId the emailId to set
     */
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    /**
     * @return the passWd
     */
    public String getPassWd() {
        return passWd;
    }

    /**
     * @param passWd the passWd to set
     */
    public void setPassWd(String passWd) {
        this.passWd = passWd;
    }

    /**
     * @return the productImage
     */
    public byte[] getProductImage() {
        return productImage;
    }

    /**
     * @param productImage the productImage to set
     */
    public void setProductImage(byte[] productImage) {
        this.productImage = productImage;
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

}
