package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salarioAnual = 25000;
        double valorAnualImposto;
        double primeiraFaixa = ((9.70)/100);
        double segundaFaixa = ((37.35)/100);
        double terceiraFaixa = ((49.50)/100);
        if(salarioAnual <= 34712){
            valorAnualImposto = salarioAnual * primeiraFaixa;
        }else if(salarioAnual > 34712 && salarioAnual < 68507){
            valorAnualImposto = salarioAnual * segundaFaixa;
        }else {
            valorAnualImposto = salarioAnual * terceiraFaixa;
        }
        System.out.println("Total a pagar "+valorAnualImposto);

    }
}
