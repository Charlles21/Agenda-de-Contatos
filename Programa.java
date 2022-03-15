package programas;
import java.util.Scanner;
public class Programa {

  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    Agenda agd = new Agenda();

     String Nome;
     String Sobrenome;
     Float NumeroTelefone;     
     int QuantidadeDeContatos=0;
     int opcao;
     int ContadorOpçao;
     
     do{      
     
      System.out.print("\nQuantos contatos terao em sua Agenda: ");
     ContadorOpçao = imput.nextInt();

      if(ContadorOpçao<=0){
        System.out.println("\nNumero invalido Por favor digite numeros acima de 0!");
      }
    
    }while(ContadorOpçao<=0);

     Agenda[] Agenda = new Agenda[ContadorOpçao];  
     
    do {

      System.out.println("\nEscolha uma opção:");     
      System.out.println("[1] <-> Incluir pessoa");
      System.out.println("[2] <-> Listar todos os cadastrados");
      System.out.println("[0] <-> Encerra a Agenda");
      System.out.print("Opção: ");  

      opcao = imput.nextInt();
      imput.nextLine();             
      
      switch (opcao) {       

      case 0:
          System.out.println("Fim do programa!");
          break;

      case 1:

       if(QuantidadeDeContatos==ContadorOpçao){ 

        System.out.println("\nAtençao Lista de contatos cheia!!\n");

        break;
       }
       else{

        do{          
          System.out.print("Primeiro Nome do contato: ");
          Nome = imput.nextLine();
          agd.setNome(Nome);

          if((Nome.length()< 3||Nome.length()>15)){
            System.out.println("Digite um Nome valido entre 3 a 15 caracteres");
          } 
          
        }while(Nome.length()< 3||Nome.length()>15);

        do{  
          System.out.print("Sobrenome do contato: ");
          Sobrenome = imput.nextLine();
          agd.setSobrenome(Sobrenome);
          if(Sobrenome.length()< 3||Sobrenome.length()>25){
            System.out.println("Digite um Nome valido entre 3 a 25 caracteres");
          }

        }while(Sobrenome.length()< 3||Sobrenome.length()>25);
        
          System.out.print("Digite o numero de telefone: ");
          NumeroTelefone = imput.nextFloat();
          agd.setNumeroTelefone(NumeroTelefone);         
        
          Agenda[QuantidadeDeContatos] = new Agenda(Nome,Sobrenome, NumeroTelefone);
          QuantidadeDeContatos++;    

      }    
        
      break;
          
      case 2:        

        System.out.println("\n     ------ Infos dos Contatos --------\n");     
          
        for (int Contador = 0; Contador < Agenda.length; Contador++) {         
          if(Agenda[Contador]!=null){Agenda[Contador].getInfo();}          
         }      

       break;
       default:
          System.out.println("Opção inválida!");
          break;
      }
    } while (opcao != 0);

    imput.close();
  }
}
