package com.example.temelkomutlarunite_3;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg1Activity extends AppCompatActivity {
    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg1);



        main();

    }
        protected void  main(){
             boolean degisken1 = true;
             boolean degisken2 = false;
             System.out.println("Değişken Değeri:" + degisken1);
             System.out.println("Değişken Değeri:" + degisken2);

        }

}
