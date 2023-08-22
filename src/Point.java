public class Point {
    int x;
    int y;


    public Point(){
        x = 0;
        y = 0;
    }

    public Point(int x , int y){
        this.x = x;
        this.y = y;
    }

    public float distance(){
    // cal from origin
        float dis = (float) Math.sqrt((x*x)+(y*y));
        return dis;
    }

    public float distance(int x1 , int y1){
        float dis = (float) Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1));
        return dis;
    }


}
