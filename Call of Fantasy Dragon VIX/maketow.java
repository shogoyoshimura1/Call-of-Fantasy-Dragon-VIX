import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class maketow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class maketow extends tower
{
    /**
     * Act - do whatever the maketow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public void act() 
    {
               Actor actor = getOneObjectAtOffset( 0, 0, Dragon.class );
               Actor act = getOneObjectAtOffset( 0, 0, Wyvern.class );
               
               if( actor != null){
                    getWorld().removeObject( actor ); 
               }
               if( act != null){
                    getWorld().removeObject( act ); 
               }
    }

}    

