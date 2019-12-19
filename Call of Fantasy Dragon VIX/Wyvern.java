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
    /**
     * Act - do whatever the Wyvern wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

       double rval=0;
   
   public void act() 
   {
       double s=0;
       rotate(rval);
       move((int)(Math.sin(s)+2));
       s+=0.1;
   }
   
   public Wyvern(int x){
       if(x==1600) rval = 180;
   }
    
}

