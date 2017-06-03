
package oop2;

/**
 *
 * @author Dede Hendri
 */
public class Jenishwn extends Hewan  {
 
    private String Makanan ;
    private String Berkembangbiak;
   
    public void setMakanan(String mkn){
        this.Makanan=mkn;
    }
    public void setBerkembangbiak(String bk){
        this.Berkembangbiak = bk;        
    }
    public String getMakanan(){
        return this.Makanan;
    }
    public String getBerkembangbiak(){
        return this.Berkembangbiak;
    }    

    
    @Override
    protected void Tmpljenis() {
     super.setjenis("Mamalia"); 
     System.out.println("Jenis Hewan = " +super.getjenis());
    }

    @Override
    protected void Tmplhabitat() {
       super.sethabitat("Air&darat"); 
     System.out.println("Habitat hewan = " +super.gethabitat());
    }
    public void Berjalan(String jln) {
		System.out.println(jln);
}
    public void Berjalan(String jln1, String jln2) {
		System.out.println(jln1 + jln2);
}

    
}
