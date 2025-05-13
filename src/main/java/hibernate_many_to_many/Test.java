package hibernate_many_to_many;

import hibernate_many_to_many.entity.Child;
import hibernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();

        Session session = null;

        try {
//            session = sessionFactory.getCurrentSession();
//
//            Section section1 = new Section("Football");
//
//            Child child1 = new Child("Zaza", 5);
//            Child child2 = new Child("Elena", 7);
//            Child child3 = new Child("Andrey", 6);
//
//            section1.addChildrenToSection(child1);
//            section1.addChildrenToSection(child2);
//            section1.addChildrenToSection(child3);
//
//            session.beginTransaction();
//
//            session.persist(section1);
//
//            session.getTransaction().commit();
//            System.out.println("done");

            //--------------------------------------------
            session = sessionFactory.getCurrentSession();

            Section section1 = new Section("Voleyball");
            Section section2 = new Section("Hockey");
            Section section3 = new Section("Chess");

            Child child1 = new Child("Igor", 4);

            child1.addSectionToChild(section1);
            child1.addSectionToChild(section2);
            child1.addSectionToChild(section3);

            session.beginTransaction();

            session.persist(child1);

            session.getTransaction().commit();
            System.out.println("done");
        } finally {
            session.close();
            sessionFactory.close();
        }
    }
}
