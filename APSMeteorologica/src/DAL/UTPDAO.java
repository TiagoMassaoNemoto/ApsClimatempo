/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Modelo.Temperatura;
import org.hibernate.Session;

/**
 *
 * @author Massanemo
 */
public class UTPDAO
{
    
    Session session = HibernateUtil.getSessionFactory().openSession();
    
    
    public void enviardados(Temperatura temperatura)
    {
        session.beginTransaction();
            session.save(temperatura);
            session.getTransaction().commit();
            session.close();
    }
}
