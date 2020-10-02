class Employee{
  public void display(){
    System.out.println("name of class is employee");
  }
  public void calcSalary(){
    System.out.println("Salary of employee is 10000");

  }
}
class Engineer extends Employee{
  public void calcSalary(){
    System.out.println("Salary of employee is 20000");
  }
}

class Main {
  public static void main(String[] args) {
    Engineer e1=new Engineer();
    e1.display();
    e1.calcSalary();
  
     
  }
}