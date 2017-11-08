package accusilicon.com.lifecycle;


import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {
    private static final String TAG = "BlankFragment";

    public BlankFragment() {
        // Required empty public constructor
        Log.d(TAG, "BlankFragment: "  + hashCode());
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.d(TAG, "onCreateView: "  + hashCode());
        return inflater.inflate(R.layout.fragment_blank, container, false);
    }

    @Override
    public void onHiddenChanged(boolean hidden) {
        Log.d(TAG, "onHiddenChanged: "  + hashCode());
        super.onHiddenChanged(hidden);
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        Log.d(TAG, "setUserVisibleHint: "  + hashCode() + isVisibleToUser);
        super.setUserVisibleHint(isVisibleToUser);
    }

    @Override
    public LayoutInflater onGetLayoutInflater(Bundle savedInstanceState) {
        Log.d(TAG, "onGetLayoutInflater: "  + hashCode());
        return super.onGetLayoutInflater(savedInstanceState);
    }

    @Override
    public void onInflate(Context context, AttributeSet attrs, Bundle savedInstanceState) {
        Log.d(TAG, "onInflate: "  + hashCode());
        super.onInflate(context, attrs, savedInstanceState);
    }

    @Override
    public void onAttachFragment(Fragment childFragment) {
        Log.d(TAG, "onAttachFragment: "  + hashCode());
        super.onAttachFragment(childFragment);
    }

    @Override
    public void onAttach(Context context) {
        Log.d(TAG, "onAttach: "  + hashCode());
        super.onAttach(context);
    }

    @Override
    public Animation onCreateAnimation(int transit, boolean enter, int nextAnim) {
        Log.d(TAG, "onCreateAnimation: "  + hashCode());
        return super.onCreateAnimation(transit, enter, nextAnim);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Log.d(TAG, "onCreate: "  + hashCode());
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        Log.d(TAG, "onViewCreated: "  + hashCode());
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        Log.d(TAG, "onActivityCreated: "  + hashCode());
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        Log.d(TAG, "onViewStateRestored: "  + hashCode());
        super.onViewStateRestored(savedInstanceState);
    }

    @Override
    public void onStart() {
        Log.d(TAG, "onStart: "  + hashCode());
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.d(TAG, "onResume: "  + hashCode());
        super.onResume();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        Log.d(TAG, "onSaveInstanceState: "  + hashCode());
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        Log.d(TAG, "onConfigurationChanged: "  + hashCode());
        super.onConfigurationChanged(newConfig);
    }

    @Override
    public void onPause() {
        Log.d(TAG, "onPause: "  + hashCode());
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.d(TAG, "onStop: "  + hashCode());
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        Log.d(TAG, "onDestroyView: "  + hashCode());
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.d(TAG, "onDestroy: "  + hashCode());
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Log.d(TAG, "onDetach: "  + hashCode());
        super.onDetach();
    }
}
