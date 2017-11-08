package accusilicon.com.lifecycle;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;

public class SecondActivity extends AppCompatActivity {
    private static final String TAG = "SecondActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate: "  + hashCode());
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        Log.d(TAG, "onPostCreate: "  + hashCode());
        super.onPostCreate(savedInstanceState);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        Log.d(TAG, "onConfigurationChanged: "  + hashCode());
        super.onConfigurationChanged(newConfig);
    }

    @Override
    protected void onResume() {
        Log.d(TAG, "onResume: "  + hashCode());
        super.onResume();
    }

    @Override
    protected void onRestart() {
        Log.d(TAG, "onRestart: "  + hashCode());
        super.onRestart();
    }

    @Override
    protected void onPostResume() {
        Log.d(TAG, "onPostResume: "  + hashCode());
        super.onPostResume();
    }

    @Override
    protected void onStart() {
        Log.d(TAG, "onStart: "  + hashCode());
        super.onStart();
    }

    @Override
    protected void onStop() {
        Log.d(TAG, "onStop: "  + hashCode());
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "onDestroy: "  + hashCode());
        super.onDestroy();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        Log.d(TAG, "onCreate: 2 args "  + hashCode());
        super.onCreate(savedInstanceState, persistentState);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        Log.d(TAG, "onSaveInstanceState: 1 arg "  + hashCode());
        super.onSaveInstanceState(outState);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            Log.d(TAG, "onKeyDown: back "  + hashCode() + event.getAction());
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public void onBackPressed() {
        Log.d(TAG, "onBackPressed: "  + hashCode());
        super.onBackPressed();
    }

    @Override
    protected void onPause() {
        Log.d(TAG, "onPause: "  + hashCode());
        super.onPause();
    }

    @Override
    protected void onResumeFragments() {
        Log.d(TAG, "onResumeFragments: "  + hashCode());
        super.onResumeFragments();
    }

    @Override
    public void onAttachFragment(Fragment fragment) {
        Log.d(TAG, "onAttachFragment: v4 fragment "  + hashCode() + fragment.toString());
        super.onAttachFragment(fragment);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        Log.d(TAG, "onRestoreInstanceState: 1 arg "  + hashCode());
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState, PersistableBundle persistentState) {
        Log.d(TAG, "onRestoreInstanceState: 2 args "  + hashCode());
        super.onRestoreInstanceState(savedInstanceState, persistentState);
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        Log.d(TAG, "onSaveInstanceState: 2 args "  + hashCode());
        super.onSaveInstanceState(outState, outPersistentState);
    }

    @Override
    public void onAttachFragment(android.app.Fragment fragment) {
        Log.d(TAG, "onAttachFragment: app fragment "   + hashCode()+ fragment.toString());
        super.onAttachFragment(fragment);
    }

    @Override
    public void onAttachedToWindow() {
        Log.d(TAG, "onAttachedToWindow: "  + hashCode());
        super.onAttachedToWindow();
    }

    @Override
    public void onDetachedFromWindow() {
        Log.d(TAG, "onDetachedFromWindow: "  + hashCode());
        super.onDetachedFromWindow();
    }

    @Override
    protected void onNewIntent(Intent intent) {
        Log.d(TAG, "onNewIntent: "  + hashCode());
        super.onNewIntent(intent);
    }

    public void standard(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void standardS(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    public void singleTop(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(intent);
    }

    public void singleTopS(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(intent);
    }

    public void clearTop(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }

    public void clearTopS(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }

    public void singleTask(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_BROUGHT_TO_FRONT);
        startActivity(intent);
    }

    public void singleTaskS(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_BROUGHT_TO_FRONT);
        startActivity(intent);
    }

    public void reloadFragment(View view) {
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.fragment_container, new BlankFragment()).commit();
    }
}
