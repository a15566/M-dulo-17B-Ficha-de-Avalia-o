package m17b_fichaaval;

public class Ponto2D {
    private int x;
    private int y;
    
   
    /** 
     * Contrutor sem parametros  
     */
    public Ponto2D(){
        x = 0;
        y = 0;        
    }
    /** 
     * Contrutor com parametros<br>
     * @param int y, int x  
     */
    public Ponto2D(int x, int y){
        this.x = x;
        this.y = y;        
    }
    
    
    /** 
     * Utiliza a função Math<br>
     * @return devolve a distância entre dois pontos
     */
    public double distancia(Ponto2D a){
        return Math.abs(Math.sqrt(Math.pow((x-a.x),2)+Math.pow((y-a.y),2)));
    }
    
    
    /** 
     * @return uma String com as coordenadas de x e y
     */
    @Override
    public String toString() {
        return "Ponto2D{" + "x=" + x + ", y=" + y + '}';
    }
    
    
     /**
     * 
     *@return devolve o valor do atributo x
     */
    public int getX() {
        return x;
    }
    
    /**
     *
     * @param int novo valor para x
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     *
     * @return devolve o valor do atributo y 
     */
    public int getY() {
        return y;
    }
    
     /**
     *
     * @param int y novo valor para y
     */
    public void setY(int y) {
        this.y = y;
    }
    
}
