/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complexe;
public class Main {
      public static void main(String[] args) {
        Complexe z1 = new Complexe(-1.0, 6.0);
        z1.affichage();
        Complexe z2 = z1.conjugue();
        z2.affichage();
        System.out.println("-------------");
        Complexe z3 = z1.somme(z2);
        z3.affichage();
        System.out.println(z3.getRe());
    }
}