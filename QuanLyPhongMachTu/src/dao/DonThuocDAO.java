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
import pojo.DonThuoc;
import pojo.PhieuKhamBenh;

/**
 *
 * @author Minh Nhi
 */
public class DonThuocDAO {
    //them thuoc
    public boolean themthuoc(DonThuoc donthuoc) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction(); 
            session.save(donthuoc); 
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback(); 
            System.err.println(ex);
        }finally { 
            session.close();
        }
        return true;
    }
    //load don thuoc theo ma phieu
    public List<DonThuoc> laydanhsachtheomaphieu(PhieuKhamBenh maphieu){
        List<DonThuoc> ds = null;
        Session s = HibernateUtil.getSessionFactory().openSession();
        try {
            String hql = "FROM DonThuoc D WHERE D.phieuKhamBenh = :maPhieu";
            Query q = s.createQuery(hql);
            q.setParameter("maPhieu", maphieu);
            ds = q.list();
        } catch (HibernateException ex) {
            System.err.println(ex);
        }finally{
            s.close();
        }
        return ds;
    }
}
