package hibernate_one_to_many_bi;

import hibernate_one_to_many_bi.entity.Department;
import hibernate_one_to_many_bi.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = null;

        try {
//            session = factory.getCurrentSession();
//
//            Department department = new Department("Sales", 800, 1500);
//            Employee emp1 = new Employee("Zaza", "Traba", 800);
//            Employee emp2 = new Employee("Elena", "Zavalova", 200);
//            Employee emp3 = new Employee("Anton", "Sidorov", 300);
//
//            department.addEmployeeToDepartment(emp1);
//            department.addEmployeeToDepartment(emp2);
//            department.addEmployeeToDepartment(emp3);
//
//            session.beginTransaction();
//            session.persist(department);
//
//            session.getTransaction().commit();
//--------------------------------------------
            session = factory.getCurrentSession();

            session.beginTransaction();
            System.out.println("get department");
            Department department1 = session.get(Department.class, 3);

            System.out.println("show department");
            System.out.println(department1);

            System.out.println("show employee of dep");
            System.out.println(department1.getEmployees());

            session.getTransaction().commit();
            System.out.println("Done");
        } finally {
            session.close();
            factory.close();
        }
    }
}
