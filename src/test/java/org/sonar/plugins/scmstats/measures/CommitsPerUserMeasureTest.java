/*
 * Sonar SCM Stats Plugin
 * Copyright (C) 2012 Patroklos PAPAPETROU
 * dev@sonar.codehaus.org
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02
 */

package org.sonar.plugins.scmstats.measures;

import java.util.HashMap;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;
import org.sonar.plugins.scmstats.model.CommitsList;
public class CommitsPerUserMeasureTest {
  

  @Test
  public void testInit() {
    CommitsPerUserMeasure measure = 
            new CommitsPerUserMeasure(ScmStatsMetrics.SCM_COMMITS_PER_USER,
            new HashMap<String, CommitsList>(), null);
    assertThat(measure.getDataMap().size(), is(0));
  }
}
