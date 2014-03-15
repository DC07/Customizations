package com.dc.customizations;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import com.viewpagerindicator.IconPagerAdapter;

public class FragmentAdapter extends FragmentStatePagerAdapter
  implements IconPagerAdapter
{
  public FragmentAdapter(FragmentManager paramFragmentManager)
  {
    super(paramFragmentManager);
  }

  public int getCount()
  {
    return 3;
  }

  public int getIconResId(int paramInt)
  {
    return 0;
  }

  public Fragment getItem(int paramInt)
  {
    FirstActivity localFirstActivity = new FirstActivity();
    switch (paramInt)
    {
    default:
      return localFirstActivity;
    case 0:
      return new FirstActivity();
    case 1:
      return new SecondActivity();
    case 2:
    }
    return new ThirdActivity();
  }

  public CharSequence getPageTitle(int paramInt)
  {
    switch (paramInt)
    {
    default:
      return "";
    case 0:
      return "System Stats";
    case 1:
      return "Tools";
    case 2:
    }
    return "Hub";
  }
}
