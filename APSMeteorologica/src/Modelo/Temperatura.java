/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Massanemo
 */
@Entity
@Table(name = "temperatura")
@XmlRootElement
@NamedQueries(
{
    @NamedQuery(name = "Temperatura.findAll", query = "SELECT t FROM Temperatura t")
    , @NamedQuery(name = "Temperatura.findByIdTemp", query = "SELECT t FROM Temperatura t WHERE t.idTemp = :idTemp")
    , @NamedQuery(name = "Temperatura.findByTemperatura", query = "SELECT t FROM Temperatura t WHERE t.temperatura = :temperatura")
    , @NamedQuery(name = "Temperatura.findByUmidadade", query = "SELECT t FROM Temperatura t WHERE t.umidadade = :umidadade")
    , @NamedQuery(name = "Temperatura.findByPrecipitacao", query = "SELECT t FROM Temperatura t WHERE t.precipitacao = :precipitacao")
    , @NamedQuery(name = "Temperatura.findByDia", query = "SELECT t FROM Temperatura t WHERE t.dia = :dia")
    , @NamedQuery(name = "Temperatura.findByHorario", query = "SELECT t FROM Temperatura t WHERE t.horario = :horario")
})
public class Temperatura implements Serializable
{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idTemp")
    private Integer idTemp;
    @Column(name = "temperatura")
    private String temperatura;
    @Column(name = "umidadade")
    private String umidadade;
    @Column(name = "precipitacao")
    private String precipitacao;
    @Column(name = "dia")
    private String dia;
    @Column(name = "horario")
    private String horario;

    public Temperatura()
    {
    }

    public Temperatura(Integer idTemp)
    {
        this.idTemp = idTemp;
    }

    public Integer getIdTemp()
    {
        return idTemp;
    }

    public void setIdTemp(Integer idTemp)
    {
        this.idTemp = idTemp;
    }

    public String getTemperatura()
    {
        return temperatura;
    }

    public void setTemperatura(String temperatura)
    {
        this.temperatura = temperatura;
    }

    public String getUmidadade()
    {
        return umidadade;
    }

    public void setUmidadade(String umidadade)
    {
        this.umidadade = umidadade;
    }

    public String getPrecipitacao()
    {
        return precipitacao;
    }

    public void setPrecipitacao(String precipitacao)
    {
        this.precipitacao = precipitacao;
    }

    public String getDia()
    {
        return dia;
    }

    public void setDia(String dia)
    {
        this.dia = dia;
    }

    public String getHorario()
    {
        return horario;
    }

    public void setHorario(String horario)
    {
        this.horario = horario;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (idTemp != null ? idTemp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Temperatura))
        {
            return false;
        }
        Temperatura other = (Temperatura) object;
        if ((this.idTemp == null && other.idTemp != null) || (this.idTemp != null && !this.idTemp.equals(other.idTemp)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "Modelo.Temperatura[ idTemp=" + idTemp + " ]";
    }
    
}
