package devandroid.caua.applistacurso.view;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.UserHandle;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import devandroid.caua.applistacurso.R;
import devandroid.caua.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;

    Pessoa outraPessoa;

    String dadoPessoa;

    String dadoOutraPessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        pessoa = new Pessoa();

        pessoa.setPrimeiroNome("Cauã");
        pessoa.setSobreNome("Santos");
        pessoa.setCursoDesejado("Android");
        pessoa.setTelefoneContado("11-91122333");

        outraPessoa = new Pessoa();
        outraPessoa.setPrimeiroNome("Leticia");
        outraPessoa.setSobreNome("Cabral");
        outraPessoa.setCursoDesejado("Teatro");
        outraPessoa.setTelefoneContado("11-98880003");

        dadoPessoa = " Primeiro Nome: ";
        dadoPessoa += pessoa.getPrimeiroNome();
        dadoPessoa += " Sobrenome: ";
        dadoPessoa += pessoa.getSobreNome();
        dadoPessoa += " Curso Desejado: ";
        dadoPessoa += pessoa.getCursoDesejado();
        dadoPessoa += " Telefone de Contado: ";
        dadoPessoa += pessoa.getTelefoneContado();

        dadoOutraPessoa = " Primeiro Nome: ";
        dadoOutraPessoa += outraPessoa.getPrimeiroNome();
        dadoOutraPessoa += " Sobrenome: ";
        dadoOutraPessoa += outraPessoa.getSobreNome();
        dadoOutraPessoa += " Curso Desejado: ";
        dadoOutraPessoa += outraPessoa.getCursoDesejado();
        dadoOutraPessoa += " Telefone de Contato";
        dadoOutraPessoa += outraPessoa.getTelefoneContado();



        int parada = 0;

    }
}