import java.util.Scanner;

public class ViaCep {

    public static void main(String[] args) throws Exception {
        System.out.print("CEP: ");
        String cep = new Scanner(System.in).nextLine();

        Endereco endereco = CepService.buscaCep(cep);

        System.out.println("Logradouro: " + endereco.getLogradouro());
        System.out.println("Bairro: " + endereco.getBairro());
        System.out.println("Localidade: " + endereco.getLocalidade());
        System.out.println("Uf: " + endereco.getUf());
    }

}
