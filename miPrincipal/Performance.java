package Ejemplo1;
public class Performance{
    private long ti;
    private long tf;
    private boolean stoped;
    public Performance(){
        start();
    }
    public void start {

        ti=System.currentTimeMillis();
        stoped = true;
    }
    public void stop{
        tf=System.currentTimeMillis();
    }
    public long getMillis(){

        return tf-ti;
    }
    public string toString(){
        if(! stoped){
            stop();;
        }
        long diff = tf - ti;
        long min=diff/1000/60;
        long sec =(diff/1000)%60;
        return diff+"milisegundos ("+min+" minutos"+sec+" segundos";
    }
    public long getTi(){
        return ti;
    }
    public void setTi(long ti){
    }
    public long getTf(){
        return tf;
    }
    public void setTf(long tf){
        this.tf=tf;
    }
    public boolean isStoped(){
        return stoped;
    }
    public long getTf(){
        return tf;
    }
    public void setTf(long tf){
        this.tf = tf;
    }
    public boolean isStoped(){
        return stoped;
    }
    public void setStoped(boolean stoped) {
        this.stoped = stoped;
    }
}