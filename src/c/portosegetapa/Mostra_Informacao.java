package c.portosegetapa;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Mostra_Informacao {
	 public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 List<Coleta_Info> informacoes = new ArrayList<>();
	     while (true) {
	       Coleta_Info coleta1 = new Coleta_Info();
	       
	       ProcessaInformacao Processa1 = new ProcessaInformacao();
	       
	       coleta1.ConcultaCpf();
	       coleta1.ConsultaNome();
	       coleta1.ConsultaPlaca();
	       
	       coleta1.Consulta_local();
	       coleta1.Consulta_situacao();
	       if (coleta1.Consulta_carga() == 1) {
	    	   coleta1.Consulta_tipo_carga();
	       }else {
	    	   System.out.println("Veiculo sem carga");
	       }
	       
	       
	       coleta1.Consultatelefone();
	       coleta1.mostrarInformacoes();
	       Processa1.processarInformacao(coleta1);
	       System.out.print("Deseja continuar (S/N)? ");
           String resposta = scanner.next();
           if (!resposta.equalsIgnoreCase("S")) {
        	   System.out.println("Obrigado por usar nosso sistema");
        	   System.out.println("Estamos enviado o melhor guincho");
               break;
           }
         for (Coleta_Info info : informacoes) {
          System.out.println("Informações coletadas: " + info);
           }

           
	       
	    }
	     scanner.close();
	     }
}
