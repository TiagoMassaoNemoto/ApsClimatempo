
package ManagedBeans;

import Modelo.Controle;
import Modelo.Temperatura;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@ManagedBean
@RequestScoped
public class bgrPesquisar
{
    private String id;
    private String temperatura;
    private String umidade;
    private String precipitacao;
    private String data;
    private String hora;
    private List<Temperatura> listaTemperatura;
    private String mensagem;
    
    
    public String pesquisarPorData()
    {
        Controle controle = new Controle();
        listaTemperatura = controle.pesquisarTemperaturaPorData(this.data);
        this.mensagem = controle.getMensagem();
        if (listaTemperatura == null || listaTemperatura.isEmpty())
        {
            this.mensagem = "Não existe resposta para esta pesquisa";
            return "/Paginas/respostaPesquisaPorData.xhtml";
        }
        if (listaTemperatura.size() == 1)
        {
            this.id = listaTemperatura.get(0).getIdTemp().toString();
            this.temperatura = listaTemperatura.get(0).getTemperatura();
            this.umidade = listaTemperatura.get(0).getUmidadade();
            this.precipitacao = listaTemperatura.get(0).getPrecipitacao();
            this.data = listaTemperatura.get(0).getDia();
            this.hora = listaTemperatura.get(0).getHorario();
            return null;
        }
        if (listaTemperatura.size() > 1)
        {
            return "/Paginas/respostaPesquisaPorData.xhtml";
        }
        return null;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getTemperatura()
    {
        return temperatura;
    }

    public void setTemperatura(String temperatura)
    {
        this.temperatura = temperatura;
    }

    public String getUmidade()
    {
        return umidade;
    }

    public void setUmidade(String umidade)
    {
        this.umidade = umidade;
    }

    public String getPrecipitacao()
    {
        return precipitacao;
    }

    public void setPrecipitacao(String precipitacao)
    {
        this.precipitacao = precipitacao;
    }

    public List<Temperatura> getListaTemperatura()
    {
        return listaTemperatura;
    }

    public void setListaTemperatura(List<Temperatura> listaTemperatura)
    {
        this.listaTemperatura = listaTemperatura;
    }

    public String getData()
    {
        return data;
    }

    public void setData(String data)
    {
        this.data = data;
    }

    public String getHora()
    {
        return hora;
    }

    public void setHora(String hora)
    {
        this.hora = hora;
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
        