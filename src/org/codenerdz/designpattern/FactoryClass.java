package org.codenerdz.designpattern;

public class FactoryClass {
	public OperatingSystem getInstance(String type)
	{
		if(type.equals("Android"))
		{
			return new Android();
		}
		return new Windows();
	}
}
