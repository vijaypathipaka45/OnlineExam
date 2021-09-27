package com.posidex.test;

public class Emp implements Comparable<Emp> {
String ename;
int id;



@Override
public String toString() {
	return "Emp [ename=" + ename + ", id=" + id + "]";
}
@Override
public int compareTo(Emp o) {
	return Integer.compare(ename.hashCode(), o.ename.hashCode());
}
}
