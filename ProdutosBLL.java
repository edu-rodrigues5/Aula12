package Produtos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class ProdutosBLL {
    
    public static void conecta(String _bd)
    {
        ProdutoDAL.conecta(_bd);
    }
    
    public static void desconecta()
    {
        ProdutoDAL.desconecta();
    }
    
    public static void geraRS()
    {
    ProdutoDAL.geraRS();
    }
    
    public static void getProduto(int op)
    {
        ProdutoDAL.getProdutos(op);
    }
    
 /*essa atividade não se usa os erros   
    public static void validaCodigo(char _op)
    {
        ErroCdprodutos.setErro(false);
        if(Produtos.getCodigo().equals(""))
        {
            ErroCdprodutos.setErro("O CODIGO está vazio");
        }
        
        switch(_op)
        {
        
            case 'c': ProdutoDAL.consultaProduto(); break;
            case 'd': ProdutoDAL.deletaProduto(); break;
        }
    }
    
    
    public static void validaDados(char _op)
{
 ErroCdprodutos.setErro(false);
 
 if (Produtos.getCodigo().equals(""))
   {ErroCdprodutos.setErro("O campo CÓDIGO é de preenchimento obrigatório..."); return;}
 if (Produtos.getDescricao().equals(""))
   {ErroCdprodutos.setErro("O campo DESCRIÇÃO é de preenchimento obrigatório..."); return;}
 if (Produtos.getFornecedor().equals(""))
   {ErroCdprodutos.setErro("O campo FORNECEDOR é de preenchimento obrigatório..."); return;}
 if (Produtos.getQtdestoque().equals(""))
   {ErroCdprodutos.setErro("O campo QUANTIDADE ESTOQUE é de preenchimento obrigatório..."); return;}
 if (Produtos.getValorunitario().equals(""))
   {ErroCdprodutos.setErro("O campo VALOR UNITÁRIO é de preenchimento obrigatório..."); return;}
 else
    //codigo verifição 
    try
    {
        Integer.parseInt(Produtos.getCodigo());
    }
    catch (Exception e)
    {
      ErroCdprodutos.setErro("O campo CÓDIGO deve ser numerico!");return;
    }
 
    if(Produtos.getCodigo().equals("0"))
    {
        ErroCdprodutos.setErro("O campo CÓDIGO tem que ser maior que zero");return;
    }
    
    
    //quantidade estoque verificação
 
    try
    {
        Integer.parseInt(Produtos.getQtdestoque());
    }
    catch (Exception e)
    {
      ErroCdprodutos.setErro("O campo QUANTIDADE ESTOQUE deve ser numerico!");return;
    }
    
    if(Produtos.getQtdestoque().equals("0"))
    {
        ErroCdprodutos.setErro("O campo QUANTIDADE ESTOQUE tem que ser maior que zero");return;
    }
    
    
    
    //valor unitário verificação
    try
    {
       Float.parseFloat(Produtos.getValorunitario());
    }
    catch (Exception e)
    {
      ErroCdprodutos.setErro("O campo VALOR UNITÁRIO deve ser numerico!");return;
    }
     if(Produtos.getValorunitario().equals("0"))
    {
        ErroCdprodutos.setErro("O campo VALOR UNITÁRIO tem que ser maior que zero");return;
    }
    
    switch(_op)
    {
        case 'i': ProdutoDAL.inseriProduto(); break;
        case 'a': ProdutoDAL.alteraProduto(); break;
    }
 }*/
}
