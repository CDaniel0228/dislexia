
import java.applet.AudioClip;
import java.awt.event.*;

import java.util.*;

import javax.swing.*;
import javax.swing.Timer;

public class Juego extends javax.swing.JFrame {

    String palabras[]={"PERRO", "ELEFANTE","HIPOPOTAMO","ARAÑA","CONEJO","GATO", "LEON", "LEOPARDO", "OSO", "SERPIENTE"}; 
    String rutas[]={"/PERRO.gif", "/elefante.gif","/hipopotamo.gif","/araña.gif","/conejo.gif","/gato.gif","/leon.gif","/leopardo.gif","oso.gif","serpiente.gif"}; 
    String  sonido[]={"/perro.wav", "/elefante.wav", "/hipopotamo.wav","/araña.wav","/conejo.wav","/gato.wav","/leon.wav","/leopardo.wav","oso.wav","serpiente.wav"};
    String cambio[]={"/perro_t.gif", "/elefante_t.gif", "/hipopotamo_t.jpg","/araña_t.jpg","/conejo_t.jpg","/gato_t.gif","/leon.jpg","/leopardo_t.jpg","oso_t.gif","serpiente_t.png"};
    Random random = new Random();
    Timer T;
    
    int segundos=0;
    int p=1, n=0, tt=0;
    int in;  
    int lll=0;
    int nm[]=new int[10];
    int c=0;
    int randomNumber;
    int pp=0;
    
    int indice=0;
    int cont=0; 
    AudioClip Sound;      

    public Juego() {
        
       
        initComponents();
        
        jButton1.setVisible(false);
        
         //CENTRAR
        this.setLocation(300, 150);
        //imagen
        
       
       
         if(pp==0){
             
        //imagenes aleatorias     
        Set<Integer> alreadyUsedNumbers = new HashSet<>();
            
        while (alreadyUsedNumbers.size()<10) {
        randomNumber = random.nextInt(10);
   

        if (!alreadyUsedNumbers.contains(randomNumber)){
           System.out.println( nm[c]=randomNumber);
           alreadyUsedNumbers.add(randomNumber);
       c++;
      
        }
    
      }
        pp=2;
    }
         
        //cambio de imagenes
        lll=(nm[indice]);
        
        
        String temp=""; 
        String pal=palabras[lll];
        temp=quitarConsonantes(pal);
        prr.setText(temp);
       
        
        
        //Tiempo
         T=new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            segundos++;
            Tiempo.setText(segundos+"");
                       
            }
        });
    
    }

    public String quitarConsonantes(String pal){
         String temp=""; 
         for (int i = 0; i < pal.length(); i++) {
            char car=pal.charAt(i); 
            
            if(car!='A' && car!='E' && car!='I' && car!='O' && car!='U'){
                temp=temp+" _ ";
          
            }
            else{
                temp=temp+car; 
          
            }
        } 
         
        return temp; 
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        prr = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pos = new javax.swing.JLabel();
        neg = new javax.swing.JLabel();
        V3 = new javax.swing.JLabel();
        V1 = new javax.swing.JLabel();
        V2 = new javax.swing.JLabel();
        Tiempo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);
        setMinimumSize(new java.awt.Dimension(450, 316));
        setPreferredSize(new java.awt.Dimension(516, 100));
        setSize(new java.awt.Dimension(0, 0));
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(153, 51, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 0, 0));
        jButton1.setText(":)");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 90, 30));

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 207, -1));

        prr.setBackground(new java.awt.Color(0, 0, 0));
        prr.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        prr.setForeground(new java.awt.Color(153, 0, 0));
        prr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prr.setText("*");
        getContentPane().add(prr, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 200, 31));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setText("Palabra");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("JUEGO DE PALABRAS");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 200, -1));

        jButton2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(153, 0, 0));
        jButton2.setText("INICIO");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 90, -1));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 200, 150));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 200, 150));

        pos.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        pos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(pos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 60, 20));

        neg.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        neg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(neg, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 200, 60, 20));

        V3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vidas.png"))); // NOI18N
        V3.setText("jLabel2");
        getContentPane().add(V3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, 30, -1));

        V1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vidas.png"))); // NOI18N
        V1.setText("jLabel2");
        getContentPane().add(V1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 30, -1));

        V2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vidas.png"))); // NOI18N
        V2.setText("jLabel2");
        getContentPane().add(V2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 30, -1));

        Tiempo.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        Tiempo.setForeground(new java.awt.Color(0, 51, 51));
        Tiempo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tiempo.setText("*");
        getContentPane().add(Tiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 70, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -90, 550, 460));

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                
        //vidas
        switch (n) {
            case 2:
                V1.setVisible(false);
                break;
            case 4:
                V2.setVisible(false);
                break;
            case 6:
                V3.setVisible(false);
                jButton1.setVisible(false);
                jButton2.setVisible(true);
                in=1;
                JOptionPane.showMessageDialog(null, "GAME OVER");
                pos.setText("");
                neg.setText("");
                break;
            default:   
                break;
        }
        
        //compara palabra
        if(jTextField1.getText().equals(palabras[lll])&&cont<9){
            cont++;
            JOptionPane.showMessageDialog(null, "FELICITACIONES");
            
            //cambio de imagen
            Sound.stop();
            indice++;
            lll=(nm[indice]);
            
                pos.setText(""+cont);
                jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource(rutas[lll])));
                String pal=palabras[lll]; 
                String temp=quitarConsonantes(pal); 
                
                //limpiar
                prr.setText(temp);
                jTextField1.setText("");
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
                
                Sound=java.applet.Applet.newAudioClip(getClass().getResource(sonido[lll]));
                Sound.play();
            
        }
        else if(jTextField1.getText().equals(palabras[lll])&&cont>=9){
        
         //regreso
         tt=n+cont;
         JOptionPane.showMessageDialog(null, "INTENTOS  "+tt+"\t ACIERTOS "+cont+"\n FALLOS "+n);
         jButton1.setVisible(false);
         jButton2.setVisible(true);
         in=1;
         
         
        }
       
        else{
            //palabra incorrecta
             jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource(cambio[lll])));
             neg.setText(""+n++);
             JOptionPane.showMessageDialog(null, "INTENTALO DE NUEVO");
           tt=n+cont;
             if(n==6){
                V3.setVisible(false);
                jButton1.setVisible(false);
                jButton2.setVisible(true);
                in=1;
                JOptionPane.showMessageDialog(null, "GAME OVER "+"\n \n"+"INTENTOS  "+tt+"  \t ACIERTOS "+cont+"\n FALLOS "+n);
                pos.setText("");
                neg.setText("");
             
             }
        }
        
          
        
        
          
                
                
            
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        jButton2.setVisible(false);
        jButton1.setVisible(true);
        T.start();
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource(rutas[lll])));
        //sonido
        Sound=java.applet.Applet.newAudioClip(getClass().getResource(sonido[lll]));
        Sound.play();
        
   if(in==1)  {
       
     //limpia
     p=1;
     n=1;
     tt=0;  
     lll=0;
     c=0;
     pp=0;
     indice=0;
     cont=0; 
     
     //imagenes aleatorias
       Set<Integer> alreadyUsedNumbers = new HashSet<>(); 
       int nm[]=new int[10];
     
   while (alreadyUsedNumbers.size()<10) {
   randomNumber = random.nextInt(10);
 
   if (!alreadyUsedNumbers.contains(randomNumber)){
        
      System.out.println( nm[c]=randomNumber);
      alreadyUsedNumbers.add(randomNumber);
       c++;
      
        }
    }
       
    //cambio de imagenes
     lll=(nm[indice]);
        
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource(rutas[lll])));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        
        String temp=""; 
        String pal=palabras[lll];
        temp=quitarConsonantes(pal);
        prr.setText(temp);
       
         //sonido
        Sound=java.applet.Applet.newAudioClip(getClass().getResource(sonido[lll]));
        Sound.play();
        
     //limpiar
     in=0;
     V1.setVisible(true);
     V2.setVisible(true);
     V3.setVisible(true);
     pos.setText("");
     neg.setText("");
     jTextField1.setText("");
      }
    }//GEN-LAST:event_jButton2ActionPerformed

   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Tiempo;
    private javax.swing.JLabel V1;
    private javax.swing.JLabel V2;
    private javax.swing.JLabel V3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel neg;
    private javax.swing.JLabel pos;
    private javax.swing.JLabel prr;
    // End of variables declaration//GEN-END:variables
}
