package com.lesehankoding.batikapps.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.lesehankoding.batikapps.Model.HasilItem;
import com.lesehankoding.batikapps.R;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterBatik extends RecyclerView.Adapter<AdapterBatik.MyHolder> {

    ArrayList<HasilItem> items;

    public AdapterBatik(ArrayList<HasilItem> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_batik_all, parent, false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        holder.txtNama.setText(items.get(position).getNamaBatik());
        holder.txtHarga.setText(items.get(position).getHargaRendah() +" ~ "+items.get(position).getHargaTinggi());
        holder.txtDaerah.setText(items.get(position).getDaerahBatik());
        Glide.with(holder.itemView.getContext())
                .load(items.get(position).getLinkBatik()).into(holder.imgBatik);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {

        TextView txtNama,txtDaerah,txtHarga;
        ImageView imgBatik;

        public MyHolder(@NonNull View itemView) {
            super(itemView);

            txtNama = itemView.findViewById(R.id.txtNama);
            txtDaerah = itemView.findViewById(R.id.txtDaerah);
            txtHarga = itemView.findViewById(R.id.txtHarga);
            imgBatik = itemView.findViewById(R.id.imgBatik);
        }
    }
}
