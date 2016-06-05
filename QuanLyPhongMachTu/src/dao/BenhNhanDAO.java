/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import pojo.*;
import org.hibernate.*;
/**
 *
 * @author Minh Nhi
 */
public class BenhNhanDAO {
    private final SessionFactory sf = HibernateUtil.getSessionFactory();
    public List<BenhNhan> findAll(){
        try {
            sf.getCurrentSession().beginTransaction();
            return sf.getCurrentSession().createCriteria(BenhNhan.class).list();
        } catch (Exception e) {
            return null;
        }
    }
    public BenhNhan find(String hoten){
        try {
            sf.getCurrentSession().beginTransaction();
            return (BenhNhan)sf.getCurrentSession().get(BenhNhan.class, hoten);
        } catch (Exception e) {
            return null;
        }
    }
    public List<BenhNhan> laydanhsach(){
        List<BenhNhan> ds = null;
        Session s = HibernateUtil.getSessionFactory().openSession();
        try {
            String hql = "FROM BenhNhan";
            Query q = s.createQuery(hql);
            ds = q.list();
        } catch (HibernateException ex) {
            System.err.println(ex);
        }finally{
            s.close();
        }
        return ds;
    }
    public boolean xoa(BenhNhan bn){
        try {
            sf.getCurrentSession().beginTransaction();
            sf.getCurrentSession().delete(bn);
            sf.getCurrentSession().getTransaction().commit();
            return true;
        } catch (Exception e) {
            sf.getCurrentSession().getTransaction().rollback();
            return false;
        }
    }
    public boolean capnhat(BenhNhan bn){
        try {
            sf.getCurrentSession().beginTransaction();
            sf.getCurrentSession().update(bn);
            sf.getCurrentSession().getTransaction().commit();
            return true;
        } catch (Exception e) {
            sf.getCurrentSession().getTransaction().rollback();
            return false;
        }
    }
    public boolean themBenhNhan(BenhNhan sv) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction(); 
            session.save(sv); 
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback(); 
            System.err.println(ex);
        }finally { 
            session.close();
        }
        return true;
    }
}
