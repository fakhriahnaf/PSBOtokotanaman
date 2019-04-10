package com.example.tokotanaman;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

public class SignInFragment extends Fragment {

    public SignInFragment(){
        //require empety public construktor
    }

    private TextView dontHaveAnAcoount;
    private FrameLayout parentFrameLayout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View view =  inflater.inflate(R.layout.activity_sign_in_fragment, container, false);
        dontHaveAnAcoount = view.findViewById(R.id.tv_dont_have_an_account);
        parentFrameLayout = getActivity().findViewById(R.id.);
        return view;
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        dontHaveAnAcoount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setFragment(new SignUpFragment());
            }
        });
    }

            private void setFragment(Fragment fragment) {
                FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
                FragmentTransaction.setCustomAnimations(R.anim.slide_from_right,R.anim.slideout_from_right);
                FragmentTransaction.replace(parentFrameLayout.getId(),fragment);
                FragmentTransaction.comit();
            }
