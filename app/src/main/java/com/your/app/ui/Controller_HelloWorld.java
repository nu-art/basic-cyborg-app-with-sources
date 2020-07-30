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
import android.widget.TextView;

import com.nu.art.cyborg.annotations.ViewIdentifier;
import com.nu.art.cyborg.common.consts.ViewListener;
import com.nu.art.cyborg.core.CyborgController;
import com.your.app.R;

/**
 * Created by TacB0sS on 12-May 2017.
 */

public class Controller_HelloWorld
	extends CyborgController {

	private static int index;

	// Inject view and set an OnLongClickListener and an OnClickListener.
	@ViewIdentifier(viewId = R.id.HelloWorld,
	                listeners = {
		                ViewListener.OnLongClick,
		                ViewListener.OnClick
	                })
	TextView helloWorldTextView;

	public Controller_HelloWorld() {
		super(R.layout.controller__hello_world);
	}

	@Override
	protected void onCreate() {

		helloWorldTextView.setText("Hello World " + index++);
		super.onCreate();
	}

	@Override
	public void onClick(View v) {
		String text = helloWorldTextView.getText() + "-";
		helloWorldTextView.setText(text);
		super.onClick(v);
	}

	@Override
	public boolean onLongClick(View v) {
		String text = helloWorldTextView.getText() + "+";
		helloWorldTextView.setText(text);
		return true;
	}

	@Override
	protected void onResume() {
		super.onResume();
	}
}
