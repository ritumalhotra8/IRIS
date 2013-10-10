package com.temenos.interaction.sdk.entity;

/*
 * #%L
 * interaction-sdk
 * %%
 * Copyright (C) 2012 - 2013 Temenos Holdings N.V.
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * #L%
 */


import java.util.ArrayList;
import java.util.List;

/**
 * This class holds information about an entity
 */
public class EMEntity {
	private String name;
	private List<EMProperty> properties = new ArrayList<EMProperty>();

	public EMEntity(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public List<EMProperty> getProperties() {
		return properties;
	}

	public void addProperty(EMProperty property) {
		properties.add(property);
	}
}
