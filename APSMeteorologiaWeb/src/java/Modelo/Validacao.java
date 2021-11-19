/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Massanemo
 */
public class Validacao
{
    private String mensagem;
    
    public void validarTemperaturaData(String data)
    {
        this.mensagem = "";
        if (data.length() < 9 ||
                data.length() > 11) //Data
        {
            this.mensagem += "Data deve ter 10 caracteres \n";
        }
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
