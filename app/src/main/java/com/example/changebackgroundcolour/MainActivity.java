package com.example.changebackgroundcolour;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,youtube,instagram,play,telegram,insta2,insta3,insta4,whatsapp;
    MediaPlayer mysong,mysong1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Resources");
        mysong = MediaPlayer.create(MainActivity.this,R.raw.audio);
        mysong1 = MediaPlayer.create(MainActivity.this,R.raw.audio1);






        final Button b1=(Button)findViewById(R.id.btnRed);
        final Button b8=(Button)findViewById(R.id.btnviolet);
        final Button b7=(Button)findViewById(R.id.btnwhite);
        final Button b2=(Button)findViewById(R.id.btnBlue);
        final Button b3=(Button)findViewById(R.id.btnPink);
        final Button b4=(Button)findViewById(R.id.btnGreen);
        final Button b5=(Button)findViewById(R.id.btnOrange);
        final Button b6=(Button)findViewById(R.id.btnYellow);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setMyScreencolor(0x00000000);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setMyScreencolor(0xFFADD8E6);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setMyScreencolor(0xFFFFC0CB);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setMyScreencolor(0xFF8A2BE2);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setMyScreencolor(0xffffffff);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setMyScreencolor(0xFF9ACD32);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setMyScreencolor(0xFFFF7F50);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setMyScreencolor(0xFFD3D3D3);
            }
        });

    }
    public void setMyScreencolor(int color){
        View view=this.getWindow().getDecorView();
        view.setBackgroundColor(color);

        b1=(Button)findViewById(R.id.btnAboutus);
        b2=(Button)findViewById(R.id.btnContactus);
        b3=(Button)findViewById(R.id.btnintro);
        b4=(Button)findViewById(R.id.btnanshu);
        play=(Button)findViewById(R.id.btnplay);
        youtube=(Button)findViewById(R.id.youtube);
        instagram=(Button)findViewById(R.id.instagram);
        telegram=(Button)findViewById(R.id.telegram);
        insta2=(Button)findViewById(R.id.insta2);
        insta3=(Button)findViewById(R.id.insta3);
        insta4=(Button)findViewById(R.id.insta4);
        whatsapp=(Button)findViewById(R.id.whatsapp);



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1=new Intent(MainActivity.this,AboutUs.class);
                startActivity(in1);
            }
        });


        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1=new Intent(MainActivity.this,MainActivity3.class);
                startActivity(in1);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(in1);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1=new Intent(MainActivity.this,ContactUs.class);
                startActivity(in1);
            }
        });
        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://youtube.com/channel/UCITJ5gmNyFmclL3MMThYe9Q");
            }
        });
        whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://chat.whatsapp.com/L9yHXdVlwsEDmPNiGMATEM");
            }
        });
        telegram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://t.me/dsamaterials");
            }
        });
        insta2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://docs.google.com/spreadsheets/d/1WUhD88kVvlhdpEyvt7vOmYtRalAI41Ey8lC7KUZTgGc/edit?usp=sharing");
            }
        });
        insta3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://t.me/joinchat/Tlb4lSRYO-VkMzll");
            }
        });
        insta4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://anshu12344321.blogspot.com/2021/10/course-structure-for-b.html");
            }
        });
        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.instagram.com/invites/contact/?i=1lt1vo9m8sruj&utm_content=5vt0sxy");
            }
        });

    }


    private void gotoUrl(String s) {

        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

    public void playIT(View view) {
        mysong.start();
    }

    public void playIT2(View view) {
        mysong1.start();
    }
}