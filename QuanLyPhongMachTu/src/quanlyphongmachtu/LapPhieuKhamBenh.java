/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyphongmachtu;

import dao.BenhNhanDAO;
import dao.DonThuocDAO;
import dao.PhieuKhamBenhDAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import pojo.BenhNhan;
import pojo.DonThuoc;
import pojo.PhieuKhamBenh;

/**
 *
 * @author Minh Nhi
 */
public class LapPhieuKhamBenh extends javax.swing.JFrame {

    private int maphieu = 0;
    private boolean check = true;

    /**
     * Creates new form LapPhieuKhamBenh
     */
    public LapPhieuKhamBenh() {
        initComponents();
    }

    public LapPhieuKhamBenh(String hoten, Date ngaykham) {
        super();
        initComponents();
        txtHoten.setText(hoten);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String t = format.format(ngaykham);
        txtNgaykham.setText(t);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePhieuKhamBenh = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        cboThuoc = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cboDonvi = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtSoluong = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cboCachdung = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtHoten = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNgaykham = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTrieuchung = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cboLoaibenh = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        btnThemthuoc = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LẬP PHIẾU KHÁM BỆNH");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTablePhieuKhamBenh.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTablePhieuKhamBenh);

        jPanel4.setLayout(new java.awt.GridLayout(4, 2));

        jLabel6.setText("Thuốc");
        jPanel4.add(jLabel6);

        cboThuoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel4.add(cboThuoc);

        jLabel7.setText("Đơn vị");
        jPanel4.add(jLabel7);

        cboDonvi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "viên", "chai" }));
        jPanel4.add(cboDonvi);

        jLabel8.setText("Số lượng");
        jPanel4.add(jLabel8);

        txtSoluong.setText("0");
        jPanel4.add(txtSoluong);

        jLabel9.setText("Cách dùng");
        jPanel4.add(jLabel9);

        cboCachdung.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", " " }));
        jPanel4.add(cboCachdung);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setLayout(new java.awt.GridLayout(2, 4));

        jLabel2.setText("Họ tên:");
        jPanel3.add(jLabel2);
        jPanel3.add(txtHoten);

        jLabel3.setText("Ngày khám:");
        jPanel3.add(jLabel3);
        jPanel3.add(txtNgaykham);

        jLabel4.setText("Triệu chứng:");
        jPanel3.add(jLabel4);
        jPanel3.add(txtTrieuchung);

        jLabel5.setText("Dự đoán loại bệnh:");
        jPanel3.add(jLabel5);

        cboLoaibenh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Loại bệnh 1", "Loại bệnh 2", "Loại bệnh 3", "Loại bệnh 4", "Loại bệnh 5" }));
        jPanel3.add(cboLoaibenh);

        jPanel6.setLayout(new java.awt.GridLayout(1, 2));

        btnThemthuoc.setText("Thêm thuốc");
        btnThemthuoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThemthuocMouseClicked(evt);
            }
        });
        jPanel6.add(btnThemthuoc);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void showdata(){
        //show data-----------------------------------------------------------------------------
        //tao ten cot
        Vector cols = new Vector();
        cols.addElement("Thuốc");
        cols.addElement("Đơn vị");
        cols.addElement("Số lượng");
        cols.addElement("Cách dùng");
        //tao vector du lieu
        Vector data = new Vector();
        DonThuocDAO donthuocdao = new DonThuocDAO();
        PhieuKhamBenh tt = new PhieuKhamBenh(maphieu);
        List<DonThuoc> dsthuoc = donthuocdao.laydanhsachtheomaphieu(tt);
        if (dsthuoc != null) {
            for (int i = 0; i < dsthuoc.size(); i++) {
                DonThuoc a = dsthuoc.get(i);
                Vector abc = new Vector();
                abc.addElement(a.getThuoc());
                abc.addElement(a.getDv());
                abc.addElement(a.getSoluong());
                abc.addElement(a.getCachdung());
                data.add(abc);
            }
            jTablePhieuKhamBenh.setModel(new DefaultTableModel(data, cols));
        }
        //end show data --------------------------------------------------------------------------------
    }
    private void btnThemthuocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemthuocMouseClicked
        // TODO add your handling code here:
        //tao moi phieu kham benh
        ////lay gia tri
        String hoten = txtHoten.getText();
        String t = txtNgaykham.getText();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date ngaykham = null;
        try {
            ngaykham = format.parse(t);
        } catch (ParseException ex) {
            Logger.getLogger(LapPhieuKhamBenh.class.getName()).log(Level.SEVERE, null, ex);
        }
        String trieuchung = txtTrieuchung.getText();
        String loaibenh = cboLoaibenh.getSelectedItem().toString();
        ////tao benh nhan
        BenhNhan benhnhan = new BenhNhan(hoten, ngaykham);
        ////tao phieu
        PhieuKhamBenh phieu = new PhieuKhamBenh(benhnhan, ngaykham, trieuchung, loaibenh);
        //them
        PhieuKhamBenhDAO phieudao = new PhieuKhamBenhDAO();
        if (check == true) {
            phieudao.themphieu(phieu);
            check = false;
        }
        //lay ds phieu
        List<PhieuKhamBenh> dsphieu = phieudao.laydanhsach();
        PhieuKhamBenh temp = dsphieu.get(dsphieu.size() - 1);
        maphieu = temp.getMaphieu();
        //load ds thuoc theo ma phieu
        //DonThuocDAO donthuocdao = new DonThuocDAO();
        //tao don thuoc theo ma phieu
        String thuoc = cboThuoc.getSelectedItem().toString();
        String dv = cboDonvi.getSelectedItem().toString();
        int soluong = Integer.parseInt(txtSoluong.getText());
        int cachdung = Integer.parseInt(cboCachdung.getSelectedItem().toString());
        PhieuKhamBenh pkb = new PhieuKhamBenh(maphieu);
        DonThuoc donthuoc = new DonThuoc(pkb, thuoc, dv, soluong, cachdung);
        DonThuocDAO donthuocdao = new DonThuocDAO();
        donthuocdao.themthuoc(donthuoc);
        //cap nhat lai table thuoc
        showdata();
//        PhieuKhamBenh tt = new PhieuKhamBenh(maphieu);
//        List<DonThuoc> nhi = donthuocdao.laydanhsachtheomaphieu(tt);
//        System.out.println(nhi.size());
    }//GEN-LAST:event_btnThemthuocMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LapPhieuKhamBenh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LapPhieuKhamBenh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LapPhieuKhamBenh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LapPhieuKhamBenh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LapPhieuKhamBenh().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThemthuoc;
    private javax.swing.JComboBox<String> cboCachdung;
    private javax.swing.JComboBox<String> cboDonvi;
    private javax.swing.JComboBox<String> cboLoaibenh;
    private javax.swing.JComboBox<String> cboThuoc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePhieuKhamBenh;
    private javax.swing.JTextField txtHoten;
    private javax.swing.JTextField txtNgaykham;
    private javax.swing.JTextField txtSoluong;
    private javax.swing.JTextField txtTrieuchung;
    // End of variables declaration//GEN-END:variables
}
