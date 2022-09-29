package ThreadCreation;

class Sum 
{
    public int sum(int x, int y) 
    { 
        return (x + y); 
    } 
    public int sum(int x, int y, int z) 
    { 
        return (x + y + z); 
    } 
    public double sum(double x, double y) 
    { 
        return (x + y); 
    } 
    public static void main(String args[]) 
    { 
        Sum s = new Sum(); 
        System.out.println(s.sum(30, 40)); 
        System.out.println(s.sum(50, 60, 70)); 
        System.out.println(s.sum(10.5, 20.5)); 
    } 
}
