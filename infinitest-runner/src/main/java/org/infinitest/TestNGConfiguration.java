/*
 * This file is part of Infinitest.
 *
 * Copyright (C) 2011
 * "Matthias Droste" <matthias.droste@googlemail.com>,
 * "Ben Rady" <benrady@gmail.com>,
 * "Rod Coffin" <rfciii@gmail.com>,
 * "Ryan Breidenbach" <ryan.breidenbach@gmail.com>, et al.
 *
 * Infinitest is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Infinitest is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Infinitest.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.infinitest;

import java.util.ArrayList;
import java.util.List;

import org.testng.xml.XmlSuite;

/** Provides testNG-settings. Just a data-provider, no logic here. */
public class TestNGConfiguration
{
    private String excludedGroups;
    private String groups;
    private List<XmlSuite> suite;
    private List<Object> listeners;

    public void setExcludedGroups(String excludedGroups)
    {
        this.excludedGroups = excludedGroups;
    }

    public String getExcludedGroups()
    {
        return excludedGroups;
    }

    public void setGroups(String groupList)
    {
        groups = groupList;
    }

    public String getGroups()
    {
        return groups;
    }

    public List<XmlSuite> getSuite()
    {
        return suite;
    }

    public void setSuite(XmlSuite suite)
    {
        List<XmlSuite> suites = new ArrayList<XmlSuite>();
        suites.add(suite);
        this.suite = suites;
    }

    public List<Object> getListeners()
    {
        return listeners;
    }

    public void setListeners(List<Object> listenerList)
    {
        listeners = listenerList;

    }
}
