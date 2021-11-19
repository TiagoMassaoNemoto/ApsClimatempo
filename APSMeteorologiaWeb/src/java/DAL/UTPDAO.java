/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Modelo.Temperatura;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Massanemo
 */
public class UTPDAO
{
    private String mensagem;
    
    Session session = HibernateUtil.getSessionFactory().openSession();
    
    public List<Temperatura> pesquisarTemperaturaPorData(Temperatura temperatura)
    {
        this.mensagem = "";
        List<Temperatura> listaTemperatura = new ArrayList<>();
        try
        {
            Query q = session.createQuery("from temperatura t where t.dia like :data");
            q.setParameter("data", temperatura.getData()+ "%");
            listaTemperatura = (List<Temperatura>) q.list();
        }
        catch (Exception e)
        {
            this.mensagem = "Erro de leitura no BD";
        }
        return listaTemperatura;
    }

    public String getMensagem()
    {
        return mensagem;
    }

    public void setMensagem(String mensagem)
    {
        this.mensagem = mensagem;
    }
    
    
}
