package openull.com.dailyqt.ui.main;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import openull.com.dailyqt.R;
import openull.com.dailyqt.model.Content;

/**
 * Created by eastroots92 on 2018-03-23.
 */

class ContentAdapter extends RecyclerView.Adapter<ContentAdapter.ViewHolder> {
    List<Content> contents;

    public ContentAdapter(List<Content> contents) {
        this.contents = contents;
    }

    @Override
    public ContentAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_contents, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ContentAdapter.ViewHolder holder, int position) {
        holder.item_title.setText(contents.get(position).getTitle());
        holder.item_startBible.setText(contents.get(position).getStartBible());
        holder.item_startChapter.setText(contents.get(position).getStartChapter());
        holder.item_startVers.setText(contents.get(position).getStartVers());
        holder.item_finishBible.setText(contents.get(position).getFinishBible());
        holder.item_finishChapter.setText(contents.get(position).getFinishChapter());
        holder.item_finishVers.setText(contents.get(position).getFinishVers());
    }

    @Override
    public int getItemCount() {
//      TODO : String이던 객체던 여기에 총 사이즈 넣어주기
        return contents.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
//        TODO : item 레이아웃에 값 넣을 것 있으면 여기서 넣어주ㄴ면 됨

        TextView item_title;
        TextView item_startBible;
        TextView item_startChapter;
        TextView item_startVers;
        TextView item_finishBible;
        TextView item_finishChapter;
        TextView item_finishVers;

        public ViewHolder(View itemView) {
            super(itemView);

            item_title = itemView.findViewById(R.id.item_title);
            item_startBible = itemView.findViewById(R.id.item_startBible);
            item_startChapter = itemView.findViewById(R.id.item_startChapter);
            item_startVers = itemView.findViewById(R.id.item_startVers);
            item_finishBible = itemView.findViewById(R.id.item_finishBible);
            item_finishChapter = itemView.findViewById(R.id.item_finishChapter);
            item_finishVers = itemView.findViewById(R.id.item_finishVers);

        }
    }
}
