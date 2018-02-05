/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ms.soft.service;

import ms.soft.model.RegistrationBean;
import org.apache.log4j.Logger;
import static org.hibernate.annotations.common.util.impl.LoggerFactory.logger;
import org.springframework.beans.factory.annotation.Autowired;
import ms.soft.dao.Dao;
import org.hibernate.HibernateException;

/**
 *
 * @author Suvh
 */
@org.springframework.stereotype.Service("service")
public class ServiceImpl implements Service {
      static Logger logger = Logger.getLogger(ServiceImpl.class);
    @Autowired
    private Dao dao; 
    
    
     @Override
    public boolean RegistrationUser(RegistrationBean registration) throws RuntimeException {
        boolean registrationMsg = false;
        try {
            logger.info("Enter inside Service Method:::::::::::::::::::");
            registrationMsg = dao.RegistrationUser(registration);
            return registrationMsg;
        } catch (RuntimeException ex) {
            throw new RuntimeException(ex.getMessage());
        }
    }
     @Override
    public boolean getEmailValidation(String email) throws RuntimeException {
        boolean registrationMsg = false;
        try {
            logger.info("Enter inside Service Method:::::::::::::::::::");
            registrationMsg = dao.getEmailValidation(email);
            return registrationMsg;
        } catch (NullPointerException ex) {
            throw new NullPointerException(ex.getMessage());
        } catch (HibernateException hibex) {
            throw new HibernateException(hibex.getMessage());
        } catch (RuntimeException runEx) {
            throw new RuntimeException(runEx.getMessage());
        }
    }

    
}
