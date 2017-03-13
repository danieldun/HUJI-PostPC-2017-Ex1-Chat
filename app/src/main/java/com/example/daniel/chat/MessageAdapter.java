package com.example.daniel.chat;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Daniel on 10/03/2017.
 */

public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.MyViewHolder> {

    private ArrayList<Message> msgList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView msg;
        public TextView time;

        public MyViewHolder(View view) {
            super(view);
            msg = (TextView) view.findViewById(R.id.bubble_message);
            time = (TextView) view.findViewById(R.id.time_text);
        }
    }

    public MessageAdapter(ArrayList<Message>msgList) {
        this.msgList = msgList;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Message m = msgList.get(position);
        holder.msg.setText(m.text_sent);
        holder.time.setText(String.valueOf(m.time_sent));
    }

    @Override
    public int getItemCount() {
        return msgList.size();
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recyclerview_item,parent, false);
        return new MyViewHolder(v);
    }

    public void addItemToList(Message item){
        msgList.add(item);
        notifyDataSetChanged();
    }
    public void clearList(){
        msgList.clear();
        notifyDataSetChanged();
    }
}
