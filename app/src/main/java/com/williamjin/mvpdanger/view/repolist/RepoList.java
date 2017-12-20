package com.williamjin.mvpdanger.view.repolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.williamjin.mvpdanger.R;
import com.williamjin.mvpdanger.model.Repo;

import java.util.List;

public class RepoList extends AppCompatActivity implements RepoListContract.View{

    private static final String TAG = "RepoListTag";
    private TextView textView;
    private EditText etFirstName;
    private EditText etLastName;
    RepoListPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.tv_fullName);
        etFirstName = findViewById(R.id.etFirstName);
        etLastName = findViewById(R.id.etLastName);

        Log.d(TAG, "onCreate: ");

        presenter = new RepoListPresenter();
        presenter.attachView(this);
    }

    public void addFullName(View view) {
//        Log.d(TAG, "addFullName: ");
//        String firstName = etFirstName.getText().toString();
//        String lastName = etLastName.getText().toString();
//
//        presenter.getFullName(firstName, lastName);
        presenter.getRepos("jinsongwei");
    }

    @Override
    public void showError(String error) {
        Log.d(TAG, "showError: ");
        Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void setFullName(String fullName) {
        Log.d(TAG, "setFullName: ");
        textView.setText(fullName);
    }

    @Override
    public void setRepos(List<Repo> repos) {
        for(Repo r : repos){
            Log.d(TAG, "setRepos: " + r.getFullName());
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ");
        presenter.detachView();
    }
}
