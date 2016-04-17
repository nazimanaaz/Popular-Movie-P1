package org.codeselect.movieproject1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.codeselect.model.Movie;

public class MainActivity extends AppCompatActivity implements MovieListFragment.ShowDetailListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, MovieListFragment.getInstance(), null)
                    .commit();
        }

    }

    @Override
    public void onShowDetail(Movie item) {
            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra(DetailActivity.EXTRA_DATA, item);
            startActivity(intent);
    }
}
