https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder
package edu.monash.fit2099.demo.mars;

import edu.monash.fit2099.engine.Action;
import edu.monash.fit2099.engine.Item;

public class MartianItem extends Item{

	public MartianItem(String name, char displayChar, boolean portable) {
		super(name, displayChar, portable);
	}
	
	public void addAction(Action action) {
		this.allowableActions.add(action);
	}
}
