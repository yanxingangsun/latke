/*
 * Copyright (c) 2009-2019, b3log.org & hacpai.com
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
package org.b3log.latke.util;

import org.apache.commons.lang.time.DateFormatUtils;
import org.apache.commons.lang.time.DateUtils;
import org.testng.annotations.Test;

import java.util.Date;

/**
 * {@link Times} test case.
 *
 * @author <a href="http://88250.b3log.org">Liang Ding</a>
 * @version 1.0.0.0, Apr 1, 2019
 * @since 2.4.49
 */
public class TimesTestCase {

    @Test
    public void getMonthStartTime() {
        final long now = System.currentTimeMillis();
        final long monthStartTime = Times.getMonthStartTime(now);
        final String pattern = "yyyyMMdd HH:mm:ss";
        final String start = DateFormatUtils.format(monthStartTime, pattern);
        System.out.println(start);

        final Date lastMonth = DateUtils.addMonths(new Date(), -1);
        final long lastMonthStartTime = Times.getMonthStartTime(lastMonth.getTime());
        final String lastMonthStart = DateFormatUtils.format(lastMonthStartTime, pattern);
        System.out.println("last month start: " + lastMonthStart);
    }

    @Test
    public void getMonthEndTime() {
        final long now = System.currentTimeMillis();
        final long monthEndTime = Times.getMonthEndTime(now);
        final String pattern = "yyyyMMdd HH:mm:ss";
        final String end = DateFormatUtils.format(monthEndTime, pattern);
        System.out.println("end: " + end);

        final Date lastMonth = DateUtils.addMonths(new Date(), -1);
        final long lastMonthEndTime = Times.getMonthEndTime(lastMonth.getTime());
        final String lastMonthEnd = DateFormatUtils.format(lastMonthEndTime, pattern);
        System.out.println("last month end: " + lastMonthEnd);
    }
}
