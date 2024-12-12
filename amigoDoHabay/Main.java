import java.io.IOException;
import java.util.*;

public class Main {

    public static void organizarArrayList(ArrayList<String> arrayListAmigos){
        Collections.sort(arrayListAmigos);
    }

    public static void mostrarArrayList(ArrayList<String> arrayListAmigos){
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
                    //System.out.println("PRIMEIRO AMIGO!");
                }
                
            } else if (situacao.equals("YES") && (amigoAtual != null) ){
                if (amigoAtual.length() > nome.length()){
                    amigoAtual = nome;
                   // System.out.println("AMIGOU ATUAL ALTERADO!");
                }
            }



            if (situacao.equals("YES")){
                if(!amigosSIM.contains(nome)){
                    amigosSIM.add(nome);
                    //System.out.println("adicionado a lista de YES");
                }
            }

            if (situacao.equals("NO")){
                if(!amigosNAO.contains(nome)){
                    amigosNAO.add(nome);
                    //System.out.println("adicionado a lista de NO");
                }
            } 
        };

        organizarArrayList(amigosSIM);
        organizarArrayList(amigosNAO);
        mostrarArrayList(amigosSIM);
        mostrarArrayList(amigosNAO);

        System.out.println("\nAmigo do Habay:\n"+amigoAtual);

    }
}
