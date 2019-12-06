import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Point;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.*;

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
    public void act() 
    {
       move(5);
       rotate(x);
       x += 0.3;
    }
    
    public void rotate(double r)
    {
        setRotation((int)r);
    }
}
