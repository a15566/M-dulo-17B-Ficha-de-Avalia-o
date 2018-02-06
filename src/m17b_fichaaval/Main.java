package m17b_fichaaval;
/** 
 * @author Ricardo Cardoso || Samuel Egger
 * @version 1.3
 */
public class Main {

    public static void main(String[] args) {
        Ponto2D p1 = new Ponto2D(5,7);
        Ponto2D p2 = new Ponto2D(2,8);
        
        System.out.println(p1);
        System.out.println(p2);
        
        System.out.println(p2.distancia(p1));
                
    }
}
