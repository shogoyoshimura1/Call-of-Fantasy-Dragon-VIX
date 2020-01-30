import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Point;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.*;
import java.util.Random;

/**
 * Write a description of class ENEMY here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ENEMY extends Actor
{
    /**
     * Act - do whatever the ENEMY wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    double x=0;
    double s=0;
    int x1,y1;
    static int ECounter = 0;
    Random random = new Random();
    ENEMY[] e = new ENEMY[100];  
    public void act() 
    {
       x += 1;
       if((x%30)==0) gene();
    }
    
    public void rotate(double r)
    {
        setRotation((int)r);
    }
    
    public void gene()
    {

            if(ECounter<90){
            x1 = random.nextInt(1600);
            y1 = random.nextInt(600);
            if(x1>800) x1 = 1600; 
            else x1 = 0; 
            
            if(random.nextInt(2) == 0) e[ECounter] = new Dragon(x1);
            else e[ECounter] = new Wyvern(x1);

            
            getWorld().addObject( e[ECounter],x1 , y1 );
            ECounter += 1;
        }
    }
}
