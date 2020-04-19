package com.ex.autodetailing;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.firebase.ui.database.FirebaseRecyclerOptions;

/**
 * A simple {@link Fragment} subclass.
 */
public class BuyFragment extends Fragment {
   private View ProductssView;
   private RecyclerView myProductList;
    public BuyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       return inflater.inflate(R.layout.fragment_slideshow, container, false);

       myContactsList =(RecyclerView) ContactsView.findViewById(R.id.contacts_list);
       myContactsList.setLayoutManager(new LinearLayoutManager(getContext()));

   return  ContactsView;
    }

    @Override
    public void onStart() {
        super.onStart();

        FirebaseRecyclerOptions options =
                new FirebaseRecyclerOptions.Builder<>()
    }
}

