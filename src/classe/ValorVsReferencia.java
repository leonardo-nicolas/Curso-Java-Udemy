package classe;

import classe.desafios.DesafioData;

public class ValorVsReferencia {

    public static void main(String[] args) {
        double a  = 2;
        double b = a; // Atribuição por valor;
        a++;
        b--;
        System.out.println( a + " " + b );

        DesafioData niverLeo = new DesafioData(16,11,1994);
        DesafioData nivLeo2 = niverLeo; // Atribuição por referência (Objeto)
        var leo = nivLeo2; // Inferência também é por referência
        niverLeo.dia = 31;
        nivLeo2.mes = 12;
        leo.ano = 2022;

        System.out.println(niverLeo.obterDataFormatada());
        System.out.println(nivLeo2.obterDataFormatada());
        System.out.println(leo.obterDataFormatada());
        
        voltarDataParaValorPadrao(niverLeo);
        System.out.println(niverLeo.obterDataFormatada());
        System.out.println(nivLeo2.obterDataFormatada());
        System.out.println(leo.obterDataFormatada());
        
        int c = 5;
        alterarPrimitivo(c);
        System.out.println(c);
    }
    
    static void voltarDataParaValorPadrao(DesafioData d) {
    	d.dia = 16;
    	d.mes = 11;
    	d.ano = 1994;
    }
    
    static void alterarPrimitivo(int a) {
    	a++;
    }
}