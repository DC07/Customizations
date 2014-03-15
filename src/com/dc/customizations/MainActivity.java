package com.dc.customizations;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuInflater;
import com.viewpagerindicator.PageIndicator;
import com.viewpagerindicator.TitlePageIndicator;

public class MainActivity extends FragmentActivity
{
  int Number = 0;
  FragmentAdapter mAdapter;
  PageIndicator mIndicator;
  ViewPager mPager;

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903040);
    this.mAdapter = new FragmentAdapter(getSupportFragmentManager());
    this.mPager = ((ViewPager)findViewById(2130968582));
    this.mPager.setAdapter(this.mAdapter);
    this.mIndicator = ((TitlePageIndicator)findViewById(2130968581));
    this.mIndicator.setViewPager(this.mPager);
  }

  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(2131427328, paramMenu);
    return true;
  }
}

/* Location:           C:\Users\Devesh\Desktop\XDA@Work\java decompiler\f\classes_dex2jar.jar
 * Qualified Name:     com.example.viewpagertest.MainActivity
 * JD-Core Version:    0.6.2
 */