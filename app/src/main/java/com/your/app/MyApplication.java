package com.your.app;

import android.app.Application;

import com.nu.art.cyborg.core.CyborgBuilder;
import com.nu.art.cyborg.core.CyborgBuilder.CyborgConfiguration;
import com.nu.art.cyborg.tutorial.helloWorld.R;

public class MyApplication
		extends Application {

	@SuppressWarnings("unchecked")
	private final Class<MyModulePack>[] Modules = new Class[]{
			MyModulePack.class
	};

	@Override
	@SuppressWarnings("unchecked")
	public void onCreate() {
		super.onCreate();
		// Providing the first layout to preset once the application launches.
		CyborgBuilder.startCyborg(new CyborgConfiguration(this, R.layout.activity__hello_world, Modules));
	}
}
