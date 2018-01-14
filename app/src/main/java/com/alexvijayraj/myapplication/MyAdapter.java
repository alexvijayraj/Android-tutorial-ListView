package com.alexvijayraj.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Alex vijay raj on 1/14/2018.
 */

public class MyAdapter extends BaseAdapter {

    int[] drawable = { R.drawable.chicken_65, R.drawable.prawn_fry, R.drawable.tandoori_chicken,
            R.drawable.mutton_biryani, R.drawable.chicken_biryani, R.drawable.mango_icecream};

    String[] menu = { "Chicken 65", "Prawn fry", "Tandoori Chicken",
            "Mutton Biryani", "Chicken Biryani", "Mango ice cream"};

    String[] price = { "$8.99", "$14.99", "12.99",
            "12.99", "9.99", "4.99"};

    private final Context context;

    public MyAdapter(Context context){
        this.context = context;
    }

    @Override
    public int getCount() {
        return menu.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater li = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        view = li.inflate(R.layout.menu_item, null);

        TextView tvItemName = (TextView)view.findViewById(R.id.tvItemName);
        TextView tvItemPrice = (TextView)view.findViewById(R.id.tvItemPrice);
        ImageView ivItem = (ImageView) view.findViewById(R.id.ivItem);

        ivItem.setImageResource(drawable[i]);

        tvItemName.setText(menu[i]);
        tvItemPrice.setText(price[i]);

        return view;
    }
}
