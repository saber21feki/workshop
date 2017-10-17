package com.example.epsi.myapplication;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.epsi.myapplication.Adapter.MainListAdapter;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView tvId ;
    TextView tvOwnerName ;
    TextView tvPayee ;
    TextView tvBalance ;
    TextView tvRate ;
    TextView tvConso ;

    Button btnRefresh ;
    Button btnHisto ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvId = (TextView) findViewById(R.id.textId);
        tvOwnerName = (TextView) findViewById(R.id.textName);
        tvPayee = (TextView) findViewById(R.id.textPayee);
        tvBalance = (TextView) findViewById(R.id.textBalance);
        tvRate = (TextView) findViewById(R.id.textRate);
        tvConso = (TextView) findViewById(R.id.textConso);

        btnRefresh = (Button) findViewById(R.id.btnRefresh);
        btnRefresh.setOnClickListener(OnClickBtnRefresh);
        btnHisto = (Button) findViewById(R.id.btnHistory);
        btnHisto.setOnClickListener(OnClickBtnHisto);


        getAccount();
        LoadDisplayInfos();
        RefreshConso();


    }

    public View.OnClickListener OnClickBtnRefresh = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            RefreshConso();
        }
    };

    public View.OnClickListener OnClickBtnHisto = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //Do something
        }
    };

    public void getAccount(){
        // récupération des données du compte
    }

    public void LoadDisplayInfos(){
        // utiliser les données
        tvId.setText("985462475");
        tvOwnerName.setText("Jonny");
        tvPayee.setText("Régis de Mtp");
        tvBalance.setText("+47,84 €");
        tvRate.setText("1,15 €");
    }

    public void RefreshConso(){
        // Refresh de la conso
        tvConso.setText("13,14 m3");
    }



}
