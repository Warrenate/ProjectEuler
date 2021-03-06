package ie.cathalcoffey.android.projecteuler;

import ie.cathalcoffey.android.projecteuler.LoginLogout.LoginOperation;
import ie.cathalcoffey.android.projecteuler.PageFragment.SolveOperation;

import java.util.Hashtable;
import java.util.Vector;

import org.holoeverywhere.app.Application;
import org.holoeverywhere.app.Fragment;

import android.content.SharedPreferences;
import android.content.res.Configuration;

public class MyApplication extends Application 
{
	public static int COUNT_ALL = 0;
	public static int COUNT_SOLVED = 0;
	
	static ProjectEulerClient updater_pec;
	static ProjectEulerClient pec;
	static Vector<Fragment> fragments;
	static String display_text;
	static String filter_text;
	
	static SharedPreferences settings;
	static SharedPreferences.Editor prefEditor;
	
	public static MyDataBaseHelper myDbHelper;
	
	static SolveOperation solve_opt;
	static LoginOperation login_opt;
	protected static boolean cancelUpdater;
	
	public static Hashtable<String, Boolean> stars;
	
	@Override
	public void onConfigurationChanged(Configuration newConfig) 
	{
		super.onConfigurationChanged(newConfig);
	}

	@Override
	public void onCreate() 
	{   
		super.onCreate();
	}
	
	@Override
	public void onLowMemory() 
	{
		super.onLowMemory();
	}

	@Override
	public void onTerminate() 
	{
		super.onTerminate();
	}
}