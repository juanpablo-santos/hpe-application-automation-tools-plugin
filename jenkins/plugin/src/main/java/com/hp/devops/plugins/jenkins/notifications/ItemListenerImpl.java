package com.hp.devops.plugins.jenkins.notifications;

import hudson.Extension;
import hudson.model.Item;
import hudson.model.listeners.ItemListener;

/**
 * Created with IntelliJ IDEA.
 * User: gullery
 * Date: 24/08/14
 * Time: 17:21
 * To change this template use File | Settings | File Templates.
 */
@Extension
public final class ItemListenerImpl extends ItemListener {

	public void onRenamed(Item item, String oldName, String newName) {
		System.out.println("Renamed for: " + oldName + " => " + newName);
	}
}
