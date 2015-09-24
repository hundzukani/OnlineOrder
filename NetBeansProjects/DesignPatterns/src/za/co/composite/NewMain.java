package za.co.composite;

/**
 *
 * @author hmanganyi
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Employee ceo = new Employee("Hundzukani", "CEO", 1000000000);

        Employee headSales = new Employee("Lyn", "Head Sales", 900000);

        Employee headMarketing = new Employee("Vutomi", "Head Marketing", 10000000);

        Employee clerk1 = new Employee("Bob", "Marketing", 10000);
        Employee clerk2 = new Employee("Laura", "Marketing", 10000);

        Employee salesExecutive1 = new Employee("Richard", "Sales", 10000);
        Employee salesExecutive2 = new Employee("Rob", "Sales", 10000);

        ceo.add(headMarketing);
        ceo.add(headSales);
        
        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);
        
        headMarketing.add(clerk1);
        headMarketing.add(clerk2);
        
        
        System.out.println(ceo);
        
        for(Employee headEmployee : ceo.getEmployees()) {
            System.out.println(headEmployee);
            for(Employee employee : headEmployee.getEmployees()) {
                System.out.println(employee);
            }
        }

    }

}
