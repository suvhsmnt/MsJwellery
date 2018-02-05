/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ms.soft.dao;

import java.util.Date;
import ms.soft.model.RegistrationBean;
import ms.soft.presistance.RegistrationUser;
import ms.soft.presistance.RegistrationUserId;
import ms.soft.util.HibernateUtil;
import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Suvh
 */
@Repository("dao")
public class DaoImpl implements Dao {
     static Logger logger = Logger.getLogger(DaoImpl.class);
    private static final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
      @Override
    public boolean getEmailValidation(String email) throws RuntimeException {
        Session session = null;
        boolean flag = false;
        try {
            session = sessionFactory.openSession();
            Criteria criteria = session.createCriteria(RegistrationUser.class);
            criteria.add(Restrictions.eq("id.emailId", email));
            if (criteria.list().size() > 0 && !criteria.list().equals("")) {
                flag = true;
            }
            return flag;
        } catch (NullPointerException ex) {
            throw new NullPointerException(ex.getMessage());
        } catch (HibernateException hibex) {
            throw new HibernateException(hibex.getMessage());
        } catch (RuntimeException runEx) {
            throw new RuntimeException(runEx.getMessage());
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
 @Override
    public boolean RegistrationUser(RegistrationBean registration) throws RuntimeException {
        boolean registrationMsg = false;
        String f="xxxx";
        Date dt=new Date();
        Session session = null;
        Transaction transaction = null;
        try {
            logger.info("Enter Dao  RegistrationUser():::::::::::::::::::");
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            RegistrationUserId regId = new RegistrationUserId();
            RegistrationUser regUsr = new RegistrationUser();
            regId.setEmailId(registration.getEmail());
            regId.setUserName(registration.getUsername());
            regUsr.setFristName(f);
            regUsr.setLastName(f);
            regUsr.setUserPassword(registration.getPassword());
            regUsr.setBirthDay(registration.getBDate());
            regUsr.setAddress(registration.getAddress());
            regUsr.setGender(registration.getGender());
            regUsr.setPinCode(registration.getPin());
            regUsr.setMobileNo(registration.getPhone());
            regUsr.setLogDt(new Date());
            regUsr.setId(regId);
            session.save(regUsr);
            transaction.commit();
            registrationMsg = true;
        } catch (NullPointerException nullex) {
            throw new RuntimeException(nullex.getMessage());
        } catch (Exception ex) {
            throw new RuntimeException(ex.getMessage());
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return registrationMsg;
    }
}
