/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * criar um novo método que retorne um valor string para carregar o tipo para
 * veículo. Os valores que deverão retorna são: Moto, automóvel, caminhão e
 * ônibus.
 *
 * Na classe UtilGerador criar um método para retorna a placa do veículo
 * exemplo: ASD-5869
 */
public class UtilGerador {

    public static String gerarTipo() {

        String tipo;
        int indice;

        String[] tipos = {"Moto", "Automóvel", "Caminhão", "Ônibus"};

        indice = (int) (Math.random() * tipos.length);
        tipo = tipos[indice];
        tipo += "";

        return tipo;
    }

    public static String gerarPlaca() {

        return gerarCaracter(3) + "-" + gerarNumero(4);

    }

    public static String gerarModelo() {
        String modelo;
        int indice;
        String[] modelos = {"Fusca", "Kombi", "Gol", "Uno",
            "Onix", "C3", "Vectra", "Civic", "Corolla", "Celta"};
        indice = (int) (Math.random() * modelos.length);
        modelo = modelos[indice];
        modelo += "";

        return modelo;
    }

    public static String gerarFabricante() {
        String fabricante;
        int indice;
        String[] marcas = {"Volkswagen", "Honda", "Toyota", "Chevrolet",
            "Citroen", "Fiat"};
        indice = (int) (Math.random() * marcas.length);
        fabricante = marcas[indice];
        fabricante += "";
        return fabricante;
    }

    public static String gerarBandeiras() {
        String bandeira;
        int indice;
        String[] bandeiras = {"Visa", "Maestro", "Elo", "HiperCard",
            "AmericanExpress", "MasterCard"};
        indice = (int) (Math.random() * bandeiras.length);
        bandeira = bandeiras[indice];
        bandeira += "";
        return bandeira;
    }

    public static String gerarCaracter(int qtd) {
        String palavra = "";
        int indice;
        String[] caracteres = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L",
            "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

        for (int i = 0; i < qtd; i++) {
            indice = (int) (Math.random() * caracteres.length);
            palavra += caracteres[indice];
        }
        return palavra;
    }

    public static String gerarNome() {
        String nome;
        int indice;
        String[] nomes = {"João", "Maria", "Beatriz", "Antonio",
            "Jefferson", "Silvio", "Tatiana", "Soeli", "Joana", "Camilla", "kelly",
            "Venicius", "Marcos", "Pedro"};
        indice = (int) (Math.random() * nomes.length);
        nome = nomes[indice];
        nome = nome + " " + gerarSobreNome();
        return nome;
    }

    private static String gerarSobreNome() {
        String sobrenome;
        int indice;
        String[] nomes = {"Silva", "Motto", "Ribeiro", "May",
            "Junior", "Cionette", "Souza", "Aurelio", "Pereira", "Oliveira", "Araujo",
            "Matos", "Barbosa", "Nascimento"};
        indice = (int) (Math.random() * nomes.length);
        sobrenome = nomes[indice];
        return sobrenome;
    }

    public static String gerarCidade() {
        String cidade;
        int indice;
        String[] cidades = {"Florianópolis", "São José", "Palhoça", "São Bento",
            "Biguaçu", "Curitiba", "Urupema", "Tijucas", "Balneário", "Camboriú", "Santo Antônio",
            "Lapa", "Portal", "Matinhos"};
        indice = (int) (Math.random() * cidades.length);
        cidade = cidades[indice];
        return cidade;
    }

    public static String gerarNumero(int qtd) {
        String numero = "";
        for (int i = 0; i < qtd; i++) {
            numero += (int) (Math.random() * 10);
        }
        return numero;
    }

    public static String gerarEmail() {
        return gerarCaracter(8) + "@email.com";
    }

    public static String gerarTelefoneFixo() {
        return "(48)3" + gerarNumero(3) + "-" + gerarNumero(4);
    }

    public static int criarNumeroAleatorioEntre2Valores(int menor, int maior) {
        int numero = (int) (Math.random() * (maior - menor));
        if (numero == 0) {
            numero++;
        }
        numero = numero + menor;
        return numero;
    }

    public static String gerarTipoTel() {
        String tipo;
        int indice;
        String[] tipos = {"celular", "Telefone Residencial"};
        indice = (int) (Math.random() * tipos.length);
        tipo = tipos[indice];
        tipo += "";
        return tipo;
    }

    public static String gerarOperadora() {
        String tipo;
        int indice;
        String[] tipos = {"Tim", "Vivo", "Oi", "Claro"};
        indice = (int) (Math.random() * tipos.length);
        tipo = tipos[indice];
        tipo += "";
        return tipo;
    }

}
