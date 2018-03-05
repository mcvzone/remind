package jw.developer.com.remind.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

import jw.developer.com.remind.model.MainListItem;
import jw.developer.com.remind.view.MainListItemView;

/**
 * Created by neo on 2018-02-19.
 */

public class ListAdapter extends BaseAdapter {

    private List<MainListItem> list = new ArrayList();
    private Context context;

    public ListAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    public void addItem(MainListItem mliv){
        list.add(mliv);
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        MainListItemView mliv;

        if (view == null) {
            mliv = new MainListItemView(context);
        } else {
            mliv = (MainListItemView)view;
        }

        MainListItem mainListItem = list.get(i);
        mliv.setText(mainListItem.getItemName());

        return mliv;
    }
}
