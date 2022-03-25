package com.example.resellwell.activity.dashboard.ui.customer;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.resellwell.R;
import com.example.resellwell.activity.dashboard.ui.adapter.CustomerAdapter;
import com.example.resellwell.model.Customer;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CustomerFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CustomerFragment extends Fragment {

    private CustomerAdapter adapter;

    private RecyclerView recyclerViewCustomerList;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    private ArrayList<Customer> listaContatos = new ArrayList<>();

    public CustomerFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CustomerFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CustomerFragment newInstance(String param1, String param2) {
        CustomerFragment fragment = new CustomerFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_customer, container, false);

        //start list customers
        recyclerViewCustomerList = view.findViewById(R.id.recyclerViewCustomerList);
        //usuariosRef = ConfiguracaoFirebase.getFirebaseDatabase().child("usuarios");

        Customer cus1 = new Customer("1", "nome", "email", "senha", "foto", "123132132" );
        Customer cus2 = new Customer("2", "nome2", "email2", "senha2", "foto2", "23132133" );
        listaContatos.add(cus1);
        listaContatos.add(cus2);

        //configurar adapter
        adapter = new CustomerAdapter(listaContatos, getActivity() );

        //configurar recyclerview
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager( getActivity() );
        recyclerViewCustomerList.setLayoutManager( layoutManager );
        recyclerViewCustomerList.setHasFixedSize( true );
        recyclerViewCustomerList.setAdapter( adapter );

        return view;
    }


    @Override
    public void onStart() {
        super.onStart();
        //recuperarContatos();
    }

    @Override
    public void onStop() {
        super.onStop();
        //usuariosRef.removeEventListener( valueEventListenerContatos );
    }

    public void recuperarContatos(){

//        valueEventListenerContatos = usuariosRef.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(DataSnapshot dataSnapshot) {
//
//                for ( DataSnapshot dados: dataSnapshot.getChildren() ){
//
//                    Usuario usuario = dados.getValue( Usuario.class );
//                    listaContatos.add( usuario );
//
//                }
//
//                adapter.notifyDataSetChanged();
//
//            }
//
//            @Override
//            public void onCancelled(DatabaseError databaseError) {
//
//            }
//        });

    }
}