package com.eni.android.linearlayout;

import android.app.Activity;
import android.os.Bundle;

public class LinearLayoutActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /**
         * 3 Projets differents :
         * 1 - Vue exemple Gravity
         * 2 - vue exemple Poids (meme taille)
         * 3 - vue exemple Poids (taille differente)
         */
     // setContentView(R.layout.gravity);
       setContentView(R.layout.weight_not_same);
      //  setContentView(R.layout.weight);
    }
}