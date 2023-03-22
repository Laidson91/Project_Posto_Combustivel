package postoCombustivel;


public class BombaCombustivel {
    
    private String tipoCombustivel;
    private float valorLitro;
    float qtdCombustivel;
    
    public BombaCombustivel(String tipoCombustivel, float valorLitro, float qtdCombustivel){
        this.tipoCombustivel = tipoCombustivel;
        this.valorLitro = valorLitro;
        this.qtdCombustivel = qtdCombustivel;
    }
    
     
    public float abastecerPorValor(float valor){
        float temp;
        temp = valor / valorLitro;
        alterarQtdCombustivel(this.qtdCombustivel - temp);
        return temp;
    }
    
    public float abastecerPorLitro(float qtd){
        float temp2;
        temp2 = qtd * valorLitro;
        alterarQtdCombustivel(this.qtdCombustivel - qtd);
        return temp2;
    }
    
    public void alterarValor(float valorLitro){
        this.valorLitro = valorLitro;
    }
    
    public void alterarCombustivel(String tipoCombustivel){
        this.tipoCombustivel = tipoCombustivel;
    }
    
    public void alterarQtdCombustivel(float qtdCombustivel){
        this.qtdCombustivel = qtdCombustivel;
    }
    
}

