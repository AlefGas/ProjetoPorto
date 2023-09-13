package c.portosegetapa;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Coleta_Info {
	
	Scanner scanner = new Scanner(System.in);
	public Coleta_Info() {
		
	}
   
  
//Variaveis
  private String nome;
  private long cpf;
  private long numero;
  private String placa;
  private int situacao_caminhao;
  private int tipo_de_carga;
  private int tipo_de_local;
  
  
 
    
    
 //metodos   
public int  ConcultaCpf(){
	boolean entradaValida = false;
	while(!entradaValida) {
		try {
			System.out.println("Digite seu Cpf:");
		    cpf = scanner.nextLong();
		    entradaValida = true;
		    this.setCpf(cpf);
		}
		    catch (InputMismatchException e) {
                System.out.println("Entrada invalida. Por favor, insira um número(que não tem ponto nem traco)");
                scanner.next(); 
	
    
	}
		
	}
    return (int) cpf;
	
   }
public String ConsultaNome(){
	 
     System.out.println("Digite seu nome:"); 
     String nome = scanner.next();
     this.setNome(nome);
     
	return (nome);
}  

public String ConsultaPlaca(){
	 
     System.out.println("Digite a placa do veiculo:"); 
     String placa = scanner.next();
     this.setPlaca(placa);
     
	return (placa);
}

public int Consulta_carga(){
	System.out.println("O Caminhao estva com carga? 1- para Sim/ 2-para nao");
    int Consulta_carga = scanner.nextInt();
    
    return Consulta_carga;
    
}
public int Consulta_local(){
	System.out.println("Qual o tipo de local que o veiculo se encontra"
			+ "\n 1- Asfalto"
			+ "\n 2- Terra/barro/areia"
			+ "\n 3- perto de rio/mar ");
	tipo_de_local = scanner.nextInt();
    this.setTipo_de_carga(tipo_de_local);
    
    return (tipo_de_local);
}
public int Consulta_tipo_carga(){
	System.out.println("Qual o tipo de carga?"
    +"\n1. Cargas perigosas"
    +"\n2. Especiais"
    +"\n3. Indivisiveis"
    +"\n4. Cargas secas"
    +"\n5. Frageis"
    +"\n6. A granel"
    +"\n7. Frigorifica"
    +"\n8. Carga viva"
    +"\nn9. Conteineres"
    +"\n10. Veiculos"
    +"\n11. Minerio e cimento"
    +"\n12. Medicamentos"
    +"\n13. Alto valor agregado"
    +"\n14. Nenhuma das opçoes");
    int tipo_de_carga = scanner.nextInt();
    
    this.setTipo_de_carga(tipo_de_carga);
    
   
    return (tipo_de_carga);
    
}
public int Consulta_situacao(){
    System.out.println("Selecione a situacao que se encontra o veiculo: "
    		+ "\n 1- Veiculo deu pane/ nao funciona/ nao anda "
    		+ "\n 2- Veiculo sofreu acidente"
    		+ "\n 3- Veiculo esta sem chave"
    		+ "\n 4- Outro tipo de acontecimento com o veiculo");
    situacao_caminhao = scanner.nextInt();
    this.setSituacao_caminhao(situacao_caminhao);
    
    return (situacao_caminhao);
    
}
public long Consultatelefone(){
	System.out.println("Digite seu numero para contato:");
    numero = scanner.nextLong();
    this.setNumero(numero);
   
    return (numero);
	
}
	
public void mostrarInformacoes(){
    System.out.println("o cpf do Usuario eh:"+ this.getCpf());
    System.out.println("o nome do usuario eh:"+ this.getNome());
    System.out.println("o numero de telefone do usuario eh:"+ this.getNumero());
    System.out.println("a placa do veiculo solictante eh:"+ this.getPlaca());
    System.out.println("o numero da situaçao escolhida foi a:"+ this.getSituacao_caminhao());
    System.out.println("o numero do tipo de carga escolhido foi o:"+ this.getTipo_de_carga());
    System.out.println("o numero do local escolhido foi o:"+ this.getTipo_de_local());
    
    
}

//métodos getters setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return  cpf;
    }

    public void setCpf(long cpf) {
    	
        this.cpf = cpf;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getSituacao_caminhao() {
    	
    	return situacao_caminhao;
        
    }

    public void setSituacao_caminhao(int situacao_caminhao) {
        this.situacao_caminhao = situacao_caminhao;
    }

    public int getTipo_de_carga() {
        return tipo_de_carga;
    }

    public void setTipo_de_carga(int tipo_de_carga) {
        this.tipo_de_carga = tipo_de_carga;
    }

    public int getTipo_de_local() {
        return tipo_de_local;
    }

    public void setTipo_de_local(int tipo_de_local) {
        this.tipo_de_local = tipo_de_local;
    }





    


}

