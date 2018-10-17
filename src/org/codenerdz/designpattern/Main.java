package org.codenerdz.designpattern;

public class Main {
	public static void main (String[] arg)
	{
		FactoryClass fs = new FactoryClass();
		fs.getInstance("Android").printOperatingSystemName();
	}
}
