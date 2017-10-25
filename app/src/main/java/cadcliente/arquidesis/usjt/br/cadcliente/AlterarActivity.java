package cadcliente.arquidesis.usjt.br.cadcliente;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AlterarActivity extends AppCompatActivity {

    public EditText editTextNome;
    public EditText editTextIdade;
    public EditText editTextCpf;
    public EditText editTextTelefone;
    public EditText editTextId;
    public Button btnAlterar;
    public Cliente cliente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alterar);

        editTextNome = (EditText)findViewById(R.id.editTextNome2);
        editTextIdade = (EditText)findViewById(R.id.editTextIdade2);
        editTextCpf = (EditText)findViewById(R.id.editTextCpf2);
        editTextTelefone = (EditText)findViewById(R.id.editTextTelefone2);
        editTextId = (EditText)findViewById(R.id.editTextId2);
        btnAlterar = (Button)findViewById(R.id.btnAlterar);
    }

    public void altConsultarRegistro(View view)
    {
        Cliente cliente;

        int id = Integer.parseInt(editTextId.getText().toString());

        cliente = Cliente.findById(Cliente.class,id);

        if(cliente != null)
        {
            editTextNome.setEnabled(true);
            editTextIdade.setEnabled(true);
            editTextCpf.setEnabled(true);
            editTextTelefone.setEnabled(true);
            btnAlterar.setEnabled(true);

            editTextNome.setText(cliente.getNome());
            editTextIdade.setText(""+cliente.getIdade());
            editTextCpf.setText(cliente.getCpf());
            editTextTelefone.setText(cliente.getTelefone());
        }

        this.cliente = cliente;
    }

    public void alterarRegistro(View view)
    {
        cliente.nome = editTextNome.getText().toString();
        cliente.idade = Integer.parseInt(editTextIdade.getText().toString());
        cliente.cpf = editTextCpf.getText().toString();
        cliente.telefone = editTextTelefone.getText().toString();

        cliente.save();

        Toast.makeText(this,"Registro alterado com sucesso ! Reg: "+cliente.getId(),Toast.LENGTH_LONG).show();
        finish();

    }

}
