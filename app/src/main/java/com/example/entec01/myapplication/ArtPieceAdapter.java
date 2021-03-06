package com.example.entec01.myapplication;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;


/**
 * Created by Entec01 on 2/7/2018.
 */

public class ArtPieceAdapter extends RecyclerView.Adapter <ArtPieceAdapter.ViewHolder> {

    private List<ArtPiece> artPieceList;
    private Context context;

    public ArtPieceAdapter(List<ArtPiece> artPieceList, Context context) {
        this.artPieceList = artPieceList;
        this.context = context;
    }
//inflates the rows and returns a holder
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View rowView = inflater.inflate(R.layout.art_piece_row, parent, false);

        ViewHolder artPieceViewHolder = new ViewHolder(rowView);
        return null;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        ArtPiece artPiece = artPieceList.get(position);
        holder.NameTextView.setText ( artPiece.getName());
        holder.ArtistTextView.setText ( artPiece.getArtist());
        holder.YearTextView.setText ( artPiece.getYear());
    }

    @Override
    public int getItemCount() {
        return artPieceList.size();
    }

    //holds all the field in one row
    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView NameTextView;
        public TextView ArtistTextView;
        public TextView YearTextView;
        public Button CheckItOutButtonButton;

        public ViewHolder(View itemView) {
            super(itemView);
            NameTextView = (TextView) itemView.findViewById(R.id.NameTextView);
            ArtistTextView = (TextView) itemView.findViewById(R.id.ArtistTextView);
            YearTextView = (TextView) itemView.findViewById(R.id.YearTextView);
            CheckItOutButtonButton = (Button) itemView.findViewById(R.id.CheckItOutButtonButton);

        }
    }

}