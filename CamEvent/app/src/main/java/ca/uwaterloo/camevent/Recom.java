package ca.uwaterloo.camevent;

/**
 * Created by mactang on 2016-11-17.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Recom extends Fragment {
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "section_number";

    public Recom() {
    }

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static Recom newInstance(int sectionNumber) {
        Recom fragment = new Recom();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_sub_page03, container, false);
        String[] items={"Apple","Banana","Grape"};
        ListView listView=(ListView) rootView.findViewById(R.id.recommlist);


        ArrayAdapter<String> listviewAdapter=new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                items
        );
        listView.setAdapter(listviewAdapter);

        return rootView;

    }
}

