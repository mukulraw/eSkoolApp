package eskool.com.eskoolapp.ExamAndResults;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import eskool.com.eskoolapp.R;

/**
 * Created by user on 5/9/2017.
 */

public class ExamfrgmntTwo extends Fragment{
    public ExamfrgmntTwo() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.exam_result_2, container, false);

        return view;

    }
}

