class A
{
    int i,j;
    A()
    {
        i=100;
        j=200;
    }
    void display()
    {
        System.out.println("A is Display");
    }
}
class B extends A
{
    int i,k;
    B()
    {
        i=300;
        k=400;
    }
    void display()
    {
        System.out.println("B is Display");
    }
    void display(int i,int j,int k)
    {
        System.out.println(i+" "+j+" "+k);
        System.out.println(this.i+" "+this.k);
        System.out.println(super.i+" "+super.j);
        super.display();
        display();

    }
}
class InheritSuperClass
{
    public static void main(String args[])
    {
        B b=new B();
        b.display(50,60,70);
    }
}
