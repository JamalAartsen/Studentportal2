package com.example.student_portal;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.List;

import static android.support.v4.app.ActivityCompat.startActivityForResult;

public class PortalAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {


    List<Portal> mListPortal;

    public PortalAdapter( List<Portal> mListPortal) {

        this.mListPortal = mListPortal;
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View row = inflater.inflate(R.layout.content_row, viewGroup, false);
        portalViewHolder viewHolder = new portalViewHolder(row);

        return viewHolder;
    }

    //Goes to PortalWebview acivity and gives the url to the webview.
//    public void webView(String url) {
//        Intent intent = new Intent(context, PortalWebView.class);
//        intent.putExtra("urlName", url);
//        context.startActivity(intent);
//    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

        final Portal portal = mListPortal.get(i);
        ((portalViewHolder)viewHolder).textView.setText(portal.getNameTitle());

    }

    @Override
    public int getItemCount() {
        return mListPortal.size();
    }

    public class portalViewHolder extends RecyclerView.ViewHolder {
        TextView textView;

        public portalViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.item);
        }
    }
}
