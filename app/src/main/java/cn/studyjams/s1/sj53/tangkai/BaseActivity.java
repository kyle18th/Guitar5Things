package cn.studyjams.s1.sj53.tangkai;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public abstract class BaseActivity extends AppCompatActivity {

    /**
     * toolbar
     */
    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResId());
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
    }

    /***
     * get the layout resource id
     *
     * @return layout resource id
     */
    public abstract int getLayoutResId();

    /***
     * start a activity
     *
     * @param clazz the class of activity
     */
    public void startActivity(Class<?> clazz) {
        startActivity(new Intent(this, clazz));
    }

}
