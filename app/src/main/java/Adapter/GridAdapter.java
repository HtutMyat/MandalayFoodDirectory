package Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.htutmyat.mdyfooddirectory.R;

/**
 * Created by mac on 12/7/14.
 */
public class GridAdapter extends ArrayAdapter<String>{

  public GridAdapter(Context context,String[] item)
  {
    super(context, R.layout.category_layout,item);
  }

  @Override public View getView(int position, View convertView, ViewGroup parent) {

    final ViewHolder myViewHolder;

    if(convertView == null)
    {
     myViewHolder=new ViewHolder();
      convertView=LayoutInflater.from(getContext()).inflate(R.layout.category_layout,parent,false);
      myViewHolder.mTextView=(TextView)convertView.findViewById(R.id.categoryView);
      convertView.setTag(myViewHolder);
    }
    else {
      myViewHolder=(ViewHolder)convertView.getTag();

    }
    myViewHolder.mTextView.setText(getItem(position));
    //return super.getView(position, convertView, parent);
    return convertView;
  }
  public class ViewHolder{

    public TextView mTextView;

  }
}

