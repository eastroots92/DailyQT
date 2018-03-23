package openull.com.dailyqt.ui.main;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import openull.com.dailyqt.R;

/**
 * Created by eastroots92 on 2018-03-23.
 */

class ContentAdapter extends RecyclerView.Adapter<ContentAdapter.ViewHolder> {
    ArrayList<String> contents;

    public ContentAdapter(ArrayList<String> contents) {
        this.contents = contents;
    }

    @Override
    public ContentAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_contents, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ContentAdapter.ViewHolder holder, int position) {
        holder.item_title.setText(contents.get(position));

    }

    @Override
    public int getItemCount() {
//      TODO : String이던 객체던 여기에 총 사이즈 넣어주기
        return contents.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
//        TODO : item 레이아웃에 값 넣을 것 있으면 여기서 넣어주ㄴ면 됨

        TextView item_title;

        public ViewHolder(View itemView) {
            super(itemView);

            item_title = itemView.findViewById(R.id.item_title);

        }
    }
}
