import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * MyCat is your own cat. Get it to do things by writing code in its act method.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyCat extends Cat
{
    public void act()
    {
        if(tired=true)
        {
         sleep(3);
         shoutHooray();
         tired= false;
        }
        if(tired=false)
        {
           shoutHooray(); 
        }
        
        
            
    }
}
