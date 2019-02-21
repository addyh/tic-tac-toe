package com.example.addison.tictactoe;

import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.app.ActionBar.LayoutParams;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ViewSwitcher;
import android.widget.ViewSwitcher.ViewFactory;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class MainActivity extends AppCompatActivity {

    private String whosTurn = "x";
    private ImageSwitcher[] sw;
    private Button b1,b2;
    public int i,j;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sw = new ImageSwitcher[]{
                (ImageSwitcher) findViewById(R.id.imageSwitcher1),
                (ImageSwitcher) findViewById(R.id.imageSwitcher2),
                (ImageSwitcher) findViewById(R.id.imageSwitcher3),
                (ImageSwitcher) findViewById(R.id.imageSwitcher4),
                (ImageSwitcher) findViewById(R.id.imageSwitcher5),
                (ImageSwitcher) findViewById(R.id.imageSwitcher6),
                (ImageSwitcher) findViewById(R.id.imageSwitcher7),
                (ImageSwitcher) findViewById(R.id.imageSwitcher8),
                (ImageSwitcher) findViewById(R.id.imageSwitcher9)};

        for (j = 0; j < 9; j++) {
            sw[j].setFactory(new ViewSwitcher.ViewFactory() {
                @Override
                public View makeView() {
                    ImageView myView = new ImageView(getApplicationContext());
                    myView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    myView.setLayoutParams(new
                            ImageSwitcher.LayoutParams(ActionBar.LayoutParams.WRAP_CONTENT,
                            ActionBar.LayoutParams.WRAP_CONTENT));
                    return myView;
                }
            });
        }


            sw[0].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (whosTurn.equals("x")) {
                        sw[0].setImageResource(R.drawable.x);
                        whosTurn = "o";
                    } else if (whosTurn.equals("o")) {
                        sw[0].setImageResource(R.drawable.o);
                        whosTurn = "x";
                    }
                }
            });
            sw[1].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (whosTurn.equals("x")) {
                        sw[1].setImageResource(R.drawable.x);
                        whosTurn = "o";
                    } else if (whosTurn.equals("o")) {
                        sw[1].setImageResource(R.drawable.o);
                        whosTurn = "x";
                    }
                }
            });
            sw[2].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (whosTurn.equals("x")) {
                        sw[2].setImageResource(R.drawable.x);
                        whosTurn = "o";
                    } else if (whosTurn.equals("o")) {
                        sw[2].setImageResource(R.drawable.o);
                        whosTurn = "x";
                    }
                }
            });
            sw[3].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (whosTurn.equals("x")) {
                        sw[3].setImageResource(R.drawable.x);
                        whosTurn = "o";
                    } else if (whosTurn.equals("o")) {
                        sw[3].setImageResource(R.drawable.o);
                        whosTurn = "x";
                    }
                }
            });
            sw[4].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (whosTurn.equals("x")) {
                        sw[4].setImageResource(R.drawable.x);
                        whosTurn = "o";
                    } else if (whosTurn.equals("o")) {
                        sw[4].setImageResource(R.drawable.o);
                        whosTurn = "x";
                    }
                }
            });
            sw[5].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (whosTurn.equals("x")) {
                        sw[5].setImageResource(R.drawable.x);
                        whosTurn = "o";
                    } else if (whosTurn.equals("o")) {
                        sw[5].setImageResource(R.drawable.o);
                        whosTurn = "x";
                    }
                }
            });
            sw[6].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (whosTurn.equals("x")) {
                        sw[6].setImageResource(R.drawable.x);
                        whosTurn = "o";
                    } else if (whosTurn.equals("o")) {
                        sw[6].setImageResource(R.drawable.o);
                        whosTurn = "x";
                    }
                }
            });
            sw[7].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (whosTurn.equals("x")) {
                        sw[7].setImageResource(R.drawable.x);
                        whosTurn = "o";
                    } else if (whosTurn.equals("o")) {
                        sw[7].setImageResource(R.drawable.o);
                        whosTurn = "x";
                    }
                }
            });
            sw[8].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (whosTurn.equals("x")) {
                        sw[8].setImageResource(R.drawable.x);
                        whosTurn = "o";
                    } else if (whosTurn.equals("o")) {
                        sw[8].setImageResource(R.drawable.o);
                        whosTurn = "x";
                    }
                }
            });



    }

}
