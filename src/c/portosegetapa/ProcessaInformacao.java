package c.portosegetapa;

public class ProcessaInformacao {

	    public static void processarInformacao(Coleta_Info coletaInfo) {
	        int situacao = coletaInfo.getSituacao_caminhao();
	        int local = coletaInfo.getTipo_de_local();
	        int carga = coletaInfo.getTipo_de_carga();

	        if (situacao == 1 && local == 1 && carga == 1) {
	            System.out.println("O melhor Guincho é o tipo 1");
	        } else if (situacao == 2 && local == 1 && carga == 1) {
	            System.out.println("O melhor Guincho é o tipo 1 ou tipo 2");
	        } else if (situacao == 2 && local == 2 && carga == 1) {
	            System.out.println("O melhor Guincho é o tipo 1 ou tipo 2"); 
	        } else if (situacao == 2 && local == 2 && carga == 2) {
	            System.out.println("O melhor Guincho é o tipo 2");     
	        } else if (situacao == 3 && local == 1 && carga == 1) {
	            System.out.println("O melhor Guincho é o tipo 1 ou tipo 3");
	        } else if (situacao == 3 && local == 2 && carga == 2) {
	            System.out.println("O melhor guincho é o tipo 3 ou tipo 2");
	        } else {
	            System.out.println("Nenhuma correspondência encontrada.");
	        }
	    }
	}


