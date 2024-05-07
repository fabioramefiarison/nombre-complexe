
package complexe;

/// - | private   | ao anaty classe ihany
/// + | public    | hita foana
/// # | protected | hita ao am zanany koa
///   |           | visibilité package

public class Complexe {
    private double re;
    private double im;
    
    public Complexe(){ //
        re = 1.0;
        im = 1.0;
        }
    
    public Complexe(double re, double im){ //Surdéfinition de constructeur
        this.re = re;
        this.im = im;
    }
    
    public void affichage(){
        System.out.println(this.re+(this.im>=0?"+":"")+this.im+"i");
    }
    public Complexe somme(Complexe autre){
        return new Complexe(this.re+autre.re, this.im+autre.im);
    }
    
    public Complexe conjugue(){
        return new Complexe(this.re, -this.im);
    }
    public static void main(String[] args) {
       Complexe c = new Complexe();
       Complexe c2 = new Complexe(1.2,6.9);
       c.re = 1.0; c.im = 3.5;
       c.affichage();
       c2.affichage();
    }
    
    public double getRe(){ //Getters
        return re;
    }
    public double getIm(){ //accesseurs
        return im;
    }
    
    public void setRe(double newRe){ //Setters
        this.re = newRe;
    }
    
    public void setIm(double newIm){ //mutateurs
        this.im = newIm;
    }
}

   /* 
    public Complexe somme(Complexe autre){
       Complexe tmp = new Complexe();
       tmp.re = re + autre.re;
       tmp.im = im + autre.im;
       return tmp;
    }
    
    public Complexe conjugue(){
        Complexe tmp = new Complexe();
        tmp.re = re;
        tmp.im = -im;
        return tmp;
    }
*/
 
/*

 public Complexe(){ ///Constructeur
       re = 1.0;
       im = 1.0;
    }

    //Surdéfinition de constructeur
    public Complexe(double re, double im){ 
       this.re = re;
       this.im = im;
    }

    
   
    public Complexe somme(Complexe autre){
       return new Complexe(re+autre.re, im+autre.im);    
    }
    
    public Complexe conjugue(){
        return new Complexe(re, -im);
    }
*/