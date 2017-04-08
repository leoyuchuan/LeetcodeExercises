package com.leoyuchuan.leetcode.mergeintervals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
	public List<Interval> merge(List<Interval> intervals) {
		if (intervals.size() <= 1) {
			return intervals;
		}

		ArrayList<Interval> output = new ArrayList<>();

		Collections.sort(intervals, new Comparator<Interval>() {
			@Override
			public int compare(Interval o1, Interval o2) {
				if (o1.start == o2.start) {
					return o1.end - o2.end;
				}
				return o1.start - o2.start;
			}
		});

		for (int i = 0; i < intervals.size() - 1; i++) {
			Interval interval1 = intervals.get(i);
			Interval interval2 = intervals.get(i + 1);

			if (interval1.end < interval2.start) {
				output.add(interval1);
				if (i == intervals.size() - 2) {
					output.add(interval2);
				}
			} else {
				interval2.start = interval1.start;
				interval2.end = Math.max(interval1.end, interval2.end);
				if (i == intervals.size() - 2) {
					output.add(interval2);
				}
			}
		}
		return output;
	}
}

class Interval {
	int start;
	int end;

	Interval() {
		start = 0;
		end = 0;
	}

	Interval(int s, int e) {
		start = s;
		end = e;
	}
}