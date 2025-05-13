package hibernate_one_to_one;

import hibernate_one_to_one.entity.Detail;
import hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = null;

        try {

            session = factory.getCurrentSession();

            Employee employee = new Employee("Nekoglay", "Fedorov", "HR", 444);
            Detail detail = new Detail("London", "234235", "neko@gmail.com");
            detail.setEmployee(employee);
            employee.setEmpDetail(detail);

            session.beginTransaction();

            Detail detail1 = session.get(Detail.class, 1);
            System.out.println(detail1.getEmployee());

            session.persist(detail);

            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
    }
}
