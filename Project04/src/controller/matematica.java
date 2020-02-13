import java.math.*;
import javax.swing.*;

public class Teste {
    
    private double diam;
    private double circun;
    private double area;
    private double r;
    
    public Teste() {
        
        diam = circun = area = r = 0.0;
        
        String in = JOptionPane.showInputDialog(null,"Informe o raio","Raio",JOptionPane.PLAIN_MESSAGE);
        
        r = Double.parseDouble( in );
        
        diam =2*r; 
        circun = r * Math.PI; //OBSERVAR
        area = Math.pow(r, 2) * Math.PI; //OBSERVAR
        
        System.out.print( "\nDiametro : " + diam );
        System.out.print( "\nCircunferencia : " + circun );
        System.out.print( "\nArea : " + area );
        
        System.exit(0);
    }
    
    public static void main(String[] args) {
        new Teste();
    }
    
}