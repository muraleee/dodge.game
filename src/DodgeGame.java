import java.awt.Point;
import java.awt.Rectangle;
     
public class DodgeGame {
    public static final int PLAYING = 0;
    public static final int GAME_OVER = 1;
    public static final int WIN = 2;
    private DodgePlayer p;
    private Levels level;
    public Obstacles obstacle;
    int status;
    private int lives=6;
    boolean load = false;
    boolean check=false;
    public DodgeGame() {
        reset();
    }
     
    public void update() {
    	if(status==PLAYING)
    	{
    		if (!load) {
                level.load();
                load = true;
                p.update();
            }
           
            fix();
            level.update();
            hit();
            if(lives==0)
            {
            	status=GAME_OVER;
            }
            for (int n = 0; n < level.getObstacles().size(); n++) {
                moveObstacle(n, level.getObstacles(n).getSpeed());
            }
            if (getDodgePlayer().getRectangle().intersects(level.GoalRectangle())) {
                win(true);
            }
    	}
        
     
    }
     
    private void moveObstacle(int n, double speed) {
        // TODO Auto-generated method stub
        // obstacle.setX(obstacle.getX()+speed);
        // level.getObstacles(n).setD(level.getObstacles(n).getD()+1);
          
        if (level.getObstacles(n).getBasic()) {
            if (level.getObstacles(n).getDirection().equals("E")) {
                level.getObstacles(n).setX(level.getObstacles(n).getX() + speed);
     
            }
            if (level.getObstacles(n).getDirection().equals("S")) {
                level.getObstacles(n).setY(level.getObstacles(n).getY() + speed);
            }
            if (level.getObstacles(n).getDirection().equals("N")) {
                level.getObstacles(n).setY(level.getObstacles(n).getY() - speed);
            }
            if (level.getObstacles(n).getDirection().equals("W")) {
                level.getObstacles(n).setX(level.getObstacles(n).getX() - speed);
            }
        } else if (level.getObstacles(n).getPattern()) {
            if (level.getObstacles(n).getDirection().equals("E")) {
                level.getObstacles(n).setX(level.getObstacles(n).getX() + speed);
                     
     
            } else if (level.getObstacles(n).getDirection().equals("S")) {
                level.getObstacles(n).setY(level.getObstacles(n).getY() + speed);
                     
     
            } else if (level.getObstacles(n).getDirection().equals("N")) {
                level.getObstacles(n).setY(level.getObstacles(n).getY() - speed);
                     
            } else if (level.getObstacles(n).getDirection().equals("W")) {
                level.getObstacles(n).setX(level.getObstacles(n).getX() - speed);
                     
            }
        }
        else if(level.getObstacles(n).getLaser())
        {
        	return;
        }
     
    }
     public void fix() {
    	  double originalX= p.getX();
          double originalY=p.getY();
    	 //  p.update();
    	   double newX= p.getX();
           double newY= p.getY();
           if(p.upPressed)
           {
        	   if(p.getY()>0)
        	   p.setY(p.getY()-5);
               if(hit1())
                  p.setY(originalY);
           }
           if(p.downPressed)
           {
        	   if(p.getY()+25<800)
        	   p.setY(p.getY()+5);
               if(hit1())
            	   p.setY(originalY);
           }
            if(p.LPressed)
           {
            	if(p.getX()>0)
            	p.setX(p.getX()-5);
               if(hit1())
                  p.setX(originalX);
           }
           if(p.RPressed)
           {
        	   if(p.getX()+25<800)
        	   p.setX(p.getX()+5);
               if(hit1())
            	   p.setX(originalX);
           }
     }
    public void reset() {
        status = PLAYING;
        level = new Levels();
        p = new DodgePlayer(level.getX(), level.getY());
     
    }
    public boolean hit1()
    {
        for (int r = 0; r < level.grid.length; r++)
            for (int c = 0; c < level.grid[0].length; c++) {
                if (level.grid[r][c].equals("W")) {
                    if (getDodgePlayer().getRectangle().intersects(level.getRectangle(r, c))) {
                        return true;
                    }
                }
            }
        return false;
    }
    public String hit() {
        String k = "";
        String l = "";
        boolean check = false;
        double originalX= p.getX();
        double originalY=p.getY();
        //p.update();
        //create updateX and updateY
        double newX= p.getX();
        double newY= p.getY();
        boolean LCheck=false;
        int j=0;
        for (int r = 0; r < level.grid.length; r++)
            for (int c = 0; c < level.grid[0].length; c++) {
                if (level.grid[r][c].equals("W")) {
                    if (getDodgePlayer().getRectangle().intersects(level.getRectangle(r, c))) {
                        
                         
                     
                       /*if(!(new Rectangle((int) originalX, (int) p.getY(), 20, 20).intersects(level.getRectangle(r, c))))
                       {
                        p.setX(originalX);
                       //   p.setY(originalY);
                       } 
                       else if(!(new Rectangle((int) p.getX(), (int) originalY, 20, 20).intersects(level.getRectangle(r, c))))
                       {
                        p.setY(originalY);
                       //   p.setY(originalY);
                        if(p.LPressed)
                          {
                           p.setX(newX  );
                        } 
                       } 
                       else if(!(new Rectangle((int) originalX, (int) originalY, 20, 20).intersects(level.getRectangle(r, c))))
                       {
                            
                            p.setX(originalX);
                             p.setY(originalY);
                       }*/
                   
                       
                                    
                             
     
                    }
    
            
                        
                    for (int n = 0; n < level.getObstacles().size(); n++)
                        if (level.ObstacleRectangle(n).intersects(level.getRectangle(r, c))) {
     
                            level.getObstacles(n).setSpeed(-1 * level.getObstacles(n).getSpeed());
                            moveObstacle(n, level.getObstacles(n).getSpeed());
     
                        }
     
                }
     
            }
      
        for (int n = 0; n < level.getObstacles().size(); n++) {
            if (getDodgePlayer().getRectangle().intersects(level.ObstacleRectangle(n))) {
                lives--;
                p = new DodgePlayer(level.getX(), level.getY());
                level.load();
            }
        }
     
        return k;
    }
     
    public DodgePlayer getDodgePlayer() {
        return p;
    }
     
    public Levels getLevel() {
        return level;
    }
     
    public void win(boolean j) {
        if (j) {
            if (level.getLVL() == 1) {
                lives++;
                level.setLVL(2);
                level.update();
                p = new DodgePlayer(level.getX(), level.getY());
     
                level.load();
            }
            else if(level.getLVL()==2)
            {
                lives++;
                level.setLVL(3);
                level.update();
                p = new DodgePlayer(level.getX(), level.getY());
     
                level.load();
            }
            else if(level.getLVL()==3)
            {
                lives++;
                level.setLVL(4);
                level.update();
                p = new DodgePlayer(level.getX(), level.getY());
     
                level.load();
            }
            else if(level.getLVL()==4)
            {
                lives++;
                level.setLVL(5);
                level.update();
                p = new DodgePlayer(level.getX(), level.getY());
     
                level.load();
            }
            else if(level.getLVL()==5)
            {
            	status =WIN;
            }
        }
     
    }
    public int checkLives()
    {
        return lives;
    }
       
     
}