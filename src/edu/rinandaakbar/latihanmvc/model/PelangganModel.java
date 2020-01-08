/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.rinandaakbar.latihanmvc.model;

import edu.rinandaakbar.latihanmvc.event.PelangganListener;
import javax.swing.JOptionPane;

/**
 *
 * @author 
 * Nama     : Rinanda Al Qorrie Akbar
 * NIM      : 10116458
 * Kelas    : PBOUlang
 */
public class PelangganModel {
    private String Nama;
    private String Email;
    private String NoTelp;
    
    private PelangganListener pelangganListener;

    public PelangganListener getPelangganListener() {
        return pelangganListener;
    }

    public void setPelangganListener(PelangganListener pelangganListener) {
        this.pelangganListener = pelangganListener;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
        fireOnChange();
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
        fireOnChange();
    }

    public String getNoTelp() {
        return NoTelp;
    }
    
    public void setNoTelp(String NoTelp) {
        this.NoTelp = NoTelp;
        fireOnChange();
    }
    
    protected void fireOnChange(){
        if (pelangganListener!=null){
            pelangganListener.onChange(this);
        
        }
    }
    
    public void resetForm(){
        setNama("");
        setEmail("");
        setNoTelp("");
    
    }
    
    public void simpanForm(){
       JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
        resetForm();
        
    }
}
