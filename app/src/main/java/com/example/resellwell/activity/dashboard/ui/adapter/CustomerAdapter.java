package com.example.resellwell.activity.dashboard.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.resellwell.R;
import com.example.resellwell.model.Customer;

import java.util.List;

public class CustomerAdapter extends RecyclerView.Adapter<CustomerAdapter.MyViewHolder> {

    private List<Customer> customers;
    private Context context;

    public CustomerAdapter(List<Customer> customersList, Context c){
    this.customers = customersList;
    this.context = c;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemList = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_customer, parent, false);
        return new MyViewHolder(itemList);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Customer customer = customers.get(position);

        holder.name.setText(customer.getName());
        holder.phone.setText(customer.getPhone());

        if(customer.getPhoto() != null){
            //Uri uri = Uri.parse(customer.getPhoto());
            //Glide.with(context).load(uri).into(holder.photo);
        }else{
           //holder.photo.setImageResource();
        }

    }

    @Override
    public int getItemCount() {
        return customers.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView photo;
        TextView name, email, phone;

        public MyViewHolder(View itemView){
            super(itemView);

            photo = itemView.findViewById(R.id.imageCustomer);
            name = itemView.findViewById(R.id.textNameCustomer);
            phone = itemView.findViewById(R.id.textPhoneCustomer);

        }
    }
}
