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
package com.your.app.ui;

import android.view.View;

import com.nu.art.core.exceptions.runtime.ImplementationMissingException;
import com.nu.art.cyborg.annotations.ViewIdentifier;
import com.nu.art.cyborg.common.consts.ViewListener;
import com.nu.art.cyborg.core.CyborgController;
import com.nu.art.cyborg.core.CyborgStackController;
import com.nu.art.cyborg.core.stackTransitions.StackTransitions;
import com.nu.art.cyborg.core.stackTransitions.Transition;
import com.your.app.R;

/**
 * Created by TacB0sS on 06-Jul 2017.
 */

public class Controller_HelloWorldStack
	extends CyborgController {

	//	@ViewIdentifier(viewId = R.id.TV_AddSecondLayer,
	//									listeners = {
	//											ViewListener.OnClick,
	//											ViewListener.OnLongClick
	//									})
	//	TextView helloWorldTextView;

	@ViewIdentifier(viewId = {
		R.id.TV_AddSecondLayer1,
		R.id.TV_AddSecondLayer2
	},
	                listeners = {
		                ViewListener.OnClick,
		                ViewListener.OnLongClick
	                })
	View[] clickableViews;

	public Controller_HelloWorldStack() {
		super(R.layout.controller__hello_world_stack);
	}

	@Override
	public boolean onLongClick(View v) {
		CyborgStackController stackController = getControllerById(R.id.Tag_RootStack);
		stackController.createLayerBuilder()
		               .setControllerType(Controller_HelloWorld.class)
		               .setTransitionDuration(2000)
		               .setTransitions(StackTransitions.SlideL2R)
		               .build();
		return true;
	}

	@Override
	public void onClick(View v) {
		Transition animation;
		switch (v.getId()) {
			case R.id.TV_AddSecondLayer1:
				animation = StackTransitions.SlideL2R;
				break;

			case R.id.TV_AddSecondLayer2:
				animation = StackTransitions.SlideT2B;
				break;

			default:
				throw new ImplementationMissingException("Unhandled view click event...");
		}

		CyborgStackController stackController = getControllerById(R.id.Tag_RootStack);
		stackController.createLayerBuilder().setControllerType(Controller_HelloWorld.class).setTransitions(animation).setTransitionDuration(600).build();
	}
}
