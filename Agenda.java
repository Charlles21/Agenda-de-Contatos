package programas;
public class Agenda {
private String Nome;
private String Sobrenome;
private Float NumeroTelefone;

public Agenda(String Nome,String Sobrenome,Float numeroTelefone2){
    this.Nome = Nome;
    this.Sobrenome = Sobrenome;
    this.NumeroTelefone = numeroTelefone2;
}

public Agenda(){    
}


public String getNome() {
    return Nome;
}

public void setNome(String nome) {
    Nome = nome;
}

public String getSobrenome() {
    return Sobrenome;
}

public void setSobrenome(String sobrenome) {
    Sobrenome = sobrenome;
}

public Float getNumeroTelefone() {
    return NumeroTelefone;
}

public void setNumeroTelefone(Float numeroTelefone) {
    NumeroTelefone = numeroTelefone;
}

public void getInfo(){
    System.out.printf("Nome %s - Sobrenome %s - Numero do telefone %.0f\n",Nome, Sobrenome, NumeroTelefone);
}



    
}
