package BancoServicePacote.domain;

public class BancoService {
    private double saldo;
    private String senha;
    private String usuario;

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
        try{
            this.saldo += novoSaldo;
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void transferir(BancoService bancoService, double saldoTransferir){
        if(this.saldo < saldoTransferir){
            System.out.println("Saldo invalido");
        }else{
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
}
