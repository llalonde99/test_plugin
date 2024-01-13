package com.bosshealth;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class bosshealthPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(bosshealthPlugin.class);
		RuneLite.main(args);
	}
}
