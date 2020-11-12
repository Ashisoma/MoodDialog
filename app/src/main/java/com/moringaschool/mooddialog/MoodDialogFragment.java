package com.moringaschool.mooddialog;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MoodDialogFragment extends DialogFragment {


//    Button moodButton = (Button) .findViewById(R.id.cancelButton);
//    Button submitButton = (Button) rootView.findViewById(R.id.submitButton);


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){
        View rootView = inflater.inflate(R.layout.fragment_mood_dialog, container, false);
        getDialog().setTitle("Simple Dialog");
        Button cancelButton = (Button) rootView.findViewById(R.id.cancelButton);
        Button submitButton = (Button) rootView.findViewById(R.id.submitButton);

            RadioGroup surveyRadioGroup = (RadioGroup) rootView.findViewById(R.id.moodRadioGroup);// pull the button group
        int selectedId = surveyRadioGroup.getCheckedRadioButtonId();//get selected radio button
        final RadioButton selectedRadioButton = (RadioButton) rootView.findViewById(selectedId);// get radio button values via ID


        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("testing", selectedRadioButton.getText().toString());
                dismiss();
            }
        });

        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });
        return rootView;
    }

}
