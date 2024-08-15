package com.example.arapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class recyclerPolicyRenewalAdapter extends RecyclerView.Adapter<recyclerPolicyRenewalAdapter.ViewHolder>{

    Context context;
    ArrayList<policyRenewalModal> arrPolicyRenewal;
    public recyclerPolicyRenewalAdapter(Context context, ArrayList<policyRenewalModal> arrPolicyRenewal){
        this.context = context;
        this.arrPolicyRenewal = arrPolicyRenewal;
    }

    @NonNull
    @Override
    public recyclerPolicyRenewalAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =  LayoutInflater.from(context).inflate(R.layout.policy_renewal_row,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull recyclerPolicyRenewalAdapter.ViewHolder holder, int position) {
        holder.imgPolicyRenewal.setImageResource(arrPolicyRenewal.get(position).img);
        holder.txtName.setText(arrPolicyRenewal.get(position).name);
    }

    @Override
    public int getItemCount() {
        return arrPolicyRenewal.size();    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView txtName;
        ImageView imgPolicyRenewal;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtName = itemView.findViewById(R.id.namePolicyRenewal);
            imgPolicyRenewal = itemView.findViewById(R.id.imgPolicyRenewal);
        }
    }
}
