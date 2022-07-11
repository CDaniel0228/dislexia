package Vista;


import java.applet.AudioClip;
import java.awt.event.*;

import java.util.*;

import javax.swing.*;
import javax.swing.Timer;

public class Juego extends javax.swing.JFrame {

    String palabras[]={"PERRO", "ELEFANTE","HIPOPOTAMO","ARAÑA","CONEJO","GATO", "LEON", "LEOPARDO", "OSO", "SERPIENTE"}; 
    String rutas[]={"/Imagenes/PERRO.gif", "/Imagenes/elefante.gif","/Imagenes/hipopotamo.gif","/Imagenes/araña.gif","/Imagenes/conejo.gif","/Imagenes/gato.gif","/Imagenes/leon.gif","/Imagenes/leopardo.gif","/Imagenes/oso.gif","/Imagenes/serpiente.gif"}; 
    String  sonido[]={"/perro.wav", "/elefante.wav", "/hipopotamo.wav","/araña.wav","/conejo.wav","/gato.wav","/leon.wav","/leopardo.wav","oso.wav","serpiente.wav"};
    String cambio[]={"/perro_t.gif", "/elefante_t.gif", "/hipopotamo_t.jpg","/araña_t.jpg","/conejo_t.jpg","/gato_t.gif","/leon.jpg","/leopardo_t.jpg","oso_t.gif","serpiente_t.png"};
    String eliminar_l=""; 
    
    Random random = new Random();
    Timer T;
    Timer T2;
    
    int segundos=0;
    int segundos2=0;
 
    
    int  Malos=0, intentos=0, Buenos=0; ;
    int indice=0;
    int Retornar;
    
    //RANDOM
    int Indice_r=0;
    int nm[]=new int[10];
    int Contador_r=0;
    int randomNumber;
    int Repetidor=0;
    
     AudioClip Sound;      

    public Juego() {
        
       
        initComponents();
        
        btnInicio.setVisible(false);
        
         //CENTRAR
        this.setLocation(300, 150);
        
        Palabra.setVisible(false);
        prr.setVisible(false);
        
       
         if(Repetidor==0){
             
        //imagenes aleatorias     
        Set<Integer> alreadyUsedNumbers = new HashSet<>();
            
        while (alreadyUsedNumbers.size()<10) {
        randomNumber = random.nextInt(10);
   

        if (!alreadyUsedNumbers.contains(randomNumber)){
           System.out.println(nm[Contador_r]=randomNumber);
           alreadyUsedNumbers.add(randomNumber);
       Contador_r++;
      
        }
    
      }
        Repetidor=2;
    }
         
        //cambio de imagenes
        Indice_r=(nm[indice]);
        
        
        
        String pal=palabras[Indice_r];
        eliminar_l=quitarConsonantes(pal);
        prr.setText(eliminar_l);
       
        
        
        //Tiempo
         T=new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            segundos++;
            Tiempo.setText(segundos+"");
            
              if(segundos>=90){
              JOptionPane.showMessageDialog(null, "Se te a acabado el tiempo");
              segundos=0;
              
                btnInicio.setVisible(false);
                jButton2.setVisible(true);
                pos.setText("");
                neg.setText("");
                jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
                Tiempo.setText("");
                Palabra.setVisible(false);
                prr.setVisible(false);
                JOptionPane.showMessageDialog(null, "GAME OVER "+"\n \n"+"INTENTOS  "+intentos+"  \t ACIERTOS "+Buenos+"\n FALLOS "+Malos);
                Retornar=1;
                
              T.stop();
              }
            }
        });
         
         //Tiempo
         T2=new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            segundos2++;
             
            
            if (segundos2>=5){
                
                T.start();
                
                 jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource(rutas[Indice_r])));
                 
                  //sonido
                  Sound=java.applet.Applet.newAudioClip(getClass().getResource(sonido[Indice_r]));
                   Sound.play();
                    Con.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
                     Palabra.setVisible(true);
                      prr.setVisible(true);
                       btnInicio.setEnabled(true);
                       
                 segundos2=0;     
                T2.stop();
             }
            }
        });

    
    }

    public String quitarConsonantes(String pal){
         String eliminar_l=""; 
         for (int i = 0; i < pal.length(); i++) {
            char car=pal.charAt(i); 
            
            if(car!='A' && car!='E' && car!='I' && car!='O' && car!='U'){
                eliminar_l=eliminar_l+" _ ";
          
            }
            else{
                eliminar_l=eliminar_l+car; 
          
            }
        } 
         
        return eliminar_l; 
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnInicio = new javax.swing.JButton();
        Palabra = new javax.swing.JTextField();
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
        jLabel2 = new javax.swing.JLabel();
        Con = new javax.swing.JLabel();
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

        btnInicio.setBackground(new java.awt.Color(153, 51, 0));
        btnInicio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnInicio.setForeground(new java.awt.Color(102, 0, 0));
        btnInicio.setText(":)");
        btnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        getContentPane().add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 90, 30));

        Palabra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Palabra.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(Palabra, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 207, -1));

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
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 200, 150));

        pos.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        pos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(pos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 60, 20));

        neg.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        neg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(neg, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 200, 60, 20));

        V3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vidas.png"))); // NOI18N
        V3.setText("jLabel2");
        getContentPane().add(V3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, 30, -1));

        V1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vidas.png"))); // NOI18N
        V1.setText("jLabel2");
        getContentPane().add(V1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 30, -1));

        V2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vidas.png"))); // NOI18N
        V2.setText("jLabel2");
        getContentPane().add(V2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 30, -1));

        Tiempo.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        Tiempo.setForeground(new java.awt.Color(153, 0, 0));
        Tiempo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tiempo.setText("*");
        getContentPane().add(Tiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 70, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("TIEMPO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, -1, -1));
        getContentPane().add(Con, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 110, 150));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -90, 550, 460));

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
             
        
        //compara palabra
        if(Palabra.getText().equalsIgnoreCase(palabras[Indice_r])&&Buenos<9){
            Buenos++;
            JOptionPane.showMessageDialog(null, "FELICITACIONES");
            
            //cambio de imagen
            Sound.stop();
            indice++;
            Indice_r=(nm[indice]);
            
                pos.setText(""+Buenos);
                jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource(rutas[Indice_r])));
                String pal=palabras[Indice_r]; 
                String temp=quitarConsonantes(pal); 
                
                //limpiar
                prr.setText(temp);
                Palabra.setText("");
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
                
                Sound=java.applet.Applet.newAudioClip(getClass().getResource(sonido[Indice_r]));
                Sound.play();
                intentos++;
        }
        else if(Palabra.getText().equalsIgnoreCase(palabras[Indice_r])&&Buenos>=9){
        
         //regreso
         intentos++;
           
                btnInicio.setVisible(false);
                jButton2.setVisible(true);
                Retornar=1;
                JOptionPane.showMessageDialog(null, "INTENTOS  "+intentos+"  \t ACIERTOS "+Buenos+"\n FALLOS "+Malos);
                pos.setText("");
                neg.setText("");
                segundos=0;
                segundos2=0;
                T.stop();
                Tiempo.setText("");
                Palabra.setVisible(false);
                prr.setVisible(false);
                jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
 
        }
       
        else{
          //palabra incorrecta
          jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource(cambio[Indice_r])));
           Malos++;
            neg.setText(""+Malos);
             JOptionPane.showMessageDialog(null, "INTENTALO DE NUEVO");
              intentos++;
           
                if(Malos==2){
                  V1.setVisible(false);
                   }
                    else if(Malos==4){
                     V2.setVisible(false);
                      }
                    else if(Malos==6){
                      V3.setVisible(false);
                        btnInicio.setVisible(false);
                         jButton2.setVisible(true);
                           Retornar=1;
                            JOptionPane.showMessageDialog(null, "GAME OVER "+"\n \n"+"INTENTOS  "+intentos+"  \t ACIERTOS "+Buenos+"\n FALLOS "+Malos);
                             pos.setText("");
                               neg.setText("");
                                segundos=0;
                                 segundos2=0;
                                  T.stop();
                                   Tiempo.setText("");
                                    Palabra.setVisible(false);
                                     prr.setVisible(false);
                                      jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
                                       jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
             }
        }
        
          
        
        
          
                
                
            
       
    }//GEN-LAST:event_btnInicioActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        jButton2.setVisible(false);
        btnInicio.setVisible(true);
       btnInicio.setEnabled(false);
        T2.start();
        Con.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sos.gif")));
        
        
   if(Retornar==1)  {
       
     //limpia
    
     Malos=0;
     intentos=0;  
     Indice_r=0;
     Contador_r=0;
     Repetidor=0;
     indice=0;
     Buenos=0; 
     
     //imagenes aleatorias
       Set<Integer> alreadyUsedNumbers = new HashSet<>(); 
       int nm[]=new int[10];
     
   while (alreadyUsedNumbers.size()<10) {
   randomNumber = random.nextInt(10);
 
   if (!alreadyUsedNumbers.contains(randomNumber)){
        
      System.out.println(nm[Contador_r]=randomNumber);
      alreadyUsedNumbers.add(randomNumber);
       Contador_r++;
      
        }
    }
       
    //cambio de imagenes
     Indice_r=(nm[indice]);
        
     
        
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        
        String temp=""; 
        String pal=palabras[Indice_r];
        temp=quitarConsonantes(pal);
        prr.setText(temp);
       
        
        
     //limpiar
     Retornar=0;
     V1.setVisible(true);
     V2.setVisible(true);
     V3.setVisible(true);
     Palabra.setText("");
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
    private javax.swing.JLabel Con;
    private javax.swing.JTextField Palabra;
    private javax.swing.JLabel Tiempo;
    private javax.swing.JLabel V1;
    private javax.swing.JLabel V2;
    private javax.swing.JLabel V3;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel neg;
    private javax.swing.JLabel pos;
    private javax.swing.JLabel prr;
    // End of variables declaration//GEN-END:variables
}
