package com.lesehankoding.batikapps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import okhttp3.Response;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.OkHttpResponseAndParsedRequestListener;
import com.lesehankoding.batikapps.Adapter.AdapterBatik;
import com.lesehankoding.batikapps.Model.HasilItem;
import com.lesehankoding.batikapps.Model.ModelBatikAll;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ArrayList<HasilItem> item = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        AndroidNetworking.initialize(MainActivity.this);

        AndroidNetworking.enableLogging();


        AndroidNetworking.get("https://batikita.herokuapp.com/index.php/batik/all")
                .build()
                .getAsOkHttpResponseAndObject(ModelBatikAll.class, new OkHttpResponseAndParsedRequestListener<ModelBatikAll>() {
                    @Override
                    public void onResponse(Response okHttpResponse, ModelBatikAll response) {
                        Log.d("MAIN", "onResponse: "+response.toString());
                        if(okHttpResponse.isSuccessful()){
                            for (int posisi = 0; posisi < response.getHasil().size(); posisi++) {
                                HasilItem hasilItem = new HasilItem();
                                hasilItem.setId(response.getHasil().get(posisi).getId());
                                hasilItem.setNamaBatik(response.getHasil().get(posisi).getNamaBatik());
                                hasilItem.setDaerahBatik(response.getHasil().get(posisi).getDaerahBatik());
                                hasilItem.setHargaRendah(response.getHasil().get(posisi).getHargaRendah());
                                hasilItem.setHargaTinggi(response.getHasil().get(posisi).getHargaTinggi());
                                hasilItem.setLinkBatik(response.getHasil().get(posisi).getLinkBatik());
                                hasilItem.setHitungView(response.getHasil().get(posisi).getHitungView());
                                hasilItem.setMaknaBatik(response.getHasil().get(posisi).getMaknaBatik());
                                item.add(hasilItem);

                                Log.d("RESPONSE", "onResponse: "+response.getHasil().get(posisi).getNamaBatik());

                            }

                            RecyclerView recyclerView = findViewById(R.id.rvBatik);
                            GridLayoutManager gridLayoutManager = new GridLayoutManager(MainActivity.this, 2);
                            recyclerView.setLayoutManager(gridLayoutManager);
                            AdapterBatik adapterBatik = new AdapterBatik(item);
                            recyclerView.setAdapter(adapterBatik);
                        }
                    }

                    @Override
                    public void onError(ANError anError) {
                        Log.d("MainActivity", "onError: "+anError.getErrorDetail());
                    }
                });

    }
}