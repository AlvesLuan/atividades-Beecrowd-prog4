import java.io.IOException;
import java.util.*;

public class Main {

    public static void organiarStringArrayList(ArrayList<String> arrayListAmigos){
        Collections.sort(arrayListAmigos);
    }

    public static void mostraArrayList(ArrayList<String> arrayListAmigos){
        for (String amigo : arrayListAmigos) {
            System.out.println(amigo);
        }
    }
    

    public static void main(String[] args) throws IOException {
        ArrayList<String> amigosSIM = new ArrayList<String>();
        ArrayList<String> amigosNAO = new ArrayList<String>();
        Scanner Entrada = new Scanner(System.in);
        String amigoAtual = null;

        while (true) {
            String linha = Entrada.nextLine();

            if (linha.equals("FIM")) {
                break;
            }

            String[] partes = linha.split(" ");
            String nome = partes[0];
            String situacao = partes[1];



            if (amigoAtual == null){
                if (situacao.equals("YES")){
                    amigoAtual = nome;
                }
                
            } else if (situacao.equals("YES") && (amigoAtual != null) ){
                if (amigoAtual.length() > nome.length()){
                    amigoAtual = nome;
                }
            }


            if (situacao.equals("YES")){
                if(!amigosSIM.contains(nome)){
                    amigosSIM.add(nome);
                }
            }

            if (situacao.equals("NO")){
                if(!amigosNAO.contains(nome)){
                    amigosNAO.add(nome);
                }
            }
            
        };
        organiarStringArrayList(amigosSIM);
        organiarStringArrayList(amigosNAO);
        mostraArrayList(amigosSIM);
        mostraArrayList(amigosNAO);

        System.out.println("\nAmigo do Habay:\n"+amigoAtual);

    }
}
