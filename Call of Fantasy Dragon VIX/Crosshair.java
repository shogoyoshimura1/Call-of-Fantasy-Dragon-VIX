import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Crosshair here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Crosshair extends Actor
{
    int count = 0;
    /**
     * Act - do whatever the Crosshair wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */  

    public void act() 
    {
        int hp=0;//ヒットポイント
        
        if(Greenfoot.isKeyDown("up")){
               setRotation(270);
               move(10);
            }
        if(Greenfoot.isKeyDown("left")){
               setRotation(180);
               move(10);
            }
        if(Greenfoot.isKeyDown("down")){
               setRotation(90);
               move(10);
            }
        if(Greenfoot.isKeyDown("right")){
               setRotation(360);
               move(10);
            }
            
        if (Greenfoot.isKeyDown("space")){

               Actor actor = getOneObjectAtOffset( 0, 0, ENEMY.class );
               hp++;

               
               if( actor != null){
                    getWorld().removeObject( actor ); 
                    count++;
               }

            }
            
        getWorld().showText( "撃破数 = " + count, 100, 50 );
    }    
}

