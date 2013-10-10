package com.temenos.interaction.sdk.interaction.state;

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


import java.util.Set;

public interface IMAction {

	/**
	 * Indicates whether a state has link relations
	 * @return true or false
	 */
	public boolean hasRelations();

	/**
	 * Returns the link relations
	 * @return link relations
	 */
	public String getRelations();
	
	/**
	 * Indicates if a state has actions
	 * @return true or false
	 */
	public boolean hasActions();
	
	/**
	 * Returns the actions
	 * @return actions
	 */
	public Set<String> getActions();	
}
