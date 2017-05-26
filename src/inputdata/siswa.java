/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputdata;

/**
 *
 * @author Dhea
 */
public class siswa {
    String nis, nama;
    public siswa(){}
    
    public siswa (String ni, String nm){
        setData (ni, nm);
    }

    private void setData(String ni, String nm) {
        //To change body of generated methods, choose Tools | Templates.
        nis = ni;
        nama = nm;
    }
}
