package com.andro.anant.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends android.app.Activity{

    float fVal,sVal;
    boolean Plus,Minus,Mul,Div;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        final TextView tv1 = findViewById(R.id.tv1);
        Button b0 = findViewById(R.id.b0);
        Button b1 = findViewById(R.id.b1);
        Button b2 = findViewById(R.id.b2);
        Button b3 = findViewById(R.id.b3);
        Button b4 = findViewById(R.id.b4);
        Button b5 = findViewById(R.id.b5);
        Button b6 = findViewById(R.id.b6);
        Button b7 = findViewById(R.id.b7);
        Button b8 = findViewById(R.id.b8);
        Button b9 = findViewById(R.id.b9);
        Button bP = findViewById(R.id.bP);
        Button bS = findViewById(R.id.bS);
        Button bM = findViewById(R.id.bM);
        Button bD = findViewById(R.id.bD);
        Button bDot = findViewById(R.id.bDot);
        Button bDel = findViewById(R.id.bDel);
        Button bC   = findViewById(R.id.bC);
        Button bEq  = findViewById(R.id.bEq);

        bDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText() + ".");
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View v) {
           tv1.setText(tv1.getText()+"0");
       }
   });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText()+"3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText()+"4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText()+"5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText()+"6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText()+"9");
            }
        });

        bP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (tv1 == null) {
                    tv1.setText("");
                } else {
                    fVal = Float.parseFloat(tv1.getText() + "");
                    Plus = true;
                    tv1.setText(null);
                }
                }

        });

        bS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fVal = Float.parseFloat(tv1.getText() + "");
                Minus = true;
                tv1.setText(null);
            }
        });

        bD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fVal = Float.parseFloat(tv1.getText() + "");
                Div = true;
                tv1.setText(null);


            }
        });
        bM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fVal = Float.parseFloat(tv1.getText() + "");
                Mul = true;
                tv1.setText(null);
            }
        });

        bEq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sVal = Float.parseFloat(tv1.getText() + "");

                if (Plus == true) {
                    tv1.setText(fVal + sVal + "");
                    Plus = false;
                }

                if (Minus == true) {
                    tv1.setText(fVal - sVal + "");
                    Minus = false;
                }

                if (Mul == true) {
                    tv1.setText(fVal * sVal + "");
                    Mul = false;
                }

                if (Div == true) {
                    tv1.setText(fVal / sVal + "");
                    Div = false;
                }

            }
        });

        bC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText("");
            }
        });

    }
}