import java.awt.Rectangle;
import java.util.ArrayList;
       
public class Levels<E> {
    private int LVL;
    private double x;
    private double y;
    public String grid[][] = new String[16][16];
    private double GoalX;
    private double GoalY;
    private ArrayList<Obstacles<E>> obstacles;
    private int j = 0;
       
    public Levels() {
        LVL = 1;
       
        GoalX = 660;
        GoalY = 50;
        obstacles = new ArrayList<>();
        load();
    }
       
    public void update() {
        j++;
        if (LVL == 1) {
            x = 10;
            y = 770;
            for (int r = 0; r < grid.length; r++)
                for (int c = 0; c < grid[0].length; c++) {
                    if (c == 0) {
                        grid[r][c] = "W";
                    } else if (r == 5 && c != 10 && c != 11 && c != 12 && c != 4) {
                        grid[r][c] = "W";
                    } else if (c == 5 && r != 1 && r != 8) {
                        grid[r][c] = "W";
                    } else if (r == 0 && c < 15) {
                        grid[r][c] = "W";
                    } else if (r == 15) {
                        grid[r][c] = "W";
                    } else if (c == 15 && r > 5) {
                        grid[r][c] = "W";
                    } else if (r == 12 && c < 4) {
                        grid[r][c] = "W";
                    } else {
                        grid[r][c] = "O";
                    }
                }
             
            /*
             * obstacles.add(new Obstacles()); obstacles.get(2).setBasic(true);
             * obstacles.get(2).setX(150); obstacles.get(2).setY(580); obstacles.add(new
             * Obstacles()); obstacles.get(3).setBasic(true); obstacles.get(3).setX(150);
             * obstacles.get(3).setY(580);
             */
        } else if (LVL == 2) {
            x = 60;
            y = 10;
            GoalX = 660;
            GoalY = 665;
            for (int r = 0; r < grid.length; r++)
                for (int c = 0; c < grid[0].length; c++) {
                	 grid[r][c] = "O";
                }
            for (int r = 0; r < grid.length; r++)
                for (int c = 0; c < grid[0].length; c++) {
                    if (c == 15) {
                        grid[r][c] = "W";
                    } 
                    else if (c==5 && r > 3 && r!=8 && r!=13) {
                        grid[r][c] = "W";
                    } 
                    else if(r==12 && c!=4)
                    {
                        grid[r][c] = "W";
                    }
                    else if(r==4 && c<12)
                    {
                        grid[r][c] = "W";
                    }
                    else if(r==0)
                    {
                        grid[r][c] = "W";
                    }
                    else if(r==15)
                    {
                        grid[r][c] = "W";
                    }
                    else if(r>2&&c==0)
                    {
                        grid[r][c] = "W";
                    }
                   else {
                        grid[r][c] = "O";
                    }
                       
                }
        } 
        else if (LVL == 3)
        {
            // System.out.println(obstacles.get(1).getY());
        	  x = 750;
              y = 420;
              GoalX = 50;
              GoalY = 50;
            for (int r = 0; r < grid.length; r++)
                for (int c = 0; c < grid[0].length; c++) {
                    if (c == 15) {
                        grid[r][c] = "W";
                    } 
                     
                    else if(r==12 && c!=4)
                    {
                        grid[r][c] = "W";
                    }
                    else if(r==6 && c<12)
                    {
                        grid[r][c] = "W";
                    }
                    else if(r==0)
                    {
                        grid[r][c] = "W";
                    }
                    else if(r==15&& (c<6||c>9))
                    {
                        grid[r][c] = "W";
                    }
                    else if((c==5) && (r==9 || r==10 || r==11 || r==12))
                    {
                        grid[r][c] = "W";
                    }
                    else if((c==9) && (r==4||r==5||r==6 || r==7 || r==8||r==9))
                    {
                        grid[r][c] = "W";
                    }
                    else if((c==14) && (r==1 || r==2))
                    {
                        grid[r][c] = "W";
                    }
                    else if((c==4) && (r==4||r==5||r==6))
                    {
                        grid[r][c] = "W";
                    }
                    else if(c==0)
                    {
                        grid[r][c] = "W";
                    }
                   else {
                        grid[r][c] = "O";
                    }
                       
                }
             
            if(obstacles.get(1).getX()==110 && obstacles.get(1).getY()==666 && obstacles.get(1).getDirection().equals("S"))
            {
                obstacles.get(1).setDirection("E");
            }
          
            if(obstacles.get(1).getX()==474 && obstacles.get(1).getY()==666 && obstacles.get(1).getDirection().equals("E"))
            {
               obstacles.get(1).setDirection("W");
            }
            //System.out.println(obstacles.get(1).getX());
            if(obstacles.get(1).getX()==110 && obstacles.get(1).getY()==666 && obstacles.get(1).getDirection().equals("W"))
            {
               obstacles.get(1).setDirection("N");
            }
            if(obstacles.get(1).getX()==110 && obstacles.get(1).getY()==210 && obstacles.get(1).getDirection().equals("N"))
            {
               obstacles.get(1).setDirection("S");
            }
            //588
            if(obstacles.get(9).getX()==540 && obstacles.get(9).getY()==632 && obstacles.get(9).getDirection().equals("S"))
            {
               obstacles.get(9).setDirection("W");
            }
           // System.out.println(obstacles.get(9).getX());
            if(obstacles.get(9).getX()==352 && obstacles.get(9).getY()==632 && obstacles.get(9).getDirection().equals("W"))
            {
                obstacles.get(9).setDirection("E");
            }
            if(obstacles.get(9).getX()==540 && obstacles.get(9).getY()==632 && obstacles.get(9).getDirection().equals("E"))
            {
               obstacles.get(9).setDirection("N");
            }
            System.out.println(obstacles.get(9).getY());
            if(obstacles.get(9).getX()==540 && obstacles.get(9).getY()==372 && obstacles.get(9).getDirection().equals("N"))
            {
               obstacles.get(9).setDirection("S");
            }
            
            
          
            
        }
        else if (LVL == 4) 
        {
        	  x = 300;
              y = 5;
              GoalX = 50;
              GoalY = 650;
        	 for (int r = 0; r < grid.length; r++)
                 for (int c = 0; c < grid[0].length; c++) {
                     if (c == 15) {
                         grid[r][c] = "W";
                     } 
                      
                     else if(r==0)
                     {
                    	 grid[r][c] = "W";
                     }
                     
                     else if(r==15)
                     {
                    	 grid[r][c] = "W";
                     }
                     else if(c==0 && (r<5 || r>7))
                     {
                         grid[r][c] = "W";
                     }
                     else if(c==4 && (r>0 && r<12))
                     {
                         grid[r][c] = "W";
                     }
                     else if(c==8 && (r>4 && r<15))
                     {
                         grid[r][c] = "W";
                     }
                     else if(c==12 && (r>0 && r<12))
                     {
                         grid[r][c] = "W";
                     }
                    else {
                         grid[r][c] = "O";
                     }
                        
                 }
        } 
        else if (LVL == 5) 
        {
        	x = 600;
            y = 605;
        	 for (int r = 0; r < grid.length; r++)
                 for (int c = 0; c < grid[0].length; c++) {
                     if (c == 15) {
                         grid[r][c] = "W";
                     } 
                      
                     else if(r==0)
                     {
                    	 grid[r][c] = "W";
                     }
                     
                     else if(r==15)
                     {
                    	 grid[r][c] = "W";
                     }
                     else if(c==0 && (r<5 || r>7))
                     {
                         grid[r][c] = "W";
                     }
                     else if(c==4 && (r>0 && r<12))
                     {
                         grid[r][c] = "W";
                     }
                    else {
                         grid[r][c] = "O";
                     }
                        
                 }
        }
       
    }
       
    public void load() {
        if (LVL == 1) {
            obstacles.add(new Obstacles());
            obstacles.get(0).setBasic(true);
            obstacles.get(0).setX(120);
            obstacles.get(0).setY(300);
            obstacles.get(0).setDirection("E");
            obstacles.add(new Obstacles());
            obstacles.get(1).setBasic(true);
            obstacles.get(1).setX(500);
            obstacles.get(1).setY(480);
            obstacles.get(1).setDirection("S");
           obstacles.add(new Obstacles());
            obstacles.get(2).setBasic(true);
            obstacles.get(2).setX(150);
            obstacles.get(2).setY(450);
            obstacles.get(2).setDirection("E");
            obstacles.add(new Obstacles());
            obstacles.get(3).setBasic(true);
            obstacles.get(3).setX(100);
            obstacles.get(3).setY(210);
            obstacles.get(3).setDirection("N");
            obstacles.add(new Obstacles());
            obstacles.get(4).setBasic(true);
            obstacles.get(4).setX(350);
            obstacles.get(4).setY(100);
            obstacles.get(4).setDirection("S");
            obstacles.add(new Obstacles());
            obstacles.get(5).setBasic(true);
            obstacles.get(5).setX(500);
            obstacles.get(5).setY(100);
            obstacles.get(5).setDirection("S");
        }
        else if (LVL == 2) {
            obstacles.get(0).setBasic(true);
            obstacles.get(0).setX(150);
            obstacles.get(0).setY(580);
            obstacles.get(0).setDirection("E");
            obstacles.get(2).setBasic(true);
            obstacles.get(2).setX(100);
            obstacles.get(2).setY(450);
            obstacles.get(2).setDirection("E");
            obstacles.get(3).setX(110);
            obstacles.get(3).setY(210);
            obstacles.get(3).setDirection("E");
            obstacles.get(4).setBasic(true);
            obstacles.get(4).setX(320);
            obstacles.get(4).setY(100);
            obstacles.get(4).setDirection("S");
            obstacles.add(new Obstacles());
            obstacles.get(6).setBasic(true);
            obstacles.get(6).setX(55);
            obstacles.get(6).setY(120);
            obstacles.get(6).setDirection("E");
            obstacles.add(new Obstacles());
            obstacles.get(7).setBasic(true);
            obstacles.get(7).setX(405);
            obstacles.get(7).setY(350);
            obstacles.get(7).setDirection("S");
                  
        }
        else if(LVL==3)
        {
            obstacles.get(0).setBasic(true);
            obstacles.get(0).setX(200);
            obstacles.get(0).setY(260);
            obstacles.get(0).setDirection("N");
            obstacles.get(1).setPattern(true);
            obstacles.get(1).setX(110);
            obstacles.get(1).setY(210);
            obstacles.get(1).setDirection("S");
                 
            obstacles.get(2).setBasic(true);
            obstacles.get(2).setX(110);
            obstacles.get(2).setY(170);
            obstacles.get(2).setDirection("E");
                  
            obstacles.get(3).setBasic(true);
            obstacles.get(3).setX(700);
            obstacles.get(3).setY(120);
            obstacles.get(3).setDirection("S");
                  
            obstacles.get(4).setBasic(true);
            obstacles.get(4).setX(255);
            obstacles.get(4).setY(700);
            obstacles.get(4).setDirection("E");
            
            obstacles.get(5).setBasic(true);
            obstacles.get(5).setX(445);
            obstacles.get(5).setY(100);
            obstacles.get(5).setDirection("S");
            
            obstacles.get(6).setBasic(true);
            obstacles.get(6).setX(550);
            obstacles.get(6).setY(120);
            obstacles.get(6).setDirection("S");
            
            obstacles.get(7).setBasic(true);
            obstacles.get(7).setX(350);
            obstacles.get(7).setY(340);
            obstacles.get(7).setDirection("S");
           
             obstacles.add(new Obstacles());
              obstacles.get(8).setBasic(true);
            obstacles.get(8).setX(445);
            obstacles.get(8).setY(300);
            obstacles.get(8).setDirection("S");
            
              obstacles.add(new Obstacles());
               obstacles.get(9).setPattern(true);
            obstacles.get(9).setX(540);
            obstacles.get(9).setY(300);
            obstacles.get(9).setDirection("S");
              
        }
        else if(LVL==4)
        {
        
        	 obstacles.get(0).setBasic(true);
            obstacles.get(0).setX(80);
            obstacles.get(0).setY(110);
            obstacles.get(0).setDirection("E");
            
            obstacles.get(1).setPattern(true);
            obstacles.get(1).setX(110);
            obstacles.get(1).setY(210);
            obstacles.get(1).setDirection("S");
               
            obstacles.get(2).setBasic(false);
            obstacles.get(2).setLaser(true);
            obstacles.get(2).setX(51);
            obstacles.get(2).setY(410);
            obstacles.get(2).setDirection("H");
                  /*
            obstacles.get(3).setBasic(true);
            obstacles.get(3).setX(700);
            obstacles.get(3).setY(120);
            obstacles.get(3).setDirection("S");
                  
            obstacles.get(4).setBasic(true);
            obstacles.get(4).setX(255);
            obstacles.get(4).setY(700);
            obstacles.get(4).setDirection("E");
            
            obstacles.get(5).setBasic(true);
            obstacles.get(5).setX(445);
            obstacles.get(5).setY(100);
            obstacles.get(5).setDirection("S");
            
            obstacles.get(6).setBasic(true);
            obstacles.get(6).setX(550);
            obstacles.get(6).setY(120);
            obstacles.get(6).setDirection("S");
            
            obstacles.get(7).setBasic(true);
            obstacles.get(7).setX(350);
            obstacles.get(7).setY(340);
            obstacles.get(7).setDirection("S");
           
             obstacles.add(new Obstacles());
              obstacles.get(8).setBasic(true);
            obstacles.get(8).setX(445);
            obstacles.get(8).setY(300);
            obstacles.get(8).setDirection("S");
            
              obstacles.add(new Obstacles());
               obstacles.get(9).setPattern(true);
            obstacles.get(9).setX(540);
            obstacles.get(9).setY(300);
            obstacles.get(9).setDirection("S");
        	 */
        }
              
    }
       
    public double getX() {
        return x;
    }
       
    public int getLVL() {
        return LVL;
    }
       
    public void setLVL(int LVL) {
        this.LVL = LVL;
    }
       
    public double getY() {
        return y;
    }
       
    public double getGoalX() {
        return GoalX;
    }
       
    public double getGoalY() {
        return GoalY;
    }
       
    public void setX(double x) {
        this.x = x;
    }
       
    public void setY(double y) {
        this.y = y;
    }
       
    public void setGoalX(double x) {
        this.GoalX = GoalX;
    }
       
    public void setGoalY(double y) {
        this.GoalY = GoalY;
    }
       
    public Rectangle getRectangle(int r, int c) {
        return new Rectangle(r * 50, c * 50, 50, 50);
    }
       
    public ArrayList<Obstacles<E>> getObstacles() {
        return obstacles;
    }
       
    public Obstacles<E> getObstacles(int n) {
        return obstacles.get(n);
    }
       
    public double getObstacleX(int x) {
        if (getObstacles().size() > 2)
            return obstacles.get(x).getX();
        return 2;
    }
       
    public double getObstacleY(int x) {
        if (getObstacles().size() > 2)
            return obstacles.get(x).getY();
        return 2;
    }
       
    public void setObstacleX(int x, double j) {
        if (getObstacles().size() > 2)
            obstacles.get(x).setX(j);
        return;
    }
       
    public Rectangle ObstacleRectangle(int x) { // laser has a different-sized rectangle
    	if(obstacles.get(x).getLaser()==false)
        return new Rectangle((int) getObstacleX(x), (int) getObstacleY(x), 30, 30);
    	else if(obstacles.get(x).getLaser()) 
    	{
    		return new Rectangle((int) getObstacleX(x), (int) getObstacleY(x), 200, 15);
    	}
		return null;
    	
    }
    
       
    public Rectangle GoalRectangle() {
        return new Rectangle((int) getGoalX(), (int) getGoalY(), 90, 80);
    }
       
}