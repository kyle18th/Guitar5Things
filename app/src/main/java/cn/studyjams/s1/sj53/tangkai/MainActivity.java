package cn.studyjams.s1.sj53.tangkai;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public int getLayoutResId() {
        return R.layout.activity_main;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_about) {
            startActivity(new Intent(this, AboutActivity.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void development(View view) {
        startActivity(new Intent(this, DevelopmentActivity.class));
    }

    public void category(View view) {
        startActivity(new Intent(this, CategoryActivity.class));
    }

    public void structure(View view) {
        startActivity(new Intent(this, StructureActivity.class));
    }

    public void style(View view) {
        startActivity(new Intent(this, StyleActivity.class));
    }

    public void skill(View view) {
        startActivity(new Intent(this, SkillActivity.class));
    }

}
