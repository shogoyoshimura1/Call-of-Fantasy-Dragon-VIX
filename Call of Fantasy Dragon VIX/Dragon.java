  import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dragon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dragon extends ENEMY
{
    /**
     * Act - do whatever the Dragon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   double rval=0;
   
   public void act() 
   {
       rotate(rval);
       move(1);
   }
   
   public Dragon(int x){
       
       if(x==1600) rval = 180;
   }
    
}
