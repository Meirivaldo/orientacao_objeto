package one.dio.com.oo;

public class Carro {

    String cor;
    String modelo;
    int capacidadeTanque;

    public Carro() {
    }

    public Carro(String cor, String modelo, int capacidadeTanque) {  //Os atributos da classe.
        this.cor = cor;   //this.cor ira receber a cor como parametro, por isso se colocar duas vezes!
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
             //O atributo        O parametro   Por isso se usa o this, para retirar a ambiguidade!
    }

    void setCor(String cor) {  //Set é para colocar um valor em um atributo.
        this.cor = cor;  //Neste caso posso colocar um valor no atributo cor.
    }                     //Neste caso é void por que não vai retornar, já que é apenas para colocar um valor no atributo!
    String getCor() {  //Devolve um valor, no caso retornar o valor da cor!
        return cor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    String getModelo() {
        return modelo;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    double totalValorTanque(double valorCombustivel){
        return capacidadeTanque * valorCombustivel;
    }
}



