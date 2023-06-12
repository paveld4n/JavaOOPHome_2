

public class Сalculations implements I_Oper {
    int a;
    int b;
    int s;
    int p;

    
    @Override
    public int getPerimeter() {
        p = (a + b) * 2;
        return p;
    }
    @Override
    public int getSquare() {
        s = a * b;
        return s;
    }
    

    @Override
    public void setStart(int x, int y) {
        a = x;
        b = y;
    }
    
    
}

