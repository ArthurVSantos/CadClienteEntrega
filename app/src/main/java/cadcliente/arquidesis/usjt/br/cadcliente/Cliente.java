package cadcliente.arquidesis.usjt.br.cadcliente;

import com.orm.SugarRecord;

/**
 * Created by elcio on 20/10/17.
 */

public class Cliente extends SugarRecord {

    String nome;
    int idade;
    String cpf;
    String telefone;

    public Cliente(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
