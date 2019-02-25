package com.prophet.ytstorrent.bookmarks;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.prophet.ytstorrent.MainActivity;
import com.prophet.ytstorrent.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class BookmarksFragment extends Fragment {


    public BookmarksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ((MainActivity)getActivity()).setActionBarTitle("Bookmarks");
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bookmarks, container, false);
    }

}
