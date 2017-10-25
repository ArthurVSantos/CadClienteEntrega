package cadcliente.arquidesis.usjt.br.cadcliente;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class DeletarActivity extends AppCompatActivity {

    public EditText editTextId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deletar);

        editTextId = (EditText)findViewById(R.id.editTextId3);
    }

    public void deletarRegistro(View view)
    {
        Cliente cliente;

        int id = Integer.parseInt(editTextId.getText().toString());

        cliente = Cliente.findById(Cliente.class, id);

        cliente.delete();

        Toast.makeText(this,"Registro deletado com sucesso ! Reg: "+cliente.getId(),Toast.LENGTH_LONG).show();
        finish();
    }
}
