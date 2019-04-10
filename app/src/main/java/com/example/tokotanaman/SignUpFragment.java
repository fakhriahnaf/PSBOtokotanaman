package com.example.tokotanaman;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class SignUpFragment extends AppCompatActivity {

    public SignUpFragment() {

    }

    private TextView alreadyHaveAnAccount;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View view inflater.inflate(R.layout.Fragment_sign_up, container, attachToRoot false);
        alreadyHaveAnAccount = view.findViewById(R.id.tv_already_have_an_account);
        return view;
    }

    @Override
    public void onViewCreated()

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_fragment);
    }
}
