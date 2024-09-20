
class Shape{
    int l,b;
    Shape(){
        l=-1;
        b=-1;
    }
    Shape(int x){
        l=b=x;
    }
    Shape(int x, int y){
        l=x;
        b=y;
    }
    int area(){
        return l*b;
    }
}
public class Main {

    public static void main(String[] args) {
        Shape sqr=new Shape(4);
        Shape rect=new Shape(6,8);
        int area=sqr.area();
        System.out.println("sqr"+area);
         area=rect.area();
        System.out.println("rect"+area);
    }
}