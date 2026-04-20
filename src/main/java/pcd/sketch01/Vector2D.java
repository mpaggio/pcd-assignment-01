package pcd.sketch01;


public record Vector2D(double x, double y)  {

    public Vector2D sum(Vector2D v){
        return new Vector2D(x+v.x,y+v.y);
    }

    public double abs(){
        return (double)Math.sqrt(x*x+y*y);
    }

    public Vector2D getNormalized(){
        double module=(double)Math.sqrt(x*x+y*y);
        return new Vector2D(x/module,y/module);
    }

    public Vector2D mul(double fact){
        return new Vector2D(x*fact,y*fact);
    }

    public Vector2D getSwappedX() {
    	return new Vector2D(-x, y);
    }

    public Vector2D getSwappedY() {
    	return new Vector2D(x, -y);
    }

    public String toString(){
        return "V2d("+x+","+y+")";
    }
    
    
}
