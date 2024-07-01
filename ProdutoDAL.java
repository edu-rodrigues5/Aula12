/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Produtos;
import java.sql.*;

/**
 *
 * @author unisanta
 */
public class ProdutoDAL {

    private static Connection con;
    private static ResultSet rsnav;

   public static void conecta(String _bd)
    {
    try {
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        con = DriverManager.getConnection("jdbc:ucanaccess://" + _bd);
       }
    catch (Exception e) {
      Erro.setErro(e.getMessage());
      }
    }

    public static void desconecta()
    {
        Erro.setErro(false);
        try 
        {
            con.close();
        }
        catch (Exception e)
        {
            Erro.setErro(e.getMessage());
        }
    }

    
    public static void geraRS()
    {
        Erro.setErro(false);
        try
        {
            //DICA: por default o ResultSet é forward only
            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rsnav = st.executeQuery("SELECT * FROM TabProdutos");
        }
        catch(Exception e){Erro.setErro(e.getMessage()); return;}
    }
    
public static void getProdutos(int op)
{
    boolean flag = false;

    Erro.setErro(false);
    try {
        switch (op)
        {
            case 2 : flag = rsnav.first(); break;
            case 3 : flag = rsnav.previous(); break;
            case 4 : flag = rsnav.next(); break;
            case 5 : flag = rsnav.last(); break;    
        }
        if (flag)
          {
          Produtos.setCodigo(rsnav.getString("codigo"));
          Produtos.setDescricao(rsnav.getString("descricao"));
          Produtos.setFornecedor(rsnav.getString("fornecedor"));
          Produtos.setQtdestoque(rsnav.getString("qtdestoque"));
          Produtos.setValorunitario(rsnav.getString("valorunitario"));
          }
        else
          {Erro.setErro("Impossivel");}
        }
        catch(Exception e){Erro.setErro(e.getMessage());}
}
}