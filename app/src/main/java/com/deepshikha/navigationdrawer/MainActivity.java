package com.deepshikha.navigationdrawer;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import android.webkit.DownloadListener;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.Toast;

import static java.util.logging.Logger.global;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.ads.reward.AdMetadataListener;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.internal.ads.zzajz;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.FrameLayout;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.annotation.SuppressLint;
import android.app.DownloadManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.Toast;

import static java.util.logging.Logger.global;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.webkit.DownloadListener;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity<activity> extends AppCompatActivity {


    private InterstitialAd mInterstitialAd;
    private InterstitialAd interstitial;
    ArrayList<Model_country> al_main = new ArrayList<>();
    ExpandableListView ev_list;
    CountryAdapter obj_adapter;
    String TAG = "MainActivity";
    private DrawerLayout mDrawerLayout;
    HomeFragment fragment;
    TextView tv_name;
    RelativeLayout rl_menu;
    private RewardedVideoAd mAd;
    private RewardedVideoAd mRewardedVideoAd;
    String orientation;
    int value;
    TextView mLog;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MobileAds.initialize(this,"ca-app-pub-8861439710066954~8563997219");
//inicio admob



        //MobileAds.initialize(this,"ca-app-pub-3940256099942544~3347511713");


        /*

        prepareAd();
        ScheduledExecutorService scheduler =
                Executors.newSingleThreadScheduledExecutor();
        scheduler.scheduleAtFixedRate(new Runnable() {

            public void run() {
                Log.i("hello", "world");
                runOnUiThread(new Runnable() {
                    public void run() {
                        if (mInterstitialAd.isLoaded()) {
                            mInterstitialAd.show();
                        } else {
                            Log.d("TAG"," Interstitial not loaded");
                        }

                        prepareAd();


                    }
                });

            }
        }, 10, 180, TimeUnit.SECONDS);
*/
//fim admob


      //  fn_data();
     //   init();
/*
        value = this.getResources().getConfiguration().orientation;

        if (value == Configuration.ORIENTATION_PORTRAIT) {

            showRewardedVideoAd();
        }

        if (value == Configuration.ORIENTATION_LANDSCAPE) {

            orientation = "Landscape";
            Toast.makeText(MainActivity.this, orientation, Toast.LENGTH_LONG).show();
        }*/

        fn_data();
        init();
        showRewardedVideoAd();



    }


// Initialize the Mobile Ads SDK





    private void init() {

        getSupportActionBar().hide();
        ev_list = (ExpandableListView) findViewById(R.id.ev_menu);
        tv_name = (TextView) findViewById(R.id.tv_name);
        rl_menu = (RelativeLayout) findViewById(R.id.rl_menu);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        obj_adapter = new CountryAdapter(MainActivity.this, al_main);
        ev_list.setAdapter(obj_adapter);
        ev_list.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {

            @Override
            public boolean onGroupClick(ExpandableListView parent, View v,
                                        int groupPosition, long id) {
                setListViewHeight(parent, groupPosition);
                return false;
            }
        });

        setExpandableListViewHeightBasedOnChildren(ev_list);

        fragment = new HomeFragment();
        Bundle bundle = new Bundle();
        bundle.putString("name", al_main.get(0).getStr_country());
        bundle.putString("des", al_main.get(0).getAl_state().get(0).getStr_description());
        bundle.putString("dish", al_main.get(0).getAl_state().get(0).getStr_name());
        bundle.putString("image", al_main.get(0).getAl_state().get(0).getStr_image());
        tv_name.setText(al_main.get(0).getStr_country());

        fragment.setArguments(bundle);
        getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, fragment, "HomeFragment").addToBackStack("null").commit();


        rl_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDrawerLayout.openDrawer(Gravity.LEFT);
            }
        });
    }

    private void setListViewHeight(ExpandableListView listView, int group) {
        ExpandableListAdapter listAdapter = (ExpandableListAdapter) listView.getExpandableListAdapter();
        int totalHeight = 0;
        int desiredWidth = View.MeasureSpec.makeMeasureSpec(listView.getWidth(),
                View.MeasureSpec.EXACTLY);
        for (int i = 0; i < listAdapter.getGroupCount(); i++) {
            View groupItem = listAdapter.getGroupView(i, false, null, listView);
            groupItem.measure(desiredWidth, View.MeasureSpec.UNSPECIFIED);

            totalHeight += groupItem.getMeasuredHeight();

            if (((listView.isGroupExpanded(i)) && (i != group))
                    || ((!listView.isGroupExpanded(i)) && (i == group))) {
                for (int j = 0; j < listAdapter.getChildrenCount(i); j++) {
                    View listItem = listAdapter.getChildView(i, j, false, null,
                            listView);
                    listItem.measure(desiredWidth, View.MeasureSpec.UNSPECIFIED);

                    totalHeight += listItem.getMeasuredHeight();

                }
            }
        }

        ViewGroup.LayoutParams params = listView.getLayoutParams();
        int height = totalHeight
                + (listView.getDividerHeight() * (listAdapter.getGroupCount() - 1));
       /* if (height < 10)
            height = 200;*/
        params.height = height;
        listView.setLayoutParams(params);
        listView.requestLayout();

    }

    private void fn_data() {

        String str_data = loadJSONFromAsset();

        try {
            JSONObject jsonObject_country = new JSONObject(str_data);
            JSONArray jsonArray_country = jsonObject_country.getJSONArray("country");
            al_main = new ArrayList<>();
            for (int i = 0; i < jsonArray_country.length(); i++) {
                Model_country obj_country = new Model_country();
                JSONObject jsonObject = jsonArray_country.getJSONObject(i);
                JSONArray jsonArray_dishes = jsonObject.getJSONArray("dishes");
                ArrayList<Model_Dish> al_dishes = new ArrayList<>();
                for (int j = 0; j < jsonArray_dishes.length(); j++) {

                    JSONObject jsonObject_dishes = jsonArray_dishes.getJSONObject(j);
                    Model_Dish obj_dish = new Model_Dish();
                    obj_dish.setStr_name(jsonObject_dishes.getString("dishname"));
                    obj_dish.setStr_description(jsonObject_dishes.getString("description"));
                    obj_dish.setStr_image(jsonObject_dishes.getString("image"));
                    al_dishes.add(obj_dish);
                }

                obj_country.setAl_state(al_dishes);
                obj_country.setStr_country(jsonObject.getString("name"));

                al_main.add(obj_country);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }

    public static void setExpandableListViewHeightBasedOnChildren(ExpandableListView expandableListView) {
        CountryAdapter adapter = (CountryAdapter) expandableListView.getExpandableListAdapter();
        if (adapter == null) {
            return;
        }
        int totalHeight = expandableListView.getPaddingTop() + expandableListView.getPaddingBottom();
        for (int i = 0; i < adapter.getGroupCount(); i++) {
            View groupItem = adapter.getGroupView(i, false, null, expandableListView);
            groupItem.measure(View.MeasureSpec.UNSPECIFIED, View.MeasureSpec.UNSPECIFIED);
            totalHeight += groupItem.getMeasuredHeight();

            if (expandableListView.isGroupExpanded(i)) {
                for (int j = 0; j < adapter.getChildrenCount(i); j++) {
                    View listItem = adapter.getChildView(i, j, false, null, expandableListView);
                    listItem.setLayoutParams(new ViewGroup.LayoutParams(View.MeasureSpec.UNSPECIFIED, View.MeasureSpec.UNSPECIFIED));
                    listItem.measure(View.MeasureSpec.makeMeasureSpec(0,
                            View.MeasureSpec.UNSPECIFIED), View.MeasureSpec
                            .makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED));
                    totalHeight += listItem.getMeasuredHeight();

                }
            }
        }

        ViewGroup.LayoutParams params = expandableListView.getLayoutParams();
        int height = totalHeight + expandableListView.getDividerHeight() * (adapter.getGroupCount() - 1);

        if (height < 10)
            height = 100;
        params.height = height;
        expandableListView.setLayoutParams(params);
        expandableListView.requestLayout();
    }

    public String loadJSONFromAsset() {
        String json = null;
        try {

            InputStream is = getAssets().open("dishes.json");

            int size = is.available();

            byte[] buffer = new byte[size];

            is.read(buffer);

            is.close();

            json = new String(buffer, "UTF-8");


        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }

        Log.e(TAG, "Json response " + json);
        return json;

    }

    public void fn_selectedPosition(int group, int child) {

        fragment = new HomeFragment();
        Bundle bundle = new Bundle();
        bundle.putString("name", al_main.get(group).getStr_country());
        bundle.putString("des", al_main.get(group).getAl_state().get(child).getStr_description());
        bundle.putString("dish", al_main.get(group).getAl_state().get(child).getStr_name());
        bundle.putString("image", al_main.get(group).getAl_state().get(child).getStr_image());
        fragment.setArguments(bundle);

        getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, fragment, "HomeFragment").addToBackStack("null").commit();
        mDrawerLayout.closeDrawer(Gravity.LEFT);

        tv_name.setText(al_main.get(group).getStr_country());
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        /*
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        } else {
            Log.d("TAG"," Interstitial not loaded");
        }
*/
        finish();
    }


    public void  prepareAd(){

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-8861439710066954/2298929626");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
    }




    private void showRewardedVideoAd () {


        mRewardedVideoAd = MobileAds.getRewardedVideoAdInstance(this);
        //mAd.setRewardedVideoAdListener(this);
        mRewardedVideoAd.loadAd("ca-app-pub-8861439710066954/4541949583", new AdRequest.Builder().build());


        //mAd.show();


        mRewardedVideoAd.setRewardedVideoAdListener(new RewardedVideoAdListener() {

            String assistiu = "NOK";

            @Override
            public void onRewardedVideoAdLoaded() {
                if (mRewardedVideoAd.isLoaded()) {
                    mRewardedVideoAd.show(); //this shows ad immediately
                }
                // mRewardedVideoAd.show();
            }

            @Override
            public void onRewardedVideoAdOpened() {
                //Toast.makeText(MainActivity.this, "Ad Opened", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onRewardedVideoStarted() {
                Toast.makeText(MainActivity.this, "NÃO FECHE A PROPAGANDA PARA LIBERAR AS AULAS!", Toast.LENGTH_LONG).show();
                Toast.makeText(MainActivity.this, "NÃO FECHE A PROPAGANDA PARA LIBERAR AS AULAS!", Toast.LENGTH_LONG).show();
                Toast.makeText(MainActivity.this, "NÃO FECHE A PROPAGANDA PARA LIBERAR AS AULAS!", Toast.LENGTH_LONG).show();

            }

            @Override
            public void onRewardedVideoAdClosed() {
                if (assistiu == "NOK") {
                    Toast.makeText(MainActivity.this, "NÃO FECHE A PROPAGANDA PARA LIBERAR AS AULAS!", Toast.LENGTH_LONG).show();
                    Toast.makeText(MainActivity.this, "NÃO FECHE A PROPAGANDA PARA LIBERAR AS AULAS!", Toast.LENGTH_LONG).show();


                    showRewardedVideoAd();
                }


            }

            @Override
            public void onRewarded(RewardItem rewardItem) {
                assistiu = "OK";
                //Toast.makeText(MainActivity.this, "ganhou premio" + assistiu, Toast.LENGTH_SHORT).show();
                //assistiu = "NOK";

            }

            @Override
            public void onRewardedVideoAdLeftApplication() {
                Toast.makeText(MainActivity.this, assistiu, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onRewardedVideoAdFailedToLoad(int i) {
                Toast.makeText(MainActivity.this, "Precisa de Internet", Toast.LENGTH_SHORT).show();


            }

            @Override
            public void onRewardedVideoCompleted() {
                Toast.makeText(MainActivity.this, "Aulas Liberadas!", Toast.LENGTH_LONG).show();





            }


        });
    }
}
