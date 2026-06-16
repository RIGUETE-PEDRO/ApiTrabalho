package br.edu.ifes.astro_api.Service;

import java.util.Random;

import br.edu.ifes.astro_api.Dados;

public class RetornaDadosService {

    

    public String GerarBichoAleatorio() {
        String[] bichos = {"Cachorro", "Gato", "Pássaro", "Peixe", "Coelho"};
        int index = new Random().nextInt(bichos.length);
        return bichos[index];
    }

    public String GerarCorAleatoria() {
        String[] cores = {"Vermelho", "Azul", "Verde", "Amarelo", "Roxo"};
        int index = new Random().nextInt(cores.length);
        return cores[index];
    }

    

    public String GerarNumero() {
        String number = String.valueOf(new Random().nextInt(100));
        return number;
    }

    public Dados buscarDados(String nickname, String plano) {
        Dados dados = new Dados();
        dados.setNickname(nickname);
        dados.setPlano(plano);
        
        if(plano.equalsIgnoreCase("premium")) {
            dados.setCorAleatoria(GerarCorAleatoria());
            dados.setSigno(GerarBichoAleatorio());
            dados.setBichoAleatorio(GerarBichoAleatorio());
        } else {
            dados.setCorAleatoria("Plano não gera número e cor aleatória");
            dados.setSigno("Plano não gera signo aleatório");
            dados.setBichoAleatorio("Plano não gera bicho aleatório");
        }

        if(plano.equalsIgnoreCase("avancado")) {
            dados.setBichoAleatorio(GerarBichoAleatorio());
            dados.setCorAleatoria(GerarCorAleatoria());
        } else {
            dados.setCorAleatoria("Plano não gera cor aleatória");
            dados.setBichoAleatorio("Plano não gera bicho aleatório");
        }
        
        dados.setNumero(GerarNumero());
        


        return dados;
    }

}
