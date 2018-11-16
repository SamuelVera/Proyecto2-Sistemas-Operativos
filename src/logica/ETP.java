package logica;

public class ETP { //Entrada de la tabla de página
    private boolean p; //Presente en memoria principal
    boolean u; //Referenciado recientemente
    int numMar; //Número de marco asociada
    int numPag; //Número de pagina del proceso
    String idProceso;
    
    public ETP(int i, String id){
        this.p = false;
        this.u = false;
        this.numPag = i;
        this.idProceso = id;
    }
    
    public void setP(boolean set){
        this.p = set;
    }
    
    public boolean getP(){
        return this.p;
    }
    
    public int getMarco(){
        if(this.p){
            return this.numMar;
        }else{
            return -1;
        }
    }
    
}
