public class Ball {
    //felid, constructer, methods
    private int size;
    private int xSpeed;
    private int ySpeed;
    private final Color color;
    private int speedx;
    private int speedy;
    private int x, y;
    private MyPanel panel;
//MyPanel panel
//public Ball(){
//    this.x = x;
//    this.y = y;
//    size = 10;
//    xSpeed = 3;
//    ySpeed = 1;
//    color = Color.BLUE;
//    this.panel = panel;
//}

    public Ball(MyPanel panel) {
        x = (int) (Math.random() * 400 +1);
        y = (int) (Math.random() * 400+1);
        size = 10;
        xSpeed = 3;
        ySpeed = 1;
        speedx = (int)(Math.random()*3+1);
        speedy = (int)(Math.random()*3+1);
        color = new Color((int)(Math.random()*250+1));
        this.panel = panel;
    }
    public void draw(Graphics g2){
        g2.setColor(color);
        g2.fillOval(x,y,size,size);

    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void xChageSpeed(){
        xSpeed = -1*xSpeed;
    }

    public int setSize() {
        size = (int)(Math.random()*35)-1;
        return size;
    }
//public Color setColor(){
//}

    public void yChangeSpeed(){
        ySpeed = -1*ySpeed;

    }
    public void move(){
        x += xSpeed;
        y+= ySpeed;
//    if(x>=size){
//        speed = speed*-1;
//    }
//    if(y < size){
//        speed = speed*-1;
//    }

    }



}


