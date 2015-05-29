package hame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyAdapter;
import java.util.Iterator;
import java.util.Set;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Rectangle;
import java.awt.Graphics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author nick
 */
public class window extends JFrame  
{
    
    private moveHero hero;

    // constructor
    window()
    {
        super("The Hame");
        
        hero = new moveHero();
        
        addKeyListener( new TAdapter() );
        //create game canvis
        Container pane = getContentPane();
        
        DrawingPane drawSurface = new DrawingPane();
        
        pane.add( drawSurface );
        
        
        //add menu buttions
        final JPanel menuButtions = new JPanel();
        
        //create menu bar
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar( menuBar );
   
        //File menu with quit
        
        JMenu menu = new JMenu ("File");
        menuBar.add( menu );
        
        
        //quit item
        JMenuItem mItem = new JMenuItem ( "Quit" );
        mItem.addActionListener( new ActionListener()
        {
            public void actionPerformed( ActionEvent ae)
            {
                System.exit(0);
            }
        });
        menu.add( mItem );
    
       
        
    }
    
    
    
    private class TAdapter extends KeyAdapter
    {
        public void keyPressed(KeyEvent e)
        {

            hero.keyPressed(e);

        }

    
        public void keyReleased(KeyEvent e)
        {
            hero.keyReleased(e);
        }
    }
}
        
    

    
  
class DrawingPane extends JPanel
{
    //location variables
    private int currx, curry, newx, newy;
    
        //constructor
    public DrawingPane()
    {
        this.setBackground( Color.WHITE );
        repaint();
    }
        
    @Override
    public Dimension getPreferredSize()
    {
        return new Dimension( 800, 600);
    }
        
    @Override
    protected void paintComponent( Graphics g )
    {
        super.paintComponent( g ); //clear drawing canvis
            

    }
        

   
    
}
