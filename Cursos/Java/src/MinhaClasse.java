public class MinhaClasse {
    
    public static void main(String[] args) {
        
        String primeiroNome = "Cesar";
        String segundoNome = "Rodrigues";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){

        return primeiroNome + " " + segundoNome;
    }
}
