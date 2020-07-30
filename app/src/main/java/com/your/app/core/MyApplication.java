/*
 * cyborg-core is an extendable module based framework for Android.
 *
 * Copyright (C) 2018  Adam van der Kruk aka TacB0sS
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
