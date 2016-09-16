package ufms.cpcx.jose.listagem.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import ufms.cpcx.jose.listagem.R;
import ufms.cpcx.jose.listagem.model.Lanche;

public class ResumoActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar ;

    @BindView(R.id.tvNomedoLanche)
    TextView tvNome;

    @BindView(R.id.tvResumolanche)
    TextView tvResumo;

    @BindView(R.id.imgResumo)
    ImageView imvlanche;

    Lanche l;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumo);
        ButterKnife.bind(this);

        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        l =(Lanche) getIntent().getSerializableExtra("lanche");


        if(l!= null){
            tvNome.setText(l.getNome());
            tvResumo.setText(l.getResumo());
            imvlanche.setImageResource(l.getImg());
        }
    }



}