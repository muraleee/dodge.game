public class Obstacles <E> {
    private boolean  basic;
    private boolean  pattern;
    private boolean laser;
    private double x;
    private double y;
    private double speed=4;
    private double angle;
    private int d=1;
    private int a=d/10;
    private int b=d-a*10;
    String g;
    public Obstacles() {
        basic=false;
        pattern=false;
        laser=false;
        g="";
              
    }
      
    public double getX() {
        return x;
               
   }
   public double getY() {
               
        return y;
   }
   public void setX(double x) {
       this.x=x;
              
  }
  public void setY(double y) {
              
       this.y=y;
  }
  public boolean getBasic() {
      return basic;
  }
  public boolean getPattern() {
      return pattern;
  }
  public boolean getLaser() {
      return laser;
 }
      
  public void setBasic(boolean basic) {
      this.basic = basic;
  }
      
  public void setPattern(boolean pattern) {
      this.pattern = pattern;
  }
      
      
  public void setLaser(boolean laser) {
      this.laser = laser;
  }
 public String getDirection()
 {
     return g;
 }
        
  public void setDirection(String f){
      if(basic)
      {
          if(f.equals("N"))
              g= "N";
          else if(f.equals("W"))
              g= "W";
          else if(f.equals("E"))
              g= "E";
          else if(f.equals("S"))
              g="S";
      }
      else if(pattern)
      {
          if(f.equals("N"))
              g= "N";
          else if(f.equals("W"))
              g= "W";
          else if(f.equals("E"))
              g= "E";
          else if(f.equals("S"))
              g="S";
                 
      }
            
    return;
      
  }
  public int getD()
  {
      return d;
  }
  public void setD(int d)
  {
      this.d=d;
  }
 public double getSpeed()
 {
     return speed;
 }
 public void setSpeed(double speed) {
     this.speed = speed;
 }
       
      
          
}