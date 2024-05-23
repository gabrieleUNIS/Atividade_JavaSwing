import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Swingj implements ActionListener {
    JTextField tf1,tf2,tf3;
    JButton b1,b2;

    Swingj(){
        JFrame f = new JFrame("Cálculo IMC");
        JLabel l1,l2,l3;
        Font newFont = new Font("Serif", Font.BOLD, 13);

        //configuração das labels
        l1=new JLabel("Qual o seu peso?(kg)");
        l1.setBounds(85,30, 120,30);  

        l2=new JLabel("Qual sua altura em metros?Ex.: 1.73"); 
        l2.setBounds(41,80, 230,30); 

        l3=new JLabel("Resultado:");  
        l3.setBounds(117,130, 100,30); 

        //mudança de cor para as labels
        l1.setForeground(Color.BLACK);
        l2.setForeground(Color.BLACK);
        l3.setForeground(Color.BLACK);

        //mudança de fonte para as labels
        l1.setFont(newFont);
        l2.setFont(newFont);
        l3.setFont(newFont);
        
        //configurações caixa 1 que é pergunta
        tf1 = new JTextField();
        tf1.setBounds(71,60,150,20);
        tf1.setHorizontalAlignment(JTextField.CENTER); 

        //configurações caixa 2 que é pergunta
        tf2 = new JTextField();  
        tf2.setBounds(71,110,150,20); 
        tf2.setHorizontalAlignment(JTextField.CENTER); 

        //configurações caixa 3 que é o resultado
        tf3 = new JTextField();  
        tf3.setBounds(71,160,150,20);
        tf3.setHorizontalAlignment(JTextField.CENTER); 
        tf3.setEditable(false);

        //configurações botão
        b1 = new JButton("Calcular");  
        b1.setBounds(97,210,100,25);
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);  
        b1.addActionListener(this);

        //configurações frame
        f.add(tf1);f.add(tf2);f.add(tf3);f.add(b1);f.add(l1);f.add(l2);f.add(l3);
        f.setSize(310,340);
        f.setLocationRelativeTo( null );
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  
        
        Color customColor = new Color(255, 153, 153);
        f.getContentPane().setBackground(customColor);

        f.setLayout(null);  
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {  
        String s1=tf1.getText();  
        String s2=tf2.getText();  
        double a=Double.parseDouble(s1);  
        double b=Double.parseDouble(s2);  
        double c=0;  
        int i = 0;
        double mult = b*b;
        while(e.getSource()==b1){  
            c=a/mult; 
            if(i == 2){
                break;
            }
            i += 1; 
        }
        String result = String.format("%.2f", c); 
        tf3.setText(result + " kg/m²");  
    }  
    public static void main(String[] args){
        new Swingj();
    }
}