package hame;

import java.awt.event.KeyEvent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author nick
 */
public class moveHero 
{
    //location markers
    private int newx;
    private int newy;
    private int curx;
    private int cury;
    
    public void Sprite()
    {
      curx = 50;
      cury = 50;
    }
    
    
    
    public void keyTyped(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            System.out.println("Right key typed");
            curx += 1;
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            System.out.println("Left key typed");
        }
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            System.out.println("Up key typed");
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            System.out.println("Down key typed");
        }

    }

    
    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            System.out.println("Right key pressed");
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            System.out.println("Left key pressed");
        }
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            System.out.println("UP key pressed");
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            System.out.println("Down key pressed");
        }

    }

    
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            System.out.println("Right key Released");
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            System.out.println("Left key Released");
        }
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            System.out.println("UP key Released");
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            System.out.println("Down key Released");
        }
    }
}
