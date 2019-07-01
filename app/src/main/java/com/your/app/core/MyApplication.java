package com.your.app.core;

import android.app.Application;

import com.nu.art.cyborg.core.CyborgBuilder;
import com.nu.art.cyborg.core.CyborgBuilder.CyborgConfiguration;
import com.your.app.R;

public class MyApplication
	extends Application {

	@SuppressWarnings("unchecked")
	private final Class<ModulePack_HelloWorld>[] Modules = new Class[]{
		ModulePack_HelloWorld.class
	};

	@Override
	public void onCreate() {
		super.onCreate();
		// Providing the first layout to preset once the application launches.
		CyborgConfiguration configuration = new CyborgConfiguration(this).setLaunchConfiguration(R.layout.cyborgview__hello_world_stack).setModulesPacks(Modules);
		CyborgBuilder.startCyborg(configuration);
	}
}
