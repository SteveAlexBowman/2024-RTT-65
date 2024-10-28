package controller;

import org.perscholas.stevealexbowman.model.Department;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.perscholas.stevealexbowman.model.User;


public class DepartmentController {
    public static void main(String[] args) {
        // Build from our configuration file:
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();

        //Call the addDepartment method:
        addDepartment(factory,session);

        //findDepartment(factory,session,2);

        //updateDepartment(session,3);

        //deleteDepartment(session,4);

        factory.close();
        session.close();
    }
    public static void addDepartment(SessionFactory factory, Session session) {


        Transaction transaction = session.beginTransaction();
        Department department = new Department();
        department.setName("Computer Science");
        department.setState("Georgia");

        //save to the database
        session.persist(department);

        transaction.commit();
        System.out.println("successfully saved");
        factory.close();
        session.close();
    }
   /* public static void updateDepartment(Session session, int dId) {
        // Todo comment out findUser method and uncomment updateUser method

        Transaction tx = session.beginTransaction();
        Department d = new Department();
        d.setdId();
        d.setName("");
        d.setState("");
        session.merge(d);
        session.getTransaction().commit();
        session.close();
    } */
    /* public static void findDepartment(SessionFactory factory, Session session, int dId){
//       Todo comment out addUser method and uncomment findUser method

        Transaction tx = session.beginTransaction();

        Department d = session.get(User.class, dId);
        System.out.println("FullName: " + u.getFullName());
        System.out.println("Email: " + u.getEmail());
        System.out.println("password: " + u.getPassword());

        //Close resources
        tx.commit();
        factory.close();
        session.close();
    } */

}
