/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojo.BenhNhan;
import pojo.PhieuKhamBenh;

/**
 *
 * @author Minh Nhi
 */
public class PhieuKhamBenhDAO {
    //lay danh sach phieu kham benh
    public List<PhieuKhamBenh> laydanhsach(){
        List<PhieuKhamBenh> ds = null;
        Session s = HibernateUtil.getSessionFactory().openSession();
        try {
            String hql = "FROM PhieuKhamBenh";
            Query q = s.createQuery(hql);
            ds = q.list();
        } catch (HibernateException ex) {
            System.err.println(ex);
        }finally{
            s.close();
        }
        return ds;
    }
    //them phieu kham benh
    public boolean themphieu(PhieuKhamBenh phieu){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction(); 
            session.save(phieu); 
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback(); 
            System.err.println(ex);
        }finally { 
            session.close();
        }
        return true;
    }
    //lay danh sach theo ten
    public List<PhieuKhamBenh> laydanhsachtheoten(BenhNhan hoten){
        List<PhieuKhamBenh> ds = null;
        Session s = HibernateUtil.getSessionFactory().openSession();
        try {
            String hql = "FROM PhieuKhamBenh P WHERE P.benhNhan = :hoten";
            Query q = s.createQuery(hql);
            q.setParameter("hoten", hoten);
            ds = q.list();
        } catch (HibernateException ex) {
            System.err.println(ex);
        }finally{
            s.close();
        }
        return ds;
    }
}
