package com.example.abhishek.eatfirst2;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.anantmehra.eatfirst2.R;

import java.util.Timer;
import java.util.TimerTask;

public class Main4Activity extends AppCompatActivity {
    ViewPager viewPager;
    Integer[]image={R.drawable.pizza3,R.drawable.pizza4,R.drawable.pizza5,R.drawable.pizza6};
    TextView m_response;
    static cart m_cart;

    String t,p,q,p2,q2,p3,q3,p4,q4,p5,q5,p6,q6,p7,q7,p8,q8,p10,q10,text14,em;

    int counter=0;
    int counter1=0;
    int counter2=0;
    int counter3=0;
    int counter4=0;
    int counter5=0;
    int counter6=0;
    int counter7=0;
    int counter8=0;

    int o=0, o1=0,o2=0,o3=0,o4=0,o5=0,o6=0,o7=0,o8=0,o9=0,nn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        final Button button=(Button)findViewById(R.id.button);
        final TextView item_1=(TextView)findViewById(R.id.text1);
        final TextView item_14=(TextView)findViewById(R.id.text14);



        final Button button2=(Button)findViewById(R.id.button2);
        final Button button3=(Button)findViewById(R.id.button3);
        final Button button4=(Button)findViewById(R.id.button4);
        final Button button5=(Button)findViewById(R.id.button5);
        final Button button6=(Button)findViewById(R.id.button6);
        final Button button7=(Button)findViewById(R.id.button7);
        final Button button8=(Button)findViewById(R.id.button8);
        final Button button9=(Button)findViewById(R.id.button9);


        final TextView item_2=(TextView)findViewById(R.id.text2);
        final TextView item_15=(TextView)findViewById(R.id.text15);
        final TextView item_3=(TextView)findViewById(R.id.text3);
        final TextView item_16=(TextView)findViewById(R.id.text16);
        final TextView item_4=(TextView)findViewById(R.id.text4);
        final TextView item_17=(TextView)findViewById(R.id.text17);
        final TextView item_5=(TextView)findViewById(R.id.text5);
        final TextView item_18=(TextView)findViewById(R.id.text18);
        final TextView item_6=(TextView)findViewById(R.id.text6);
        final TextView item_19=(TextView)findViewById(R.id.text19);
        final TextView item_7=(TextView)findViewById(R.id.text7);
        final TextView item_20=(TextView)findViewById(R.id.text20);
        final TextView item_8=(TextView)findViewById(R.id.text8);
        final TextView item_21=(TextView)findViewById(R.id.text21);
        final TextView item_10=(TextView)findViewById(R.id.text9);
        final TextView item_23=(TextView)findViewById(R.id.text22);

        m_response=(TextView)findViewById(R.id.m_response);


        Intent j=getIntent();
        em=j.getExtras().getString("b");





        viewPager=(ViewPager)findViewById(R.id.viewPager1);
        mypage my=new mypage();
        viewPager.setAdapter(my);

        final Button cart=(Button)findViewById(R.id.button1);

        {
            final Intent button11=new Intent(this,pizza1.class);
            p=item_1.getText().toString();
            q=item_14.getText().toString();


            p2=item_2.getText().toString();
            q2=item_15.getText().toString();

            p3=item_3.getText().toString();
            q3=item_16.getText().toString();

            p4=item_4.getText().toString();
            q4=item_17.getText().toString();
            p5=item_5.getText().toString();
            q5=item_18.getText().toString();

            p6=item_6.getText().toString();
            q6=item_19.getText().toString();

            p7=item_7.getText().toString();
            q7=item_20.getText().toString();

            p8=item_8.getText().toString();
            q8=item_21.getText().toString();

            p10=item_10.getText().toString();
            q10=item_23.getText().toString();





            button.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {

                    o=o+1;
                    if(o!=0){
                        nn=149*o+340*o1+340*o2+425*o3+490*o4+340*o5+480*o6+525*o7+219*o8;
                        m_response.setText(Integer.toString(nn));
                        button11.putExtra("a",p);
                        button11.putExtra("b",q);
                        String pl=""+o;
                        button11.putExtra("c",pl);
                        counter++;
                        button.setText("Add :" + String.valueOf(counter));

                    }




                }
            });



            button2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {

                    o1=o1+1;
                    if(o1!=0){
                        nn=149*o+340*o1+340*o2+425*o3+490*o4+340*o5+480*o6+525*o7+219*o8;
                        m_response.setText(Integer.toString(nn));
                        button11.putExtra("d",p2);
                        button11.putExtra("e",q2);
                        String pa=""+o1;
                        button11.putExtra("f",pa);
                        counter1++;
                        button2.setText("Add :" + String.valueOf(counter1));

                    }

                }
            });
            button3.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {

                    o2=o2+1;
                    if(o2!=0){
                        nn=149*o+340*o1+340*o2+425*o3+490*o4+340*o5+480*o6+525*o7+219*o8;
                        m_response.setText(Integer.toString(nn));
                        button11.putExtra("g",p3);
                        button11.putExtra("h",q3);
                        String ps=""+o2;
                        button11.putExtra("i",ps);
                        counter2++;
                        button3.setText("Add :" + String.valueOf(counter2));

                    }

                }
            });
            button4.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {

                    o3=o3+1;
                    if(o3!=0){
                        nn=149*o+340*o1+340*o2+425*o3+490*o4+340*o5+480*o6+525*o7+219*o8;
                        m_response.setText(Integer.toString(nn));
                        button11.putExtra("j",p4);
                        button11.putExtra("k",q4);
                        String pw=""+o3;
                        button11.putExtra("l",pw);
                        counter3++;
                        button4.setText("Add :" + String.valueOf(counter3));

                    }

                }
            });
            button5.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {

                    o4=o4+1;
                    if(o4!=0){
                        nn=149*o+340*o1+340*o2+425*o3+490*o4+340*o5+480*o6+525*o7+219*o8;
                        m_response.setText(Integer.toString(nn));
                        button11.putExtra("m",p5);
                        button11.putExtra("n",q5);
                        String pt=""+o4;
                        button11.putExtra("o",pt);
                        counter4++;
                        button5.setText("Add :" + String.valueOf(counter4));

                    }

                }
            });
            button6.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {

                    o5=o5+1;
                    if(o5!=0){
                        nn=149*o+340*o1+340*o2+425*o3+490*o4+340*o5+480*o6+525*o7+219*o8;
                        m_response.setText(Integer.toString(nn));
                        button11.putExtra("p",p6);
                        button11.putExtra("q",q6);
                        String pi=""+o5;
                        button11.putExtra("r",pi);
                        counter5++;
                        button6.setText("Add :" + String.valueOf(counter5));

                    }

                }
            });

            button7.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {

                    o6=o6+1;
                    if(o6!=0){
                        nn=149*o+340*o1+340*o2+425*o3+490*o4+340*o5+480*o6+525*o7+219*o8;
                        m_response.setText(Integer.toString(nn));
                        button11.putExtra("s",p7);
                        button11.putExtra("t",q7);
                        String pii=""+o6;
                        button11.putExtra("u",pii);
                        counter6++;
                        button7.setText("Add :" + String.valueOf(counter6));


                    }

                }
            });

            button8.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {

                    o7=o7+1;
                    if(o7!=0){
                        nn=149*o+340*o1+340*o2+425*o3+490*o4+340*o5+480*o6+525*o7+219*o8;
                        m_response.setText(Integer.toString(nn));
                        button11.putExtra("v",p8);
                        button11.putExtra("w",q8);
                        String pk=""+o7;
                        button11.putExtra("x",pk);
                        counter7++;
                        button8.setText("Add :" + String.valueOf(counter7));
                    }

                }
            });

            button9.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {

                    o8=o8+1;
                    if(o8!=0){
                        nn=149*o+340*o1+340*o2+425*o3+490*o4+340*o5+480*o6+525*o7+219*o8;
                        m_response.setText(Integer.toString(nn));
                        button11.putExtra("y",p10);
                        button11.putExtra("z",q10);
                        String pj=""+o8;
                        button11.putExtra("aa",pj);
                        counter8++;
                        button9.setText("Add :" + String.valueOf(counter8));


                    }

                }
            });





            cart.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    t=m_response.getText().toString();
                    button11.putExtra("a1",t);
                    button11.putExtra("ttt",em);
                    startActivity(button11);
                }
            });



        }








        Timer time=new Timer();
        time.scheduleAtFixedRate(new mytime(),2500,2500);


        Button call_pizza = (Button) findViewById(R.id.call_pizza);


        call_pizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pizza = new Intent(Intent.ACTION_CALL);
                pizza.setData(Uri.parse("tel:9811140804"));



                if (ActivityCompat.checkSelfPermission(v.getContext(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    Toast.makeText(getApplicationContext(), "Please grant permission to call", Toast.LENGTH_LONG).show();
                    requestPermission();
                }
                else {
                    startActivity(pizza);


                }
            }
        });
    }


    private void requestPermission() {

        ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.CALL_PHONE},1);
    }

    public class mypage extends PagerAdapter {
        @Override
        public int getCount() {
            return image.length;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return (view == object);
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            LayoutInflater layout = (LayoutInflater) Main4Activity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View item = layout.inflate(R.layout.swipe, null);
            //View item = layout.inflate(R.layout.swipe,container,false);
            ImageView image1 = (ImageView) item.findViewById(R.id.imageView);

            image1.setImageResource(image[position]);

            ViewPager v = (ViewPager) container;
            v.addView(item, 0);
            return item;


        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            ViewPager v = (ViewPager) container;
            View view = (View) object;
            v.removeView(view);
        }

    }


    public class mytime extends TimerTask {
        @Override
        public void run() {
            Main4Activity.this.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    if (viewPager.getCurrentItem()==0){
                        viewPager.setCurrentItem(1);
                    }
                    else if(viewPager.getCurrentItem()==1){
                        viewPager.setCurrentItem(2);
                    }
                    else if(viewPager.getCurrentItem()==2){
                        viewPager.setCurrentItem(3);
                    }

                    else if(viewPager.getCurrentItem()==3){
                        viewPager.setCurrentItem(0);
                    }


                }
            });

        }
    }
}
