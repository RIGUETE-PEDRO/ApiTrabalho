package br.edu.ifes.astro_api;

public class Dados {
    private String nickname;
    private String plano;
    private String numero;
    private String BichoAleatorio;
    private String CorAleatoria;
    private String Signo;
    
    public String getNickname() {
        return nickname;
    }
    public String getPlano() {
        return plano;
    }
    public String getNumero() {
        return numero;
    }
    public String getBichoAleatorio() {
        return BichoAleatorio;
    }
    public String getCorAleatoria() {
        return CorAleatoria;
    }
    public String getSigno() {
        return Signo;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public void setPlano(String plano) {
        this.plano = plano;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public void setBichoAleatorio(String bichoAleatorio) {
        BichoAleatorio = bichoAleatorio;
    }
    public void setCorAleatoria(String corAleatoria) {
        CorAleatoria = corAleatoria;
    }
    public void setSigno(String signo) {
        Signo = signo;
    }

}
