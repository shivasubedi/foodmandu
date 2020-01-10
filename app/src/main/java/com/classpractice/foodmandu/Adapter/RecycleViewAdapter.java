package com.classpractice.foodmandu.Adapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.classpractice.foodmandu.Model.Item;
import com.classpractice.foodmandu.R;
import com.classpractice.foodmandu.Url.Url;
import com.squareup.picasso.Picasso;

import java.util.List;
public class RecycleViewAdapter extends  RecyclerView.Adapter<RecycleViewAdapter.ItemViewHolder>{

    private Context mContext;
    private List<Item> itemList;

    public RecycleViewAdapter(Context mContext, List<Item> itemList) {
        this.mContext = mContext;
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view  = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_itemview,parent,false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        Item item = itemList.get(position);
        Picasso.get().load(Url.base_url+"/"+item.getImage()).into(holder.imageView);

        holder.textView.setText(item.getItemName());
        holder.textView2.setText("Rs. "+item.getPrice());
        holder.textView4.setText(item.getDetail());
        holder.textView5.setText(item.getResturant());

    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public class  ItemViewHolder extends RecyclerView.ViewHolder{
        private ImageView imageView;
        private TextView textView, textView2,textView4,textView5;

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView= itemView.findViewById(R.id.imageView);
            textView=itemView.findViewById(R.id.textView);
            textView2=itemView.findViewById(R.id.textView2);
            textView4=itemView.findViewById(R.id.textView4);
            textView5=itemView.findViewById(R.id.textView5);
        }
    }


}
