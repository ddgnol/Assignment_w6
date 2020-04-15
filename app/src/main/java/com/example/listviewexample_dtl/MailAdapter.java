package com.example.listviewexample_dtl;

import android.graphics.Color;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.RequiresApi;

import java.util.List;

import io.bloco.faker.Faker;

public class MailAdapter extends BaseAdapter {

    List<MailModel> mails;

    public MailAdapter(List<MailModel> mails) {
        this.mails = mails;
    }

    @Override
    public int getCount() {
        return mails.size();
    }

    @Override
    public Object getItem(int position) {
        return mails.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public View getView(final int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;

        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_item, viewGroup, false);
            viewHolder = new ViewHolder();
            viewHolder.textFullname = view.findViewById(R.id.text_fullname);
            viewHolder.textRound = view.findViewById(R.id.text_round);
            viewHolder.subject = view.findViewById(R.id.subject);
            viewHolder.content = view.findViewById(R.id.content);
            viewHolder.imageFavorite = view.findViewById(R.id.image_favorite);
            view.setTag(viewHolder);
        }
        else
            viewHolder = (ViewHolder) view.getTag();

        final MailModel mail = mails.get(i);
        viewHolder.textFullname.setText(mail.getFullname());
        viewHolder.textRound.setText(mail.getFullname().substring(0, 1));
        //viewHolder.textRound.setBackgroundColor(Color.parseColor(new Faker().color.hexColor()));
        viewHolder.subject.setText(mail.getSubject());
        viewHolder.content.setText(mail.getContent());
        if (mail.isSelected())
            viewHolder.imageFavorite.setImageResource(R.drawable.ic_star_favorite);
        else
            viewHolder.imageFavorite.setImageResource(R.drawable.ic_star_normal);

        viewHolder.imageFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean isSelected = mails.get(i).isSelected;
                mails.get(i).setSelected(!isSelected);
                notifyDataSetChanged();
            }
        });

        return view;
    }

    class ViewHolder {
        TextView textFullname;
        TextView textRound;
        TextView subject;
        TextView content;
        ImageView imageFavorite;
    }
}
