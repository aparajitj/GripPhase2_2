package com.example.gripphase2;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.firebase.auth.FirebaseAuth;

import org.json.JSONObject;

public class Per_D extends AppCompatActivity {
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_per__d);
        String url = "139.59.65.145:9090/test";
        String input="PUT";

        progressDialog = new ProgressDialog(this);
        RequestQueue rq = Volley.newRequestQueue(this);
        JSONObject X= new JSONObject();
        JsonObjectRequest obj_req= new JsonObjectRequest(
                Request.Method.GET,
                url,
                null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }
        );
        rq.add(obj_req);
    }

    public void save(View v){
        Toast.makeText(Per_D.this,"Saved",Toast.LENGTH_SHORT).show();
    }
}
