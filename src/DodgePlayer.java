import java.awt.*;
public class DodgePlayer {
     boolean upPressed;
        boolean downPressed;
        boolean LPressed;
        boolean RPressed;
    private double x;
    private double y;
    private int lives;
    public static final int WIDTH=20;
    public static final int HEIGHT=20;
    Rectangle r;
    public DodgePlayer(double x, double y)
    {
        this.x=x;
        this.y=y;
         upPressed=false;
         downPressed=false;
        LPressed=false;
        RPressed=false;
        lives=6;
    }
     public void update () 
      {
        if(upPressed)
        {
        	if(y>0)
             y-=5;
        }
        if(downPressed)
        {
        	if(y+25<800)
            y+=5;
        }
        if(RPressed)
        {
        	if(x+25<800)
            x+=5;
        }
        if(LPressed)
        {
        	if(x>0)
            x-=5;
        }
        
       
      }
   
     public double getX() {
         return x;
            
    }
    public double getY() {
            
         return y;
    }
        public Rectangle getRectangle() 
        {
            return new Rectangle ((int)x,(int)y,WIDTH,HEIGHT);
        }
            
  
  
        public boolean getDownPressed() 
        {
            return downPressed;
        }
            
        public boolean getUpPressed() {
            return upPressed;
        }
        public boolean getLeftPressed() 
        {
            return LPressed;
        }
            
        public boolean getRightPressed() {
            return RPressed;
        }
        public void setX(double x) {
             this.x=x;
                
        }
        public void setY(double y) {
                
             this.y=y;
        }
        
        public void setDownPressed(boolean downPressed) {
            this.downPressed = downPressed;
        }
        
        public void setUpPressed(boolean upPressed) {
            this.upPressed = upPressed;
        }
        public void setLeftPressed(boolean LPressed) {
            this.LPressed = LPressed;
        }
        public void setRightPressed(boolean RPressed) {
            this.RPressed = RPressed;
        }
        public int getLives() {
            // TODO Auto-generated method stub
             
            return lives;
        }
         public void setLives(int lives) {
                this.lives = lives;
            }
          
  
}