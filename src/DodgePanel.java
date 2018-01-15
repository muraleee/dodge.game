import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
          
import javax.swing.JPanel;
          
public class DodgePanel extends JPanel  implements KeyListener , MouseListener, Runnable{
     DodgeGame  game= new DodgeGame();
    public static final int UPS= 35;
    int i=1;
     public DodgePanel()
     {
         //create the panel
         super();
                           
         //sets the size of the panel
         setSize(800,850);
                                  
            try
            {
            //
            }
            catch(Exception e)
            {
            System.out.println("Error Loading Images: " + e.getMessage());
            e.printStackTrace();
            }
                                  
                 addKeyListener(this);
                 Thread t = new Thread(this);
                 t.start();
                    
                              
                              
                               
                              
     }
     public void paint(Graphics g)
     {
    	 
         g.setColor(Color.GRAY);
         g.fillRect(0,0, 800, 850);
          
         /*g.setColor(Color.MAGENTA);
         g.fillRect(0,0, 750, 20);
         g.setColor(Color.MAGENTA);
         g.fillRect(0,730, 750, 20);*/
         
           
            if(game.status==game.PLAYING)
            {
            	for(int n=0;n<game.getLevel().getObstacles().size() ;n++)
                {
                   g.setColor(Color.RED);
                   if(game.getLevel().getObstacles(n).getLaser()==false)
                    g.fillRect((int)(game.getLevel().getObstacleX(n)),(int)game.getLevel().getObstacleY(n), 30, 30);
                   else
                   {
                	   
                	   i++;
                	  
                	   g.fillRect((int)(game.getLevel().getObstacleX(n)),(int)game.getLevel().getObstacleY(n), 200, 15);
                	   try {
						Thread.sleep(1000l);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
                   }
                }
                       
                g.setColor(Color.CYAN);
                g.fillRect((int)game.getDodgePlayer().getX(),(int)game.getDodgePlayer().getY(), game.getDodgePlayer().HEIGHT, game.getDodgePlayer().WIDTH);
                for(int r=0;r<game.getLevel().grid.length;r++)
                    for(int c=0;c<game.getLevel().grid[0].length;c++)
                if(game.getLevel().grid[r][c].toString().equals("W"))
                {
                    g.setColor(Color.BLACK);
                    g.fillRect(r*50,c*50, 50, 50);
                             
                            
                }
                g.setColor(Color.GREEN);
                g.fillRect((int)game.getLevel().getGoalX(),(int)game.getLevel().getGoalY(), 90, 80);
                 
                g.setColor(Color.RED);
                Font font2 = new Font("Times New Roman",Font.BOLD,35);
                g.setFont(font2);
                   g.drawString(""+game.checkLives()+" Lives",0, 830);
                   g.drawString("Level: "+game.getLevel().getLVL()+"",500, 830);
            }
            else if(game.status==game.GAME_OVER)
            {
                g.setColor(Color.RED);
                Font font2 = new Font("Times New Roman",Font.BOLD,80);
                g.setFont(font2);
                   g.drawString("Game Over",200, 400);
                   g.drawString("Press N to restart",200, 500);
            }
            else if(game.status==game.WIN)
            {
            	 g.setColor(Color.BLACK);
                 g.fillRect(0,0, 800, 850);
            	 g.setColor(Color.RED);
                 Font font2 = new Font("Times New Roman",Font.BOLD,50);
                 g.setFont(font2);
                 g.drawString("YOU WIN!",200, 400);
                 g.drawString("Press N to restart",200, 500);
            }
                       
     }
     public void update() 
     {
        
         game.update();
     }
    @Override
    public void run() {
        // TODO Auto-generated method stub
         while(true)
            {
                 try
             {
                     update();
                      repaint();
                            
                            
                             
               Thread.sleep(1000/UPS);
             }
             catch(Exception e)
             {
             System.out.println("Error Loading Images: " + e.getMessage());
             e.printStackTrace();
             }
            }
    }
     public void addNotify() 
     {
          super.addNotify();
          requestFocus();
     }
    @Override
          
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
                   
           if(e.getKeyChar() == 'w')
         {
           game.getDodgePlayer().setUpPressed(true);
                         
         }
          if(e.getKeyChar() == 's')
            {
           game.getDodgePlayer().setDownPressed(true);
            }
         if(e.getKeyChar() == 'a')
         {
             //if(game.hit().equals("U"))
        game.getDodgePlayer().setLeftPressed(true);
         }
         if(e.getKeyChar() == 'd')
         {
        game.getDodgePlayer().setRightPressed(true);
         }
                    
    }
          
          
    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
           if(e.getKeyChar() == 'w')
             {
               game.getDodgePlayer().setUpPressed(false);
                             
             }
              if(e.getKeyChar() == 's')
                {
               game.getDodgePlayer().setDownPressed(false);
                }
             if(e.getKeyChar() == 'a')
             {
            game.getDodgePlayer().setLeftPressed(false);
             }
             if(e.getKeyChar() == 'd')
             {
            game.getDodgePlayer().setRightPressed(false);
             }
                     
    }
          
    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
    	 if(e.getKeyChar() == 'n')
         {
    		 game= new DodgeGame();
         }
    }
    @Override
    public void mouseClicked(MouseEvent arg0) {
        // TODO Auto-generated method stub
                  
    }
    @Override
    public void mouseEntered(MouseEvent arg0) {
        // TODO Auto-generated method stub
                  
    }
    @Override
    public void mouseExited(MouseEvent arg0) {
        // TODO Auto-generated method stub
                  
    }
    @Override
    public void mousePressed(MouseEvent arg0) {
        // TODO Auto-generated method stub
                  
    }
    @Override
    public void mouseReleased(MouseEvent arg0) {
        // TODO Auto-generated method stub
                  
    }
          
}