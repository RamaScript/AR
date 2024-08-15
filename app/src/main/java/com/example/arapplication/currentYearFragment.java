package com.example.arapplication;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class currentYearFragment extends Fragment implements AdapterView.OnItemSelectedListener {
    ArrayList<policyRenewalModal> arrpolicyRenewal = new ArrayList<>();
    // Define the options for the Spinner
    String[] sortBy = { "Sort By", "Time", "Policy No.", "Price", "Date", "Due Date" };

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_current_year, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Initialize the Spinner after the view is created
        Spinner spin = view.findViewById(R.id.sortBySpinner);
        spin.setOnItemSelectedListener(this);

        // Set up the ArrayAdapter with the options
        ArrayAdapter<String> aa = new ArrayAdapter<>(getContext(), android.R.layout.simple_spinner_item, sortBy);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Attach the adapter to the Spinner
        spin.setAdapter(aa);

        RecyclerView recyclerView = view.findViewById(R.id.policyRenewalRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));  // Use getContext() here

        // Populate the ArrayList with data
        arrpolicyRenewal.add(new policyRenewalModal(R.drawable.person, "Person 1"));
        arrpolicyRenewal.add(new policyRenewalModal(R.drawable.person, "Person 2"));
        arrpolicyRenewal.add(new policyRenewalModal(R.drawable.person, "Person 2"));
        arrpolicyRenewal.add(new policyRenewalModal(R.drawable.person, "Person 2"));
        arrpolicyRenewal.add(new policyRenewalModal(R.drawable.person, "Person 2"));
        arrpolicyRenewal.add(new policyRenewalModal(R.drawable.person, "Person 2"));
        arrpolicyRenewal.add(new policyRenewalModal(R.drawable.person, "Person 2"));
        arrpolicyRenewal.add(new policyRenewalModal(R.drawable.person, "Person 2"));
        arrpolicyRenewal.add(new policyRenewalModal(R.drawable.person, "Person 2"));
        arrpolicyRenewal.add(new policyRenewalModal(R.drawable.person, "Person 2"));
        arrpolicyRenewal.add(new policyRenewalModal(R.drawable.person, "Person 2"));
        arrpolicyRenewal.add(new policyRenewalModal(R.drawable.person, "Person 2"));
        arrpolicyRenewal.add(new policyRenewalModal(R.drawable.person, "Person 2"));
        arrpolicyRenewal.add(new policyRenewalModal(R.drawable.person, "Person 2"));
        arrpolicyRenewal.add(new policyRenewalModal(R.drawable.person, "Person 2"));
        arrpolicyRenewal.add(new policyRenewalModal(R.drawable.person, "Person 2"));
        arrpolicyRenewal.add(new policyRenewalModal(R.drawable.person, "Person 2"));
        arrpolicyRenewal.add(new policyRenewalModal(R.drawable.person, "Person 2"));
        arrpolicyRenewal.add(new policyRenewalModal(R.drawable.person, "Person 2"));
        arrpolicyRenewal.add(new policyRenewalModal(R.drawable.person, "Person 2"));

        // Add more items as needed

        // Initialize the adapter with the context and data list
        recyclerPolicyRenewalAdapter adapter = new recyclerPolicyRenewalAdapter(getContext(), arrpolicyRenewal);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // Show a toast message with the selected item
        if(position>0){
            Toast.makeText(getContext(),"Sorted By " + sortBy[position], Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        // Handle case when no item is selected (optional)
    }


}
