/**
 * Copyright 2016 Stuart Kent
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.
 * <p/>
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package com.github.stkent.bugshaker.flow.email.screenshot;

import android.app.Activity;
import android.net.Uri;
import android.support.annotation.NonNull;

import rx.Observable;

public interface ScreenshotProvider {

	@NonNull
	Observable<Uri> getScreenshotUri(@NonNull final Activity activity);
	//need context
	//also needs a pair of a context and a uri (<pair)

}
