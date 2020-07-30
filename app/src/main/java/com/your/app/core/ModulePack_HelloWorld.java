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

import com.nu.art.modular.core.ModulesPack;
import com.your.app.modules.Module_HelloWorld;

@SuppressWarnings("unchecked")
public class ModulePack_HelloWorld
		extends ModulesPack {

	private static final Class[] Modules = {
			Module_HelloWorld.class,
	};

	private ModulePack_HelloWorld() {
		super(Modules);
	}

	@Override
	protected void init() {
		// You can get any module declared in the constructor and PRE-CONFIGURE it before it is initialized.
	}

	@Override
	protected void postInit() {
		// You can get any module declared in the constructor and POST-CONFIGURE after it has initialized.
	}
}
