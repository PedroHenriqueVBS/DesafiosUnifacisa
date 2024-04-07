public class Conta {
    public int numero;
    public String titular;
    public double saldo;

    public Conta(){

    }
    public int getNumero(){
        return this.numero;
    }
    public void setNumero(){

    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
