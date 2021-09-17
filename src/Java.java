public class Java {
    private int a;
    private int b;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    Java(int a, int b)
    {
        this.a=a;
        this.b=b;
    }

}

class Java1{
    public static void main(String[] args){
        Java obj=new Java(1,2);
        obj.setA(5);
        obj.setB(10);
        System.out.println(obj.getA());
        System.out.println(obj.getB());
    }
}
