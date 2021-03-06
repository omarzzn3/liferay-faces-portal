/**
 * Copyright (c) 2000-2017 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
package com.liferay.faces.site.service;

import java.util.List;
import java.util.Map;

import com.liferay.faces.site.dto.Archetype;
import com.liferay.faces.site.dto.Build;
import com.liferay.faces.site.dto.Suite;


/**
 * @author  Vernon Singleton
 */
public interface ArchetypeService {

	public List<Archetype> getArchetypes();

	public List<Build> getBuilds();

	public List<String> getJsfVersions();

	public List<String> getLiferayVersions();

	public List<Suite> getSuites();

	public void init(Map<String, String> contextParameterMap);
}
