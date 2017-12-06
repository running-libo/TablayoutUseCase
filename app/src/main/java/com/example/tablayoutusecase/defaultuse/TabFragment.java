package com.example.tablayoutusecase.defaultuse;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.tablayoutusecase.R;
import com.zhy.adapter.recyclerview.CommonAdapter;
import com.zhy.adapter.recyclerview.base.ViewHolder;
import java.util.Arrays;

public class TabFragment extends Fragment {
    private String[] nameDatas = new String[]{"智能","红润","日系","自然","艺术黑白","甜美","蜜粉","清新","夏日阳光","唯美","蜜粉",};
    private RecyclerView recyclerView;
    private CommonAdapter<String> adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab, container, false);
        init(view);
        return view;
    }

    private void init(View view) {
        recyclerView = view.findViewById(R.id.rv);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),2));
        adapter = new CommonAdapter<String>(getActivity(),R.layout.item, Arrays.asList(nameDatas)) {
            @Override
            protected void convert(ViewHolder holder, String s, int position) {}
        };
        recyclerView.setAdapter(adapter);
    }

}
