/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import DAL.UTPDAO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Massanemo
 */
public class Controle
{
    private String mensagem;
    
    public List<Temperatura> pesquisarTemperaturaPorData(String data)
    {
        this.mensagem = "";
        Validacao validacao = new Validacao();
        validacao.validarTemperaturaData(data);
        Temperatura temperatura = new Temperatura();
        List<Temperatura> listaTemperatura = new ArrayList<>();
        if (validacao.getMensagem().equals(""))
        {
            temperatura.setData(data);
            UTPDAO utpDAO = new UTPDAO();
            listaTemperatura = utpDAO.pesquisarTemperaturaPorData(temperatura);
            this.mensagem = utpDAO.getMensagem();
        }
        else
        {
            this.mensagem = validacao.getMensagem();
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
