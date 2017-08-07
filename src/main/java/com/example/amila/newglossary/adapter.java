package com.example.amila.newglossary;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by AMILA on 8/7/2017.
 */

public class adapter extends ArrayAdapter<String> {
    String[] englishName;
    String[] sinhalaName;
    Context c;
    LayoutInflater inflater;
    public adapter(Context context, String[] englishName,String[] sinhalaName) {
        super(context, R.layout.custom_row,englishName);
    this.c=context;
        this.englishName=englishName;
        this.sinhalaName=sinhalaName;

    }
public class ViewHolder{

    TextView englishTv;
    TextView sinhalaTv;
}

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.custom_row, null);
        }
final ViewHolder holder=new ViewHolder();
        holder.englishTv=(TextView)convertView.findViewById(R.id.rowTitle);
        holder.sinhalaTv=(TextView)convertView.findViewById(R.id.rowSubtitle);

        holder.englishTv.setText(englishName[position]);
        holder.sinhalaTv.setText(sinhalaName[position]);
        return convertView;
    }
}
