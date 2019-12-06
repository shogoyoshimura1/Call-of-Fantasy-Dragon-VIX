import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.Math;
/**
 * Write a description of class Wyvern here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Wyvern extends ENEMY
{
    int a = 0;
    double b = 0;
    double c = 0;
    /**
     * Act - do whatever the Wyvern wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Math.sin(Math.toRadians(c));
        move((int)c);
        //c++;
    }
}

