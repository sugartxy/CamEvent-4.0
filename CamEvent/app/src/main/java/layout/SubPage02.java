package layout;


import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;


import java.util.ArrayList;

import ca.uwaterloo.camevent.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link SubPage02.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link SubPage02#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SubPage02 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private SubPage02.OnFragmentInteractionListener mListener;

    public SubPage02() {
        // Required empty public constructor
    }
    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SubPage03.
     */
    // TODO: Rename and change types and number of parameters
    public static SubPage02 newInstance(String param1, String param2) {
        SubPage02 fragment = new SubPage02();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }
    private ArrayList<String> arrayList;
    private ArrayAdapter<String> adapter;
    private EditText txtInput;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sub_page02, container,false);
        String[] menuItems={"Apple","Banana","Grape"};
        ListView listView=(ListView) view.findViewById(R.id.listv);
        ArrayAdapter<String> listviewAdapter=new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
        menuItems
        );
        listView.setAdapter(listviewAdapter);
        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event


    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
