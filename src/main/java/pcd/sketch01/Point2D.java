package pcd.sketch01;

public record Point2D(double x, double y)  {

    public Point2D sum(Vector2D v){
        return new Point2D(x+v.x(),y+v.y());
    }

    public Vector2D sub(Point2D v){
        return new Vector2D(x-v.x(),y-v.y());
    }
    
    public String toString(){
        return "P2d("+x+","+y+")";
    }

    public double x() {
    	return x;
    }

    public double y() {
    	return y;
    }
}

