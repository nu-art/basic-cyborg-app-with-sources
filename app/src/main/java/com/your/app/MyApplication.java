package com.your.app;

import android.app.Application;

import com.nu.art.cyborg.core.CyborgBuilder;
import com.nu.art.cyborg.core.CyborgBuilder.CyborgConfiguration;

public class MyApplication
	extends Application {

	@SuppressWarnings("unchecked")
	private final Class<ModulePack_HelloWorld>[] Modules = new Class[]{
		ModulePack_HelloWorld.class
	};

	@Override
	@SuppressWarnings("unchecked")
	public void onCreate() {
		super.onCreate();
		// Providing the first layout to preset once the application launches.
		CyborgBuilder.startCyborg(new CyborgConfiguration(this, R.layout.cyborgview__hello_world_stack, Modules));
	}
}
