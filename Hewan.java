package oop2;

/**
 *
 * @author Dede Hendri
 */
public abstract class Hewan implements HewanIntfrc {
    
    protected String jenis;
    protected String habitat;
	
    protected String getjenis() {
        return this.jenis;
        
    }
    
    protected String gethabitat () {
        return this.habitat;
        
    }
    public void setjenis(String jenis) {
      this.jenis= jenis;  
        
    }
    
    public void sethabitat(String hbt) {
        this.habitat=hbt;
    }
    
    protected abstract void Tmpljenis();
    protected abstract void Tmplhabitat();
    
	
}