package Java101;

public class maasHesaplayici {

    static class Employee {
        String name;
        int salary;
        int workHours;
        int hireYear;

        Employee(String name,int salary,int workHours,int hireYear)
        {
            this.name=name;
            this.salary=salary;
            this.workHours=workHours;
            this.hireYear=hireYear;
        }

        int tax=0,bonus=0,salaryRaising=0;

        public int taxCalculator(){
            if(salary > 1000)
            {
                tax = (salary * 3 / 100);
            }
            return tax;
        }

        public int bonusCalculator(){
            if(workHours > 40)
            {
                bonus = (workHours - 40) * 30 ;
            }
            return bonus;
        }

        public int raiseSalary(){
            if(hireYear < 10){
                salaryRaising = (salary * 5 / 100);
            }
            else if(hireYear >= 10 && hireYear < 20){
                salaryRaising = (salary * 10 / 100);
            }
            else if(hireYear >= 20 ){
                salaryRaising = (salary * 15 / 100);
            }
            return salaryRaising;
        }

        void print(){
            System.out.println("Name : "+ name);
            System.out.println("Salary : "+ salary);
            System.out.println("Work Hour : "+ workHours);
            System.out.println("Hire Year : "+ hireYear);
            System.out.println("Tax : "+ taxCalculator());
            System.out.println("Bonus : "+ bonusCalculator());
            System.out.println("Salary Raising : "+ raiseSalary());
            System.out.println("Salary with Tax and Bonus : "+ (salary + bonusCalculator() - taxCalculator()));
            System.out.println("Total Salary : "+ (bonusCalculator() + raiseSalary() + salary - taxCalculator()));
        }
    }

    public static void main(String[] args){

        Employee e1 = new Employee("Resul",15000,50,2022);
        e1.print();

    }

}
