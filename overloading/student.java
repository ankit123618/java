class ankit
{
    ankit()
    {
        System.out.println("hello");
    }
}
class sharma
{
     public static void sh()
    {
        System.out.println("hello ankit");
    }
}
class studen extends sharma
{
    studen()
    {
        super.sh();
    }
}
class student
{
    public static void main(String[] args) {
        studen s=new studen();
    }
}
