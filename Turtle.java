public class Turtle extends pen{
    private int x;      //position
    private int y;
    private int angle;   //direction
    //[0=east, 90=north, 180=west, 270=south]

    //Null constructor
    Turtle(){
        super();  //calls parent constructor
        this.x=0;
        this.y=0;
        this.angle=0;
    }

    //paramertized constructor
    public Turtle(int x, int y, int angle){
        this.x = x;
        this.y = y;
        this.angle = angle;
    }

    //Move Forward
    public void move(int distance){
        if(angle==0){      //east
           x+ = distance;
        }
        else if(angle==90){    //north
            y+ = distance;
        }
        else if(angle==180){    //west
            x- = distance;
        }
        else if(angle==270){     //south
             y- = distance;
        }
    }

       //TurnLeft
       public void TurnLeft(){
        angle= (angle+270)% 360;
       }

       //TurnRight
       public void TurnRight(){
        angle= (angle+90)% 360;
       }

       //Display
       public void display(){
        System.out.println("Position of Turtle:" +x+ "," +y );
       }
}

    

