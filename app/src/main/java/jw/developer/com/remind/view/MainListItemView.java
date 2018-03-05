package jw.developer.com.remind.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

import jw.developer.com.remind.R;

/**
 * Created by neo on 2018-02-19.
 */

public class MainListItemView extends LinearLayout {
    TextView mainListItemText;

    public MainListItemView(Context context) {
        super(context);
        init(context);
    }

    public MainListItemView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context){
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.view_main_list_item, this, true);
        mainListItemText = findViewById(R.id.mainListItemText);
    }

    public void setText(String sName){
        mainListItemText.setText(sName);
    }
}
