package BancoServicePacote.domain;

public class BancoService implements Comparable<BancoService>, Boleto{
    private double saldo;
    private String senha;
    private String usuario;
    private double valorBoleto;

    public BancoService(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }


    @Override
    public String toString() {
        return "BancoService{" +
                "saldo=" + saldo +
                ", senha='" + senha + '\'' +
                ", usuario='" + usuario + '\'' +
                '}';
    }

    public void adicionarSaldo(double novoSaldo){
        if (novoSaldo < 0){
            System.out.println("Saldo invalido");
        }else {
            try {
                this.saldo += novoSaldo;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void transferir(BancoService bancoService, double saldoTransferir){
        if(this.saldo < saldoTransferir){
            System.out.println("Saldo invalido");
        } else if (this == bancoService) {
            System.out.println("Saldo invalido");
        } else{
            this.saldo = saldo - saldoTransferir;
            bancoService.saldo += saldoTransferir;
        }

    }

    public void trocarSenha(String novaSenha){
        this.senha = novaSenha;
    }



    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }


    @Override
    public int compareTo(BancoService o) {
        return this.usuario.compareTo(o.getUsuario());
    }

    @Override
    public void pagarBoleto() {

    }

    @Override
    public void pagarBoleto(double valorBoleto) {
        if (saldo < valorBoleto){
            System.out.println("Saldo insuficiente");
        }else{
            this.saldo = valorBoleto - saldo;
            System.out.println("Boleto pago!");
        }

    }
}
