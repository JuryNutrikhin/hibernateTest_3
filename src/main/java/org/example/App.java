package org.example;

import org.example.model.Bookings;
import org.example.model.Tickets;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration()
                .addAnnotatedClass(Bookings.class)
                .addAnnotatedClass(Tickets.class);

        SessionFactory sessionFactory =cfg.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        try{
            session.beginTransaction();

//            Bookings bookings = session.get(Bookings.class,2);
//            System.out.println(bookings.getTotal_amount());

            Tickets tickets = session.get(Tickets.class,2);
            System.out.println(tickets.getPassenger_name());
            System.out.println( " привет");

             session.getTransaction().commit();
        }catch(Exception ex){
            session.getTransaction().rollback();
            System.out.println("ошибка произошел роллбак");

        }finally{
            sessionFactory.close();
        }

    }
}
