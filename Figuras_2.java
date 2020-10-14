
package Dibujo_Figuras;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Figuras_2 extends JPanel{
   // ventana
    private JFrame ventana;
    // contenedor
    private Container contenedor;
    
    public Figuras_2 () {
// inicializar la ventana
        ventana = new JFrame("Dibujando icono");
        // definir tamaño a ventana
        ventana.setSize(800, 600);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);
        
        contenedor = ventana.getContentPane();
        contenedor.setSize(800, 600);
        // agregar la ventana en el contenedor
        contenedor.add(this, BorderLayout.CENTER);  
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        
        //Rectangulos parte superior
    g.setColor(Color.black);
    g.drawRoundRect(5, 50, 750, 475, 20, 20);//Rectangulo Redondo
    g.drawRect(25,60,200,200);
    g.drawRect(250,60,200,200);
    g.drawRect(500,60,200,200);
    //figuras de parte superiror
    
    //Dibujando Lineas
    g.setColor(Color.red);
    g.drawLine(70,150,200,150);
    g.drawLine(70,210,70,150);
    g.drawLine(200,210,200,150);
    g.drawLine(200,210,70,210);
    //parte de arriba de la casa 
    g.drawLine(70,150,130,90);
    g.drawLine(200,150,130,90);
    //Puerta
    g.drawLine(85,210,85,170);
    g.drawLine(115,170,85,170);
    g.drawLine(115,170,115,210);
    //Camino
    g.drawLine(80,230,115,210);
    g.drawLine(50,230,90,210);
    //Texto
    g.setColor(Color.black);
    g.drawString("Dibujando Lineas", 50, 250);
    
    //Dibujando Rectangulos
    g.setColor(Color.red);
    g.drawRect(255,165,25,50);
    g.drawRect(285,145,25,70);
    g.drawRect(320,125,25,90);
    g.drawRect(360,105,25,110);
    g.drawRect(400,90,25,125);
    g.setColor(Color.black);
    g.drawString("Dibujando Rectangulos", 300, 250);
    
    //dibujando Ovalos con rectangulos
    g.setColor(Color.black);
    g.drawString("Dibujando Ovalos con rectangulos", 500, 250);
    
    
    
    //Rectangulos parte Inferior
    g.setColor(Color.black);
    g.drawRect(20,300,200,200);
    g.drawRect(250,300,200,200);
    g.drawRect(500,300,200,200);
    
    
    //figuras parte inferior
    //Dibujando Circulos
    g.setColor(Color.red);
    g.drawOval(45, 325, 150, 150);
    g.drawOval(80, 355, 30, 30);
    g.drawOval(130, 355, 30, 30);
    g.fillOval(140, 365, 10, 10);
    g.fillOval(90, 365, 10, 10);
    g.drawOval(95, 395, 50, 50);
    g.setColor(Color.black);
    g.drawString("Dibujando Circulos", 50, 490);
    
    //Dibujando Ovalos con Circulos
    g.setColor(Color.red);
    g.drawOval(330, 310, 50, 150);
    g.drawOval(280, 370, 150, 40);
    g.drawOval(310, 340, 90, 50);
    
    
    g.setColor(Color.black);
g.drawString("Dibujando Ovalos con Circulos", 255, 490);

    //Dibujando Trinagulos
g.setColor(Color.red);
    g.drawLine(550,400,650,400);
    g.drawLine(550,400,630,350);
    g.drawLine(650,400,630,350);
    
    g.drawLine(550,360,600,360);
    g.drawLine(550,360,550,310);
    g.drawLine(600,360,550,310);
    
    g.drawLine(630,350,690,350);
    g.drawLine(630,330,690,350);
    g.drawLine(630,350,630,330);

    g.setColor(Color.black);
    g.drawString("Dibujando Triangulos", 545, 490);
    
   //Dibujando Ovalos con cuadrados
    g.setColor(Color.red);
    g.drawRoundRect(530, 130, 150, 50, 140, 70);
    g.drawRoundRect(550, 90, 110, 50, 300, 70);
    g.drawRoundRect(570, 65, 70, 170, 150, 250);
    
    
        }

}


    
    
