package model;
// Generated 12/11/2014 11:53:29 by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * Vendaitem generated by hbm2java
 */
public class Vendaitem  implements java.io.Serializable {


     private Integer idVendaItem;
     private Produto produto;
     private Venda venda;
     private int quantidade;
     private BigDecimal valor;
     private BigDecimal desconto;

    public Vendaitem() {
    }

	
    public Vendaitem(Produto produto, Venda venda, int quantidade, BigDecimal valor) {
        this.produto = produto;
        this.venda = venda;
        this.quantidade = quantidade;
        this.valor = valor;
    }
    public Vendaitem(Produto produto, Venda venda, int quantidade, BigDecimal valor, BigDecimal desconto) {
       this.produto = produto;
       this.venda = venda;
       this.quantidade = quantidade;
       this.valor = valor;
       this.desconto = desconto;
    }
   
    public Integer getIdVendaItem() {
        return this.idVendaItem;
    }
    
    public void setIdVendaItem(Integer idVendaItem) {
        this.idVendaItem = idVendaItem;
    }
    public Produto getProduto() {
        return this.produto;
    }
    
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    public Venda getVenda() {
        return this.venda;
    }
    
    public void setVenda(Venda venda) {
        this.venda = venda;
    }
    public int getQuantidade() {
        return this.quantidade;
    }
    
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public BigDecimal getValor() {
        return this.valor;
    }
    
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
    public BigDecimal getDesconto() {
        return this.desconto;
    }
    
    public void setDesconto(BigDecimal desconto) {
        this.desconto = desconto;
    }




}


