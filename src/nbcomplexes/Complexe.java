/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nbcomplexes;

/**
 *
 * @author ANDRY-PC
 */
public class Complexe {
    private double re;
    private double im;
    
    public Complexe(double _re, double _im){ //constructeur
        re=_re; im=_im;
  
    }
    
    public void affichage(){
        System.out.println(re+(im>=0?"+":"")+im+"i");
    }
    
    public Complexe conjugue(){
        Complexe out = new Complexe(0,0); /// amboary SVP
        out.re = this.re; out.im = -this.im;
        return out;
    }
    //this+autre
    public Complexe somme(Complexe autre){
        Complexe out = new Complexe(0,0); /// amboary tompoko
        out.re = this.re+autre.re; out.im = this.im+autre.im;
        return out; 
    }
   
    public static void main(String args[]){
        Complexe z1 = new Complexe(1,7);
        Complexe z2;// = new Complexe();
       // z1.re = 1; z1.im = 7;
        z1.affichage();
        z2 = z1.conjugue();
        z2.affichage();
        z2.somme(z1).affichage();
    }
}
