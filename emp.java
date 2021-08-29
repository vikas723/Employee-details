class Employee{
    String name1;
    int yearofjoining1;
    String Address1;
    
    String  name2;
    int yearofjoining2;
    String Address2;
    
    String name3;
    int yearofjoining3;
    String Address3;
    

    
    void details()
    {
        name1          = "Robert";
        yearofjoining1 = 1994;
        Address1       = "64-C WallsStreet";
        
        name2          = "Sam";
        yearofjoining2 = 2000;
        Address2       = "68-D WallsStreet";
        
        name3          = "John";
        yearofjoining3 = 1999;
        Address3       = "26-B WallsStreet ";
        
    }
    
    void display()
    {
        System.out.print("Name");
        System.out.print("\t\tyearofjoining");
        System.out.print("\tAddress");
        System.out.println("\n"+name1+"\t\t"+yearofjoining1+"\t\t\t"+Address1);
        System.out.println("\n"+name2+"\t\t\t"+yearofjoining2+"\t\t\t"+Address2);
        System.out.println("\n"+name3+"\t\t"+yearofjoining3+"\t\t\t"+Address3);
    }
};
public class emp{
    public static void main(String args[]){
        Employee e = new Employee();
        e.details();
        e.display();
    }
}

    
