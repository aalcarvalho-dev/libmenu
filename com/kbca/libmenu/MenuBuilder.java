package com.kbca.libmenu;
public class MenuBuilder{
	Menu menu;

	public MenuBuilder(String nomeApp){
		menu = new Menu(nomeApp);
	}

	public MenuBuilder comItemMenu(ItemMenu itemMenu){
		menu.addItem(itemMenu);
		return this;
	}

	public Menu build(){
		return menu;
	}
}
