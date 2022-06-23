/*
 * Copyright 2020-2022 Exactpro (Exactpro Systems Limited)
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

package com.exactpro.th2.act;

import com.exactpro.th2.act.configuration.CustomConfiguration;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TestUIActConfiguration extends CustomConfiguration {

	@JsonProperty("act_url")
	private String url;
	@JsonProperty("rpt_provider_rest_api_host")
	private String apiHost;
	@JsonProperty("rpt_provider_rest_api_path")
	private String apiBasePath;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getApiHost() {
		return apiHost;
	}
	public String getApiBasePath() {
		return apiBasePath;
	}
}
