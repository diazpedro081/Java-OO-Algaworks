package br.com.algaWorks.src.main.Aulas.metodosEqualsHashCode.exemploCadastroProdutos;

public class Produto {
    
    /*
     * O sku é um código que identifica unicamente o produto
     */
    private String sku;
    private String nome;
    
    public Produto(String sku, String nom) {
        this.sku = sku;
        this.nome = nom;
    }

    public String getSku() {
        return sku;
    }
    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getNom() {
        return nome;
    }
    public void setNom(String nom) {
        this.nome = nom;
    }

    @Override
    public String toString() {
        return "Produto sku: " + sku + "\nnom: " + nome;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((sku == null) ? 0 : sku.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Produto other = (Produto) obj;
        if (sku == null) {
            if (other.sku != null)
                return false;
        } else if (!sku.equals(other.sku))
            return false;
        return true;
    }
    
    
}
