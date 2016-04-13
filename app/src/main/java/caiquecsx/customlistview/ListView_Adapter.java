package caiquecsx.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by kaah on 03/01/2016.
 */
public final class ListView_Adapter extends ArrayAdapter<String> {

    private int layoutResource;

    public ListView_Adapter(Context context, int layoutResource, String[] threeStringsList) {
        super(context, layoutResource, threeStringsList);
        this.layoutResource = layoutResource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = convertView;

        if (view == null) {
            LayoutInflater layoutInflater = LayoutInflater.from(getContext());
            view = layoutInflater.inflate(layoutResource, null);
        }

        String s = getItem(position);

        if (s != null) {
            TextView leftTextView = (TextView) view.findViewById(R.id.textView1);

            if (leftTextView != null) {
                leftTextView.setText(s);
            }

        }

        return view;
    }
}